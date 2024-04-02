package _03_Keywords.This_Keyword;
/*
  this: to pass as an argument in the method

  The this keyword can also be passed as an argument in the method. It is mainly used int he event handling.
 */


 class thiskeyworddemo{
    int testValue = 3483;

    void func1(){
        System.out.println("hello you ar myfunction");
        func2(this);
    }
    void func2(thiskeyworddemo obj){
        System.out.println(obj.testValue);
    }
 }
public class _04_Example3 {
    public static void main(String[] args) {
        thiskeyworddemo demo = new thiskeyworddemo();
        demo.func1();
    }
}
