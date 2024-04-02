package _03_Keywords.This_Keyword;

/*
  this: refer to a current clas instance variable
 
  There is ambiguity between the instance varibles and parameters, this keyword resolves the problem of amibguity.
  Let's take the case when we don not use this keyword then what happens actually



 */

 class Student{
    int rollNo;
    String  name;
    float fees;

    // Student(int rollNo, String  name,float fees){
    //     rollNo = rollNo;
    //     name = name;
    //     fees = fees;
    // }

    //It will the output of 0 null 0.0;
    //now you can notice that the values of roll no, name and fee do not change even we have assigned the values in the constructor. this is because the compiler is not able to distinguish local variables and instance variables because of the same names. this issue gets resolved using this keyword.

      Student(int rollNo, String  name,float fees){
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }


    void display(){
        System.out.println(rollNo + " "+ name + " "+ fees);
    }
 }

public class _02_Example1 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "akshay", 50f);

        s1.display();
    }
}
