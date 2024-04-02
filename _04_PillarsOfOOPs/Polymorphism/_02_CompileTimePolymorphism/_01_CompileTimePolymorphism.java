package _04_PillarsOfOOPs.Polymorphism._02_CompileTimePolymorphism;

import java.util.Scanner;

/*
 * Compile_Time_Polymorphism--> It is also known as "Static Polymorphism". This type of polymorphism is achieved by Method overloading or operator overloading 
 *  
 * Note--> Operator overloading is not supported by java
 */


 /*
  
 Method Overloading--> When we have more than one fuction/method in the same class with the same name and number of arguments then these functions are knowns as overloaded fuction. 
 Funciton can be overloaded by a change in the nubmer of arguments and a change in the type of arguments

 Note--Different return types is note considered as overloading

  
  */


class Sum{
    
        static int Addition(int num1  ,int num2){
            return num1+num2;
        }
        static double Addition(double num1, double num2){
            return num1+num2;
        }
    
        static int Addition(int a, int b, int c){
            return a+b+c;
        }

}

public class _01_CompileTimePolymorphism {

    public static void main(String[] args) {
        
        //calling method by passing 

        Scanner sc =new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r= sc.nextInt();

        System.out.println(Sum.Addition(num1,num2));
        System.out.println(Sum.Addition(a,b));
        System.out.println(Sum.Addition(p,q,r));

        sc.close();
    }
}


