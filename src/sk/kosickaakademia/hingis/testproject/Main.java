package sk.kosickaakademia.hingis.testproject;

public class Main {

    public static void main(String[] args) {
        B p1 = new B(); // zavola sa konstruktor triedy A, potom  triedy B
        p1.print(); //zavola sa print metoda triedy B

        A p2 = new C(); //najprv A, potom B, potom C
        p2.print(); //print triedy C


        A p3 = new A();
        p3.wildAnimal();

        I1 p4 = new B(); //vypise konstruktor A aj B
        p4.wildAnimal(); //vypise metodu prepisanu v B
        ((B) p4).print(); //metoda print nieje sucastou I1, takze je mozne ju volat len po pretypovani na A alebo B

        C p5 = new C(); //zavola konstruktory A, B a nakoniec aj C
        p5.print(); //vypise print C;
        ((B)p5).print(); // vypise print C

        //A p6 = new A();//zavola neparametricky konstruktor
        A p7 = new A("blablabla"); //zavola parametricky konstruktor



    }
}
