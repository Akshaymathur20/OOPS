package _03_Keywords.This_Keyword;

/*
  this: to invoke the current class method

  this can be bused to invoke the current class method . But if you dont't use this keyword, the compiler automatically adds this keyword while invoking the method. Let's see the example
 */


 class thiskeyworddem{
    void myfuntion(){
        System.out.println("hello you are myfunction");
    }

    void call(){
        System.out.println("hello you are call");

         //myfunction(0); //same as this.myfunction();
        this.myfuntion();
    }
 }

public class _03_Example2 {

    public static void main(String[] args) {
        thiskeyworddem demo = new thiskeyworddem();
    demo.call();
    }
    
}

//hello you are call
//hello you are myfunction
