package fr.cap.wikimnv.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.cap.wikimnv.test.moderation.service.IServiceSignalementTest;
import fr.cap.wikimnv.test.moderation.service.IModerationTest;

@RunWith(Suite.class)
@SuiteClasses({IModerationTest.class, IServiceSignalementTest.class})
public class AllTests {

}
