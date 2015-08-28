package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.exception.MNVException;

public interface IServiceModeration {
	IServiceSignalement getServiceSignalement() throws MNVException;
}
