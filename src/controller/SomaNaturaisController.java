package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
	}
	
	public int soma(int n) {
		// Condição de parada: Se o número for menor que 1, retorna 0.
		if (n < 1) {
			return 0;
		} else
		// Relação de chamada dos passos: n + função soma de (n - 1)
		return n + soma(n - 1);
	}
}
