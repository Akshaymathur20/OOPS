package _02_Constructors;
/*
 *  

Purpose of a default constructor:-

 

Basically, the purpose of the default constructor is to provide the default values to the objects like null, 0, etc. according to the type.
 */

class Student{
    int id;
    String name;

    void display(){
        System.out.println(id+ " "+ name);
    }
}

public class _02_DefaultExample {

public static void main(String[] args) {
    //Creating objects

    Student s1 = new Student();
    Student s2 = new Student();

    // displaying values of the object

    s1.display();
    s2.display();
}


    
}
