package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	// Singleton

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		eager = SingletonEager.getInstacia();
		System.out.println(eager);

		SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);

		// Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

		robo.setComportamento(defensivo);
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Hugo", "72220514");

	}

}
