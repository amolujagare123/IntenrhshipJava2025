package controlstructure;

public class Triangle {

    public static void main(String[] args) {

        int a = 0;
        int b = 90;
        int c = 90;

if(a+b+c==180 && a>0 && b>0 && c>0) {
        if(a==b && b==c )
            System.out.println("Equilateral controlstructure.Triangle");

        if( a!=b && b!=c && c!=a)
            System.out.println("Scalane controlstructure.Triangle");

        if(  a==90 || b==90 || c==90)
            System.out.println("Right angled controlstructure.Triangle");

        if(  (a == b && b != c) || (b == c && a != b) || (a == c && b != a))
            System.out.println("Isosceles controlstructure.Triangle");
    }
     else
    System.out.println("This is not a triangle");
    }
}
