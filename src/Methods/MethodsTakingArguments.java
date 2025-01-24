package Methods;

import java.util.Date;

public class MethodsTakingArguments {

    void printValue1()
    {
        System.out.println("printValue1");
    }

    void printValue2(int a)
    {
        System.out.println("printValue1");
        System.out.println("a="+a);
    }

    void printValue3(int a,int b,int c)
    {
        System.out.println("printValue1");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void printValue4(int a,double b,char c)
    {
        System.out.println("printValue1");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void printValue5(int a, String b, Date c)
    {
        System.out.println("printValue1");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void printArray(int[] a)
    {
        for(int x:a)
            System.out.println(a);
    }

    void print2DArray(String[][] str)
    {
        for(int i=0;i<str.length;i++)
        {
            for (int j = 0; j < str[0].length; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MethodsTakingArguments ob = new MethodsTakingArguments();

        ob.printValue1();
        ob.printValue2(45);
        ob.printValue3(45,24,56);
        ob.printValue4(45,24.45,'d');
        ob.printValue5(45,"24.45",new Date());


    }

}
