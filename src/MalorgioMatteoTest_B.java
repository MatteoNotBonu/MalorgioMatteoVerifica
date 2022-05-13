import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MalorgioMatteoTest_B {

	
	MalorgioMatteoClass m;
	
	@Before
	public void istanzia(){
		m = new MalorgioMatteoClass(); //in questo modo si istanzierà una sola volta
	}									//risparmiando memoria e risorse
	
	@Test
	public void test1() {
		int risAtteso = 15;
		int risOttenuto = m.MalorgioMet(5); 
		assertEquals(risAtteso,risOttenuto); 
	}
	
	@Test
	public void test2() {
		int risAtteso = 10;
		int risOttenuto = m.MalorgioMet(4); 
		assertEquals(risAtteso,risOttenuto);
	}
	
	@Test
	public void test3() {
		int risAtteso = 6;
		int risOttenuto = m.MalorgioMet(3); 
		assertEquals(risAtteso,risOttenuto);
	}

}
