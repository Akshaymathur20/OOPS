// package _02_Constructors;

/*
  Constructor Overloading --> Constructor Overloading is a technique /process  of having more than one constructor in the class with different number of parameters. Each constructor performs a different task.

  //constructor overloading is used to initialize the object in different ways.

  // Que-> How compiler differentiates
   
  The compiler differentiates them by the total number of parameters and their types.

  Overloading means more than one form.

  *********Points to remember************

  1) COnstructor overloading means having more than one class constructor with different signatures.
  2) To compile each constructor must have a different number of  parameters
  3) Parameter list consists of orderand tyeps of arguments.
  4) We cannot have two constructors in a class with the game parameter lists.
 */

class Student_Overloading{
    int id ;
    String name;

    Student_Overloading(int stuId, String stuName){
        id = stuId;
        name = stuName;
    }

    Student_Overloading(int stuId){
        id =stuId;
    }

    void display(){
        System.out.println(id+" "+name);
    }

}
public class _05_ConstructorOverloading {
    public static void main(String[] args) {
        
        //Creating objects

        Student_Overloading s1 = new Student_Overloading(12);
        Student_Overloading s2 = new Student_Overloading(251, "Akshay");

        s1.display();
        s2.display();
    }

    /*
     We can notice that i have created two different constructors
     Student(int stuId,String stdName)
     Studnet (int stId);

     I have created two objects s1 and s2 using construtor 1 and 2 respectively.
     So I have overlaoded the constructor .
     Constructor 2 will not be able to intitalize te name ofthe object so null is printed on the screen.
     */


    
}
