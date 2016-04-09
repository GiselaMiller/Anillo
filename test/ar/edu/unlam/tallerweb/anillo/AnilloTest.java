package ar.edu.unlam.tallerweb.anillo;

import org.junit.Assert;
import org.junit.Test;

public class AnilloTest {

	@Test
	public void testCalculaArea() {
		Anillo miAnillo = new Anillo(2.0);
		Double valorEsperado= 12.56;
		Assert.assertEquals(valorEsperado.doubleValue(),miAnillo.calculaArea().doubleValue(),0.01);
	}
	
	@Test
	public void testCalculaPerimetro(){
		Anillo miAnillo = new Anillo(3.0);
		Double valorEsperado=18.84;
		Assert.assertEquals(valorEsperado.doubleValue(), miAnillo.calculaPerimetro().doubleValue(),0.01);
	}

}
