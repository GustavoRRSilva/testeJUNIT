package AulaAldo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	static Calculadora calc = new Calculadora();
	@Before
	public void inicio() {
	
		calc.operando1 = 10;
		calc.operando2 = 5;          
	}
	
	@Test
	public void testeAdicao() {
		assertTrue(15 == calc.adicao());
	}
	@Test
	public void testeSubtracao() {
		assertTrue(5 == calc.subtracao());
	}
	@Test
	public void testeMultiplicacao() {
		assertTrue(50 == calc.multiplicacao());		
	}
	@Test
	public void testeDivisao() {
		assertTrue(10 == calc.divisao());
	}
}
