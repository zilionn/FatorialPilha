package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	public long fatorial(int valor) throws Exception {
		PilhaInt p = new PilhaInt();
		int result = 1;
		
		for(int i = 1; i <= valor ; i++) {
			p.push(i);
			
		}
		while(!p.isEmpty()) {
			result *= p.pop();
		}
		
		return result;
		
	}

}
