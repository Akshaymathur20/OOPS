package _02_Constructors;
/*
  
  Parameterized constructor --> A constructor which has a certain number of parameters is called parameterized constructor.

  Purpose of Parameterized construcor: It is used to intialize the object with different-different values;
 */


 class Student1{

         int id;
         String name;

         Student1(int stuid,String stdname){
            id = stuid;
            name = stdname;
         }

         void display(){
            System.out.println(id+" "+ name);
         }
 }
public class _03_ParameterizedConstructor {

    public static void main(String[] args) {
        //creating object 

        Student1 s1= new Student1(251, "Akshay");
        Student1 s2= new Student1(252, "Kaustubh");
        Student1 s3= new Student1(253, "Harshit");

        s1.display();
        s2.display();
        s3.display();
    }
    
}
