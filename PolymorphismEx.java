class Parent 
{
    void Print()
    {
        System.out.println("I am in parent class");
    }
}
class subclass1 extends Parent 
{
    void Print() 
    {
    System.out.println("I am in subclass1");
    }
}
class subclass2 extends Parent 
{
    void Print()
    {
        System.out.println("I am in subclass2");
    }
}
 

class PolymorphismEx 
{
    public static void main(String[] args)
    {
        Parent p1 = new subclass1;
        p1.Print();
 
        Parent p1 = new subclass2();
        p1.Print();
    }
}
