package sk.kosickaakademia.hingis.testproject;

public class B extends A implements I2 {

    public B(){
        System.out.println("I'm constructor B();");
    }

    @Override
    public void print(){
        System.out.println("Class B: print();");
    }
}
