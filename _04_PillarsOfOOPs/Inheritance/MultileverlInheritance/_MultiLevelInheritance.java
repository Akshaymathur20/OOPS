package _04_PillarsOfOOPs.Inheritance.MultileverlInheritance;

/*
  Multilevel Inheritance--> When there is a chain of inheritance  it is known as mulitleverl inheritance.
 */

 class Animal{
    void eat(){
        System.out.println("eating in the break");
    }
 }

 class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking ");
    }
 }

 class Puppy extends Dog{
    void weep(){
        System.out.println("Is weeping");
    }
 }
public class _MultiLevelInheritance {
    
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.eat();
    }
    
}
