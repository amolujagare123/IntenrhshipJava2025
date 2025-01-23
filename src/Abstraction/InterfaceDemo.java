package Abstraction;

public interface InterfaceDemo {

    void run();
    void show();

    static void display1()
    {
        System.out.println("display1");
    }

    default void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display3");
    }

}

class ChildInterface implements InterfaceDemo
{
    public void run() {
        System.out.println("run");
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        InterfaceDemo ob = new ChildInterface();
        ob.run();
        ob.show();

        InterfaceDemo.display1();
    }

}
