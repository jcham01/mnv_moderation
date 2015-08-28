package fr.cap.wikimnv.test.moderation.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.moderation.service.IServiceModeration;
import fr.cap.wikimnv.moderation.service.IServiceSignalement;

public class IModerationTest {
	IServiceModeration serviceModeration;

	public IModerationTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		serviceModeration = (IServiceModeration) applicationContext.getBean("sModeration");
	}

	
	@Test
	public void testGetGSignalement() throws MNVException {

		IServiceSignalement gsig = serviceModeration.getServiceSignalement();

		if (gsig == null)
			throw new MNVException(33, "pas de getSignalement");
	}
}
