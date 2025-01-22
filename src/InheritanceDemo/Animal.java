package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}

class Mammal extends Animal{

    void walk()
    {
        System.out.println("walk");
    }
}
class Reptile extends Animal {

    void crawl()
    {
        System.out.println("crawl");
    }
}

class Tiger extends Mammal {

    void roar()
    {
        System.out.println("roar");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Mammal m = new Mammal();
        m.eat();
        m.walk();


        Reptile r = new Reptile();
        r.eat();
        r.crawl();

        Tiger t = new Tiger();
        t.eat();
        t.walk();
        t.roar();

    }
}


