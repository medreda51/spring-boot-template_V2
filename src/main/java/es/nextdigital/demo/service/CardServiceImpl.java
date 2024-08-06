package es.nextdigital.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.nextdigital.demo.entity.Card;
import es.nextdigital.demo.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
	public Card activateCard(Long cardId) {
        Card card = cardRepository.findById(cardId).orElseThrow();
        card.setActive(true);
        return cardRepository.save(card);
    }

    @Override
	public Card changePin(Long cardId, String newPin) {
        Card card = cardRepository.findById(cardId).orElseThrow();
        card.setPin(newPin);
        return cardRepository.save(card);
    }

    @Override
	public Card updateCardLimit(Long cardId, double newLimit) {
        Card card = cardRepository.findById(cardId).orElseThrow();
        card.setLimit(newLimit);
        return cardRepository.save(card);
    }
}
