package view;

import controller.SomaNaturaisController;

public class Principal {

	public static void main(String[] args) {
		SomaNaturaisController somaNaturaisController = new SomaNaturaisController();
		int n = 5;
		int resultado = somaNaturaisController.soma(n);
		System.out.println(resultado);
	}
}
