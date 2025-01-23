package Abstraction;

public interface InterfaceDemo2 {
    void run();
    void show();
    void display();

    static void display1()
    {
        System.out.println("display1");
    }
}

interface InterfaceDemo3 {
    void display();
}

class ChildInterface2 implements InterfaceDemo2,InterfaceDemo3
{



    @Override
    public void run() {

    }

    @Override
    public void show() {

    }


    public void display()
    {
        System.out.println("display");
    }
    public static void main(String[] args) {

        InterfaceDemo2 ob = new ChildInterface2();
        ob.display();

        InterfaceDemo3 ob3 = new ChildInterface2();
        ob3.display();
    }
}
