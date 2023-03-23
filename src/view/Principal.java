package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio02;

public class Principal {
	
	public static void main(String args []) {
	
	Semaphore PistaSul = new Semaphore(1);
	Semaphore PistaNorte = new Semaphore(1);
	Semaphore [] pista = {PistaSul , PistaNorte};
	
  for (int aviao = 0; aviao <12; aviao++) {
	  Exercicio02 voar = new Exercicio02(pista, aviao);
		voar.start();
  }
}

}


