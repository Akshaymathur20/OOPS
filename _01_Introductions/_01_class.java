/*
 * 
 Class --> A class is building block of OOps. Classes are user defined data type that act as a blueprint for creating individual object, methods and properties.

 //Declaration

  class ClassName{
    
    //Class name  // All member variable and methods
  }
 */

public class _01_class {


    //Class Data members
    int topSpeed;
    int totalSpeed;
    int fuelCapacity;
    String manufacturer;

    //class methods
    void refuel(){
        System.out.println("Can fuel");
    };
    void park(){
        System.out.println("Car park");
    }
    void drive(){
        System.out.println("car Drive ");
    }
  
    //creating a object of this 
    //The naem of the class, _01_class will be used to create an instance of the class car in our main program. We can create an object of class by using the keyword new:

    public static void main(String[] args) {

        //object of _01_class
        _01_class obj = new _01_class();

        obj.refuel();
        obj.park();
        obj.drive();


    }
}
