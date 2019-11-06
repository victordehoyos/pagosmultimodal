package io.swagger.business.service.impl;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.business.persistence.entity.Tarjeta;
import io.swagger.business.persistence.entity.Usuario;
import io.swagger.business.persistence.repository.TarjetaRepository;
import io.swagger.business.service.ICardService;
import io.swagger.model.Card;
import io.swagger.model.User;

@Service
public class CardService implements ICardService {

	@Autowired
	private TarjetaRepository cRepository;

	@Override
	public Card createWithoutOwner() {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setActivo("SI");
		tarjeta.setSaldoDisponible(new Double(0));
		cRepository.save(tarjeta);

		tarjeta.setNroTarjeta(StringUtils.leftPad(String.valueOf(tarjeta.getIdTarjeta()), 13, "0"));
		cRepository.save(tarjeta);

		if (tarjeta != null && tarjeta.getIdTarjeta() != null) {
			Card card = new Card();
			card.setBalance(new BigDecimal(tarjeta.getSaldoDisponible()));
			card.setNumber(tarjeta.getNroTarjeta());
			card.setOwner(null);
			card.setStatus(tarjeta.getActivo().equals("SI") ? 1 : 0);

			return card;
		}

		return null;
	}

	@Override
	public Card findByNroTarjeta(String nroTarjeta) {
		Tarjeta tarjeta = cRepository.findByNroTarjeta(nroTarjeta);

		if (tarjeta != null) {
			return convertEntityToModel(tarjeta);
		}

		return null;
	}

	public Card updateCard(Card card) {
		Tarjeta tarjeta = cRepository.findByNroTarjeta(card.getNumber());
		
		if (tarjeta != null) {
			tarjeta.setSaldoDisponible((tarjeta.getSaldoDisponible() + 
					card.getBalance().doubleValue()));
			tarjeta.setActivo(card.getStatus() == 1 ? "SI" : "NO");
			
			Usuario usuario = tarjeta.getIdUsuario();
			if (usuario != null && card.getOwner() != null) {
				usuario.setNombre(card.getOwner().getFirstName());
				usuario.setApellido(card.getOwner().getLastName());
				usuario.setCorreoPrincipal(card.getOwner().getEmail());
				usuario.setTelefonoPrincipal(card.getOwner().getPhone());
				tarjeta.setIdUsuario(usuario);
			}
			cRepository.save(tarjeta);
			return convertEntityToModel(tarjeta);
		}
		
		return null;
	}

	@Override
	public Card convertEntityToModel(Tarjeta tarjeta) {
		Card card = new Card();

		if (tarjeta != null) {
			card.setBalance(new BigDecimal(tarjeta.getSaldoDisponible()));
			card.setNumber(tarjeta.getNroTarjeta());
			card.setStatus(tarjeta.getActivo().equals("SI") ? 1 : 0);

			Usuario usuario = tarjeta.getIdUsuario();
			if (usuario != null) {
				User user = new User();
				user.setFirstName(usuario.getNombre());
				user.setLastName(usuario.getApellido());
				user.setEmail(usuario.getCorreoPrincipal());
				user.setPhone(usuario.getTelefonoPrincipal());
				user.setUserStatus(1);
				card.setOwner(user);
			}

			return card;
		}
		return null;
	}

	@Override
	public Tarjeta convertModelToEntity(Card card) {
		// TODO Auto-generated method stub
		return null;
	}
}
