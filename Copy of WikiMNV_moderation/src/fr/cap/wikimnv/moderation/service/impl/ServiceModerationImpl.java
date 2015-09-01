package fr.cap.wikimnv.moderation.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.moderation.service.IServiceModeration;

public class ServiceModerationImpl implements IServiceModeration {
	
	private IServiceModeration serviceModeration;

	@Override
	public boolean publierArticle(Object keyArticle) throws MNVException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejeterArticle(Object keyArticle) throws MNVException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bannirUtilisateur(Object keyUser) throws MNVException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bannirCommentaire(Object keyCommentaire) throws MNVException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean archiverContenu(Object keyContenu) throws MNVException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Object> listerArticles(Class cl) {
		// TODO Auto-generated method stub
		return null;
	}

	public IServiceModeration getServiceModeration() {
		return serviceModeration;
	}

	public void setServiceModeration(IServiceModeration serviceModeration) {
		this.serviceModeration = serviceModeration;
	}

	@Override
	public Set<Object> publierArticles(Set<Object> Articles)
			throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

}
