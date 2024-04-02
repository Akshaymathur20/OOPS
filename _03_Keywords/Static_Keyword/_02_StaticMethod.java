package _03_Keywords.Static_Keyword;

/*
   Java static method --> IF we use static keyword with any method, it is called a static method.

   ---> A static method belongs to the class rather than the objects of a class.
   ---> A static method can be invoked without creating an instance of class
   ---> A static method can access static data members and can change the value of it.

 */

public class _02_StaticMethod {

    static int area(int a, int b){
        int Area = a*b;
        return Area;
    }

    public static void main(String[] args) {
        int result = area(5, 6);
        System.out.println(result);
    }
    
}
/*
    ********Restriction for the static method

 --> The static method cannot use non- static data members of call teh non-static method directly.

 --> this and super cannot be used in a static context.

 Java's main method static?

It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then calls a main() method that will lead to the problem of extra memory allocation

 */
