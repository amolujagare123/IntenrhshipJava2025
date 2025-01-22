package ClassNConstructors;

public class MyClass4 {
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

    // Parameterized constructor with this operator

    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }


    public static void main(String[] args) {


        MyClass4 ob = new MyClass4(12,23.56,'g',"Selenium");

        ob.display();
    }
}
