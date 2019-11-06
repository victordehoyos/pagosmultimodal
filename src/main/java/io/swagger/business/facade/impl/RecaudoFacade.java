package io.swagger.business.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.business.facade.IRecaudoFacade;
import io.swagger.business.service.ICardService;
import io.swagger.model.Card;

@Service
public class RecaudoFacade implements IRecaudoFacade {
	
	@Autowired
	private ICardService cardService;

	@Override
	public Card createCard() {
		return cardService.createWithoutOwner();
	}

	@Override
	public Card getCardInfo(String cardNumber) {
		return cardService.findByNroTarjeta(cardNumber);
	}

	@Override
	public Card updateCard(Card card) {
		return cardService.updateCard(card);
	}
	
	

}
