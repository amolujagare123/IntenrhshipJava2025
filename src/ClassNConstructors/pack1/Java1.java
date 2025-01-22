package ClassNConstructors.pack1;

public class Java1 {
    public int a;
    private double d;
    protected char c;
    String str; // Data Members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 90;
        ob.d = 90.89;
        ob.c = 'a';
        ob.str= "Amol";
        ob.display();

    }

}
