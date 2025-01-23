package InheritanceDemo.Polymorphism;

public class Addition {

    int a;
    int b;

    void add()
    {
        int c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x)
    {
        int c;
        c = x+ b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c = x+ y;
        System.out.println(c);
    }

    void add(double x,double y)
    {
        double c;
        c = x+ y;
        System.out.println(c);
    }

    void add(int x,int y,int z)
    {
        int c;
        c = x+ y + z;
        System.out.println(c);
    }


    void add(String x,String y)
    {

        String c = x+ y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.add();
        ob.add(23);
        ob.add(23,23);
        ob.add(23,23,23);

        ob.add(2.3,2.3);
        ob.add("java","selenium");

    }
}
