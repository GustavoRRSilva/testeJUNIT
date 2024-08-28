package AulaAldo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MassaCorporeaTest {

	static MassaCorporea mc = new MassaCorporea();
	
	@Before
	public void inicio() {
		mc.altura = 1.7;
		mc.peso = 80;
	}
	
	@Test 
	public void testImc() {
		mc.calcularImc();
		System.out.println(mc.imc);
		assertTrue(27.6816609 == mc.imc);
	}

}
