package _04_PillarsOfOOPs.Inheritance.HierarchicalInheritance;

/*
  Hierarchical Inheritance--> When two or more classes inherit a single class, it is known as hierarchical inheritance. 
 */

 class Animal{
    void eat(){
        System.out.println("Eating is necssary");
    }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking ");
    }
 }

 class Cat extends Animal{
      void meow(){
        System.out.println("Cat is meowing");
      }
 }
public class _HierarchicalInheritance {

    public static void main(String[] args) {
        Cat c =new Cat();
    c.eat();
    c.meow();
    }


    
}
