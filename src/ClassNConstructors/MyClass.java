package ClassNConstructors;

public class MyClass {
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

    public static void main(String[] args) {

        int i;

        i = 10 ;

        MyClass ob = new MyClass();
        ob.a = 90;
        ob.d = 90.89;
        ob.c = 'a';
        ob.str= "Amol";

        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 901;
        ob2.d = 190.89;
        ob2.c = 'c';
        ob2.str= "java";

        ob2.display();
    }

}
