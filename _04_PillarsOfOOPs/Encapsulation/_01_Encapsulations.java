package _04_PillarsOfOOPs.Encapsulation;

import java.util.Scanner;

/*
   Encapsulations--->Encapsulation in Java is a fundamental concept in Object Oriented Programming(OOPs). Encapsulations refers to the bindinig/bundling of data and methods that operates on  that data within a single unit(which is called a class in Java).

   Java Encapsulations is a way of hiding the implementation detail of a class from outside access and only exposing a public intereface that can used to interact with the class.


   Question --> HOw you can acces the private variable in this

   In java Encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. To allow outside access to the instance variable, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance varibles respectively.
   By using getters and setters the calls can enforce its own data validation rules and ensure that its internal state remains consistent.
   
   
   ***********Advantage of Encapsulation********

   --> Classes are easier to change and maintain
   --> We can specify which data member we want to keep hidden or accessible.
   --> We decide which variable have read/write privileges(increase flexibility).
 */

 /*

  As discussed earlier, encapsulation refers to the concept of binding data and the methods operating on that data in a single unit also called a class.

  The goal is to prevent this bound data from any unwanted access by the code outside this class. 

   Let’s understand this using an example of a very basic User class. Consider that we are up for designing an application and are working on modeling the log-in part of that application. We know that a user needs a username and a password to log into the application.

    A very basic User class will be modeled as: Having a field for the userName Having a field for the password A method named login() to grant access Whenever a new user comes, a new object can be created by passing the userName and password to the constructor of this class. class User String userName String password void login() 

 
  */


class Student{

    private String name;
    private int idNum;
    private String gender;
    private int age;

    //getter
    public String getName(){
        return name;
    }
    public int getidName(){
        return idNum;
    }
    public String getgender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    //setter

    public void setName(String newName){
        name = newName;
    }
    public void setIdNum(int newId){
        idNum= newId;
    }
    public void setGender(String newgender){
        gender = newgender;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    void vote(){
        if(age>=18){
            System.out.println(name + " : is eligible for votting");
        }else{
            System.out.println(name + " : is not eligible for votting");
        }
    }
  }

public class _01_Encapsulations {

    public static void main(String[] args) {
        Student st = new Student();

        Scanner sc =new Scanner(System.in);

        String name = sc.next();
        int id= sc.nextInt();
        String gender = sc.next();
        int age = sc.nextInt();

        st.setName(name);
        st.setIdNum(id);
        st.setGender(gender);
        st.setAge(age);

     

        System.out.println("Name of Student : "+st.getName());
        System.out.println("Id Number of Student : "+st.getidName());
        System.out.println("Gender of Student : "+st.getgender());
        System.out.println("Age of Student : "+st.getAge());

        st.vote();

        sc.close();
    }
    
}
