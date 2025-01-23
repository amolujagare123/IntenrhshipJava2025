package Abstraction;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void show();

    void display()
    {
        System.out.println("display");
    }

}

class ChildAbstract extends AbstractClassDemo
{


    void run() {
        System.out.println("run");
    }


    void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildAbstract(); // upcasting
        ob.show();
        ob.run();
    }
}
