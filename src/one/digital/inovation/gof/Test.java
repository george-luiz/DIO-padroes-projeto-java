package one.digital.inovation.gof;

import one.digital.inovation.gof.facade.Facede;
import one.digital.inovation.gof.singleton.SingletonEager;
import one.digital.inovation.gof.singleton.SingletonHolder;
import one.digital.inovation.gof.singleton.SingletonLazy;
import one.digital.inovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println("Lazy:" + lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println("Lazy:" + lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println("Eager:" + eager);
        eager = SingletonEager.getInstacia();
        System.out.println("Eager:" + eager);

        SingletonHolder holder = SingletonHolder.getInstacia();
        System.out.println("Holder:" + holder);
        holder = SingletonHolder.getInstacia();
        System.out.println("Holder:" + holder);

        System.out.println("*****************************************************");
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agrevisvo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        System.out.println("*****************************************************");
        //Facede
        Facede facede = new Facede();
        facede.migrarCliente("Veniltron", "06362125");
    }
}

