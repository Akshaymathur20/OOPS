
/*
 *
    The different way that a programmer can control the acccess of differnt element(method,members).SO javadeveloper has coinded a number of modifier . THey are called access modifier     

      There are three types of access modifier.  

      1) Private
      2) Public
      3) Protectd
      4) Default

      1) Private --> A private member cannot be accessed directly from outside the class . Tha aim is to keep it hidden from the users and other classes. It is popular practice to keep the data members privaet since we do not watnt anyone manipulating our data directly.

      The private access modifier is accessbile only within the class.
      It means that any method which belongs to the same class can access it and outside that no method can acess that member


       ****
          class Cop{
            private int gun 
          }
       ***


       Public --> The public has the wides scope among all the modifiers.
           *1* _ It is accessible to everywhere
           *2* _ It can accessible to any other class
           *3* _ When a class is public , all its member with default access specifier are also public.

            ****
          class Cop{
            private int gun; 

            public int getGun(){
                return gun; //The private variable is directly accessible over here.
            }
          }
       ***

       Here we can see that the getGun method is public, so we can call the public method from anywhere so the public method getGun will be called by the main method, and the getGun method has access to the private variable gun.



       as the getGun() method and gun variable both are defined in the same class, so the getGun method will access the gun variable, and the getGun() method will be accessed by the main method. 

 
       This technique is used in data security, like those who design the program knows how to access those variables. Anyone who is an outsider will not be able to get access to private property. Just assume that you are designing the banking system, and any outsider tries to know the total cash in the bank so he will not be able to do so because he does not know which method he needs to call to fetch the data because the variable cash can’t be accessed directly as it is private



       Protected ;-> The  protected access modifier is unique. The level of access to the protected member lies somewhere between public and private. In Java, 

       *1* _the protected access modifier  is accessible within a package or from outside a package but through inheritance only 
       *2* _ The protected access modifier can be applied on the data member method and constructor. It can't be applied on the class
       *3 _ If a member is declared as a protected in it is super class then that member is accessible to any derived class or any subclass, which can be obtained from that. 


       4) Default--> If we don't use any modifier the it is treated as the default access modifier. 
       *1* _ The default modifier is accessible only within a package
       *2* _ It can be accesssilbe only within the same class or within the same package
       *3* _It provides more accessibility than private.
       *4* _ It cannot be accessed from another package.
 */




public class _03_AccessModifier {
    
}
