package sk.kosickaakademia.hingis.testproject;

public class C extends B{

    public C(){
        System.out.println("I'm constructor C();");
    }

    @Override
    public void print(){
        System.out.println("Class C: print();");
    }
}
