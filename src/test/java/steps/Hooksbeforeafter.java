package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksbeforeafter {
@Before
private void before() {
System.out.println("beefore hook");	

}
@After
private void after() {
	System.out.println("after hook");
	

}

	

}
