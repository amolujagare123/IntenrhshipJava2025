package ClassNConstructors;

public class MyClass2 {
    int a;
    double d;
    char c;
    String str; // Data Members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClass2()
    {
        a = 10;
        d = 89.12;
        c = 'g';
        str = "Amol";
    }


    public static void main(String[] args) {


        MyClass2 ob = new MyClass2();

        ob.display();
    }
}
