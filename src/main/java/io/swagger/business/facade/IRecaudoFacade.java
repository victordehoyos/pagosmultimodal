package io.swagger.business.facade;

import io.swagger.model.Card;

public interface IRecaudoFacade {
	
	public Card createCard();
	
	public Card getCardInfo(String cardNumber);
	
	public Card updateCard(Card card);
	

}
