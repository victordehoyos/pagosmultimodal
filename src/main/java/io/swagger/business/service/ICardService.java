package io.swagger.business.service;

import io.swagger.business.persistence.entity.Tarjeta;
import io.swagger.model.Card;

public interface ICardService {
	
	public Card createWithoutOwner();
	
	public Card findByNroTarjeta(String nroTarjeta);
	
	public Card updateCard(Card card);
	
	public Card convertEntityToModel(Tarjeta tarjeta);
	
	public Tarjeta convertModelToEntity(Card card);

}
