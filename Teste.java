

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Teste {
    public static void main(String[] args){
    //Testes Singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    lazy = SingletonLazy.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazyHolder);

    //testes Strategy

    ComportamentoNormal normal = new ComportamentoNormal();
    ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
    ComportamentoAgressivo agressivo = new ComportamentoAgressivo();


    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();

    //Teste Facade
    Facade facade = new Facade();
    facade.migrarCliente("Venilton", "14801788");

    }
}