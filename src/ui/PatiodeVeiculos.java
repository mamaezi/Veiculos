package ui;

import model.Carro;
import model.Veiculo;
import model.Moto;


public class PatiodeVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veiculo v1,v2;
		v1 = new Carro("uno", "abcd");
		v2 = new Moto("CG", "efgh");
		
		
		v1.acelerar();
		v1.frear();
		
		v2.acelerar();
		v2.frear();
		
		
	}

}
