package one.digital.inovation.gof.singleton;

public class SingletonHolder {

    private static class InstanceHolder {
        public static SingletonHolder instacia = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstacia() {
        return InstanceHolder.instacia;
    }
}

