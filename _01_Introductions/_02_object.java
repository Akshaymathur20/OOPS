/*
 
   Object--> In java object is as instance of class. Each object has unique identity, a behaviour, and a state of it.
   In Java we create an object using the keyword "new".
   Memory allocation takes place when the object is created.

   "The new keyword is used to allocate memory at runtime. All objects get memory in the Heap Memory Area".


   /Feature used to characterize an object.

   State -> It represent the properties of the object
   Behaviour -> It represent the funciotnality of an object such as walking, taking, runnine etc
   Identity -> An object is implemented by a Unique ID. The value of the ID is hidden to the external user. It is only used internally by the JVM to identify each object uniquely.


     //Example with real world entities

     For example , a DOG state include its color, age , gender, size.
     while its behaviour is sleeping barking, walking around like secureity guard at 2 AM


     *******How to create an object in java*********

     We use "new" key word is the best way to create an instance of class 

     When we create and object by using the new keyword,it  allocates memory(heaps) for the object and it also return the refernce of that object.

     Syntax --> ClassName object = new ClassName();

     ClassName()->>> is a constructor



     Constructor -> Constructor is a special method because it does not have a return type. We do not even need to write void as the return type. It's name should be the same as the name of the class.

     ****It is construtor becaue it constructs the values at the time of object creation. 
     It is not necessay to write a constructor for a class.
     It is because the java compiler creates default constructor if your class doesn't have any.

     It is special type of method which is used to intialize the object.



     //java is not a pure object-oriented programming language because primary data types like int, float, double, boolean are not oops based as we can declare variables like int a=2, there is not any use of a new keyword here to initialize the variable;
   
 */


public class _02_object {


    //construtor 
    void show(){
        System.out.println("Welcome to the world of Object Oriented Programming");
    }

   public static void main(String[] args) {
     
    //we will create an object using new keywords

       _02_object obj = new _02_object();


       //invoking the methods using the object.
       obj.show();
   }
    
}
