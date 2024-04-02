package _02_Constructors;

/*
   "There is no  copy constructor in java . But we can copy the values from one object aot another object likee copy constructor in other langeuss"

   There are several ways to copy the valuesof oone object into another object in java. They are:

   *->By construtor
   *->By assigning the values of one object to another
   *-> By clone() method of objct class
 */

 class CopyConstructorExample{

    private double x, y;

    //a normal parameterized constuctor
    public CopyConstructorExample(double one, double two){
        System.out.println("Copy constructor called ");
        x = one;
        y = two;
     }

     //copy constuctor
     CopyConstructorExample(CopyConstructorExample c){
        x = c.x;
        y = c.y;
     }

     public String display(){
        return "("+ x+" + "+ y+"i)";
     }
 }
public class _04_CopyConstructor {
    public static void main(String[] args) {

        
        CopyConstructorExample c1 = new CopyConstructorExample(10, 15);

        //Following involves a copy constructor call
        CopyConstructorExample c2 =new CopyConstructorExample(c1);

        //NOte that following doesn't involve a copy constructor call as
        //non-privmitive variable are just reference.
        CopyConstructorExample c3 = c2;

        //display() of c2 is called here
        System.out.println(c2.display());
        System.out.println(c3);
    }
    
}
