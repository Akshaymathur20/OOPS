// package _02_Constructors;

/*
  A constructor is called a "Default Constructor " when it doesn't have any parameter.
 */

public class _02_DefaultConstructor {

    _02_DefaultConstructor(){
        System.out.println("It is a default constructors");
    }

    void display(){
        System.out.println("ok well did");
    }
    public static void main(String[] args) {
        _02_DefaultConstructor obj = new _02_DefaultConstructor();

        obj.display();
    }
}

/*
 
Here you can notice that we have created the object of the car class and the car constructor of the car class is called.

Point to be remembered: If there isn’t any constructor in a class, the compiler automatically creates a default constructor within the class that will not be visible to us.
 */
