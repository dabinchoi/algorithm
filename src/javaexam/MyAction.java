package javaexam;

public class MyAction extends Action{
    void init(){
        System.out.println("init");
    }
    void service(){
        System.out.println("service");
    }
    void destroy(){
        System.out.println("destroy");
    }
}
