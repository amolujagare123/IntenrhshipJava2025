package InheritanceDemo;

public /*final*/ class Employee {

    int salary = 35000;
    void empWork()
    {
        System.out.println("empWork");
    }
    /*final*/ void calculateSalary()
    {
        System.out.println("Employee calculateSalary");
    }
}

class Programmer extends Employee
{
    int bonus = 12000;

     void calculateSalary()
    {
        System.out.println("Programmer calculateSalary");
    }
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

        p.salary = 90000;
        p.empWork();

        Employee ob = new Programmer();
        ob.calculateSalary();
    }
}