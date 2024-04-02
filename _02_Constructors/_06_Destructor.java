package _02_Constructors;

/*
    Destructor--> The destructor is just opposite of constructor . The construtor used to intialize the objects, while the destructor is used to destroy the object in order to realese the resourse and memorey occupied by the object.
    

    ***What is the need of destructor*******
    
    In Java, when we create and object of the class. It occupeies space in the memory(heap). If we do not delete these objects, they will remain there in the memory and occupy some space that is not useful from programming aspects. In order to resolve this problem we use the concept destructor.


    **Advantage of destructor
    1) It resleases the resources occupied by the objct
    2) No need to call exlicitly, it is automatically invoked at the end of the execution of the proram.
    3) It cannot be overloaded becaue does not accept any parameter.


****How does java destructor work?

   When we create the object, it occupies the space in the heap memory area. In the program, threads use these objects. If the thread no longer uses the objects, it becomes eligible for deletion/garbage collection. The memory occupied by that object gets available for new objects created in the program. when the garbage collector destroys the object from the heap, the JRE(Java Runtime Environment) calls the finalize() method to close the connections such as network connection and database connection.

 

*******How finalize() Method works as a Destructor

    It is difficult for the programmers to forcefully execute the garbage collector to destroy the object from the heap. But Java provides an alternative method to do the same thing. The Java Object class (parent class of all the classes in Java) provides the finalize() method that works the same as the destructor in other programming languages. The syntax of the finalize() method is given below:

 */

public class _06_Destructor {

    protected void finalize(){
        System.out.println("Object is destroyed by the Garbage Collector");
    }
    public static void main(String[] args) {
        _06_Destructor de = new _06_Destructor();
        de.finalize();


        de = null;

        System.gc();
        System.out.println("Inside the main() method");
    }
    
}

//As we know destructors are used to destroy the object so the function is called just before the objects are destroyed.

//constructor is called as soon as the object is created as constructor initializes the object.
