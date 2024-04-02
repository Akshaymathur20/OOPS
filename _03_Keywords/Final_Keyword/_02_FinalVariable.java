package _03_Keywords.Final_Keyword;

/*
   Java final variable --> once the variable is declred as final then its value cannot be changed.

 */

public class _02_FinalVariable {

    final int age = 18;

    void vote(){
        // age = 16;
    }
    public static void main(String[] args) {
        _02_FinalVariable myVote = new _02_FinalVariable();
        myVote.vote();
    }
}

//error-> cannot assign value to final variable age
