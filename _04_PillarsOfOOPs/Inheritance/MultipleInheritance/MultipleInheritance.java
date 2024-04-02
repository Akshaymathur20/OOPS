package _04_PillarsOfOOPs.Inheritance.MultipleInheritance;

/*
  Multiple inheritance is not possible is java 

  Reason--> 


  Below is the example how we can achieve in java using through interface
 */

 
 /**
  * InnerMultipleInheritance
  */
 interface one{
    public void print_geek();

 }
 interface two{
     public void  print_for();
 }
 interface three extends one,two{
    public void print_geek();
 }

class Child implements three{
     
    public void print_geek(){
        System.out.println("Geeks");
    }

    public void print_for(){
        System.out.println("for");
    }
 }
public class MultipleInheritance {

    public static void main(String[] args) {
        Child c = new  Child();
        c.print_geek();
        c.print_for();
        c.print_geek();

    }
    
}
