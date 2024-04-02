package _04_PillarsOfOOPs.Inheritance.SingleInheritance;

/*
  Single Inheritacne--> When a class inherits another class.
 */

 class Animal{
    void eat(){
        System.out.println("Eating is necessary to live");
    }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking over teh thief");
    }
 }
public class _SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
    d.bark();
    d.eat();
    }
    
}
