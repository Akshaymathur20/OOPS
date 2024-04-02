package _03_Keywords.Super_Keyword;


class Animal{
    void eat(){
        System.out.println("eating... form parent");
    }

}
class Lion extends Animal{
    void roar(){
        System.out.println("Roaring.....");
    }

    void work(){
        super.eat();
        roar();
    }
}
public class _02_ExampleSuper {

  public static void main(String[] args) {
      Lion l = new Lion();
    l.work();
  }
    
}
