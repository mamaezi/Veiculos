package model;

public class Moto extends Veiculo{

	public Moto(String marca, String placa) {
		super(marca,placa);
	}
	
	@Override
	public void acelerar() {
	System.out.println("moto " + super.marca + " acelera ");
	}
	
	@Override
	public void frear() {
		System.out.println("moto " + super.marca + " frea ")	;
	}
}
