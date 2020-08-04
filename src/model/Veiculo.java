package model;

// em classes abstratas e unao dou new explicitamente
public abstract class Veiculo {

	protected String marca;
	protected String placa;
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	//clausulas contratuais de modo que as classes filhas obrigam-se a implementar
	// a logica destes metodos
	
	public abstract void acelerar();
	public abstract void frear();
	
	
}
