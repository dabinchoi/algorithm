package javaexam;

public abstract class Action {
    abstract void init();
    abstract void service();
    abstract void destroy();

    public void run(){
        init();
        service();
        destroy();
    }
}
