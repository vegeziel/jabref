package tests.net.sf.jabref.imports;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for tests.net.sf.jabref.imports");
		//$JUnit-BEGIN$
		suite.addTestSuite(IsiImporterTest.class);
		suite.addTestSuite(BibtexParserTest.class);
		//$JUnit-END$
		return suite;
	}

}