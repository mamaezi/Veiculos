package model;

public class Carro extends Veiculo{
	
	public Carro(String marca, String placa) {
		super(marca,placa);
	}
	
	@Override
	public void acelerar() {

	System.out.println("carro " + super.marca + " acelera ");
	}
	
	@Override
	public void frear() {
		System.out.println("carro " + super.marca + " frea ")	;
	}
}
