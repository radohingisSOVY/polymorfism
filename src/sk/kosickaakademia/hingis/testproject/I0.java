package sk.kosickaakademia.hingis.testproject;

public interface I0 {
    public void animal();
    default public void wildAnimal(){
        System.out.println("Wolf");
    }
}
