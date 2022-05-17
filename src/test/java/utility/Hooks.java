package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void before() {
		System.out.println("--- Creating Browser Instance --- ");
	}

	@After
	public void after() {
		System.out.println("--- Closing Browser ---");
	}

}
