package StaticNFinal;

public class Student {

    int rno;
    String name;
    static String college = "VP coe";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 1;
        s1.name = "Priti";

        s2.rno = 2;
        s2.name = "Parth";
        s2.college = "PICT";

        s3.rno = 3;
        s3.name = "Arti";

        s1.display();
        s2.display();
        s3.display();
    }
}
