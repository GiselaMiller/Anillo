package ar.edu.unlam.tallerweb.anillo;

public class Anillo {
	private Double radio;
	public Anillo (Double radio){
		this.radio=radio;
	}
	
	public Double calculaArea(){
		return 3.14*(radio*radio);
	}
	
	public Double calculaPerimetro(){
		return 2*3.14*radio;
	}

}
