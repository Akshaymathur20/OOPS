package _03_Keywords.Final_Keyword;

/*
   Java final method --> If a method that is declared as a final in super class than it cannot be overridden however it can  be accessed in the subclass object by refering to this either super or this class
 */


class  Election{
     final void vote(){
        System.out.println("Vote is mandatory");
    }
    
}
class _03_FinalMethod extends Election{
    
   // void vote(){
   //  System.out.println("Vote is important for all");
   // }
   public static void main(String[] args) {

    _03_FinalMethod e1 = new _03_FinalMethod();
   
    e1.vote();
   }
    
}

/*
error: vote() in _03_FinalMethod cannot override vote() in Election
   void vote(){
        ^
  overridden method is final 
 */
