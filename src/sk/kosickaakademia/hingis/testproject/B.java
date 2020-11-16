package sk.kosickaakademia.hingis.testproject;

public class B extends A implements I2 {

    public B(){
        System.out.println("I'm constructor B();");
    }

    @Override
    public void print(){
        System.out.println("Class B: print();");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Fox");
    }
    public void programmingLanguage(){
        System.out.println("Class B loves Java");
    }

    @Override
    public void drink() {
        super.print();
        System.out.println("drink B");
    }

    @Override
    public void eat(A a) {
        System.out.println("eat B calls A");
    }
}

