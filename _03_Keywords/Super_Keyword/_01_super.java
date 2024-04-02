package _03_Keywords.Super_Keyword;

/*
  Super keyword ---> The "Super" Keyword in Java is used to reference the parent class instance variable.

  Whenever we creat an instance of a subclass an instance of its parent class is created implicity whichi is refered by "super" keyword.
 
  *** Usage of super keyword***
  1) It can be used to refer immediate parent class instance variable.
  2) It can be used to invoke immediate parent class method
  3) super() can be used to invoke immediate parent class constructor.

 */

 class Bike{
    String color = "Red";
 }
 class kawaski extends Bike{
    String color = "Green";
    void printCOlor (){
        System.out.println("Current class: "+ color);
        System.out.println("Parent class: "+ super.color);
    }
 }

public class _01_super {
    public static void main(String[] args) {
        kawaski k =new kawaski();
        k.printCOlor();
    }
    
}
