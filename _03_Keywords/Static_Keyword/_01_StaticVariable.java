package _03_Keywords.Static_Keyword;

/*

Java Static Variable-->  When we use a static keyword with a variable, then it is known as a static variable.

** The static  variable will be shared among all the objects of the class.
** Memory is allocated to the static varible only once in the class are at the tiem of class loading.

** Advantage of static variable

It makes program memory efficient

 */


class Student{
    int rollNo;
    String name;
    static String college="VIT";

    //constructor

    Student(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo + " "+name+ " "+ college);
    }
}
public class _01_StaticVariable {

    public static void main(String[] args) {
        
        Student s1 = new Student(251, "Akshay");
        Student s2 = new Student(252, "Kaustubh");

        //we can change the college of all objects by the single line of code

        // Student.college("VIT");

        s1.display();
        s2.display();

        // s2.college="MIT";
        
        System.out.println("s1 changed the college name onw let us see is it changed for s2 too ?");
        
        s1.display();
        s2.display();

        System.out.println("Yes, if any object change that variable that chanages will be reflected to all obbjects");

    }
    
}
