package fr.cap.wikimnv.moderation.service.impl;

import fr.cap.wikimnv.moderation.service.IServiceModeration;

public class ServiceModerationImpl implements IServiceModeration {
	
	private IServiceSignalement serviceSignalement;
	
	@Override
	public IServiceSignalement getServiceSignalement() {
		return serviceSignalement;
	}

	//@Override
	public void setServiceSignalement(IServiceSignalement serviceSignalement) {
		this.serviceSignalement = serviceSignalement;
	}	
}
