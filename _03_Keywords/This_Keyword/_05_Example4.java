package _03_Keywords.This_Keyword;

/*
 
this: this keyword can be used to return the current class instance

we can return this keyword as a stement from the method. In such a case, the return type of the method must be the class type(non primitive)
 */

 class thiswordKeydemo{
    int testValue =3892;
    void func1(){
        System.out.println("Hello happy learning");
    }
    thiswordKeydemo func2(){
        return this;
    }
 }
public class _05_Example4 {
    public static void main(String[] args) {
        thiswordKeydemo demo = new thiswordKeydemo();
        thiswordKeydemo returnedobjct = demo.func2();

        returnedobjct.func1();
    }
    
}
