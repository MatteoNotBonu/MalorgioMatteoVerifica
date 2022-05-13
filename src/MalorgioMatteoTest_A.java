import static org.junit.Assert.*;

import org.junit.Test;

public class MalorgioMatteoTest_A {

	@Test
	public void test1() {
		MalorgioMatteoClass m = new MalorgioMatteoClass();
		int risAtteso = 15;
		int risOttenuto = m.MalorgioMet(5); //Ris ottenuto = 1
		assertEquals(risAtteso,risOttenuto); 
	}
	
	@Test
	public void test2() {
		MalorgioMatteoClass m = new MalorgioMatteoClass();
		int risAtteso = 10;
		int risOttenuto = m.MalorgioMet(4); //Ris ottenuto = 1
		assertEquals(risAtteso,risOttenuto);
	}
	
	@Test
	public void test3() {
		MalorgioMatteoClass m = new MalorgioMatteoClass();
		int risAtteso = 6;
		int risOttenuto = m.MalorgioMet(3); //Ris ottenuto = 1
		assertEquals(risAtteso,risOttenuto);
	}

}
