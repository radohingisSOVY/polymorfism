package sk.kosickaakademia.hingis.testproject;

public class A implements I1 {

    private int number;

    public A(){
        System.out.println("I'm constructor A();");
        number = 40;

    }
    public A(String text){
        this();
        System.out.println("I'm constructor A():"+text);
    }

    public void print(){
        System.out.println("Class A: print();");
    }

    @Override
    public void animal() {
        System.out.println("Dog");
    }

}
