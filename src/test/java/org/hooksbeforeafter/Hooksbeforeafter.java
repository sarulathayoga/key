package org.hooksbeforeafter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksbeforeafter {
@Before(order=0)
public void before() {
System.out.println("beefore hook");	

}
@After(order=0)
public void after() {
	System.out.println("after hook");
	

}

	
@Before(order=1)
public void before1() {
System.out.println("beefore hook 111");	

}
@After(order=1)
public void after1(){
	System.out.println("after hook 1111");
	

}
}
