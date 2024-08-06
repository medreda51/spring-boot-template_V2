package es.nextdigital.demo.service;

import es.nextdigital.demo.entity.Card;

public interface CardService {

	Card activateCard(Long cardId);

	Card changePin(Long cardId, String newPin);

	Card updateCardLimit(Long cardId, double newLimit);

}