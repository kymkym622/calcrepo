package ym;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculatertest {

	@Test
	public void testAdd() { 
		Calculater calc = new Calculater();
		calc.add(10,20);
		assertEquals(30,calc.getResult());
	}

}
