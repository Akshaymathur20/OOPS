package _04_PillarsOfOOPs.Polymorphism._03_RuntimPolymorphism;


/*
  Runtime Polymorphis--> It is known as Dynamic Method Dispatch.It is a process in which a function call to the overridden method is resolved at Runtime. Method overrigind achieves this type of polymorphis. On the othere hand, method overring occurs when a derived class has a definition for one of the member funtion of the base class.That base funciton is said to be overidden.
 */

 /*
  Method Overriding--> When we have two classes, one is child class, and the other parent class, and when we write the same function in both the child class and the parent class, the method is said to be overridden. This concept is known as runtime polymorphism because the compiler will decide at runtime to which function it will call during the program's execution.
  */


class Vehicle{

    void run(){
        System.out.println("Vehicles is running");
    }
}

class Car extends Vehicle{

    void run(){
        System.out.println("Car is running ");
    }
}
public class _01_RuntimePolymorphism {

    public static void main(String[] args) {
        Vehicle veh= new Car();

        //Now we will be call run() method 
        veh.run();

        //when the object behaves as vehilcle

        Vehicle vehe= new Vehicle();
        vehe.run();
    }
    
}
