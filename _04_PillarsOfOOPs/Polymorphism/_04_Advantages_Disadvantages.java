package _04_PillarsOfOOPs.Polymorphism;

class Advantages{

    String str= "PolyMorphism";

    void Advantage(){

                System.out.println("Advantages of Polymorphism");
        System.out.println(str+ " incrase code resuability by allowing object of differnt classes to be treated as objects of a common class.");
        System.out.println(str+ " improves readability and maintainbility of cose by reducing the amount of code the needs to be written and maintained");
        System.out.println(str+ " supports dynamic binding, enabling the correct method to be called at runtime, based on the actual class of the object");
        System.out.println(str+ " enables objects to be treted as a single types, making it easier to write generic code that can handle objects of different types.");
    }
}

class Disadvantages extends Advantages{


    void Disadvantage(){
        Advantage();
        System.out.println();

        System.out.println("Disadvantages of Polymorphism");
         System.out.println("Can make it more difficult to understand the behaviour of an object, especially if the code is complex");
         System.out.println("This may lead to performance issues, as polymorphic behavior may require additional computations at runtime");

    }
}

public class _04_Advantages_Disadvantages {

    public static void main(String[] args) {
           Disadvantages ok = new Disadvantages();
               
           ok.Disadvantage();
           
    }
    
}
