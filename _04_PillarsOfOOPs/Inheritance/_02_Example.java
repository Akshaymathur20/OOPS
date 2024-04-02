package _04_PillarsOfOOPs.Inheritance;


class Bicycle{
    public int gear;
    public int speed;


    public Bicycle(int gear,int speed){
        this.gear= gear;
        this.speed=speed;
    }

    //this bicycle has three methods

    public void applyBreak(int decrement){
        speed -=decrement;

    }
    public void speedUp(int increament){
        speed += increament;
    }

    void display(){
        System.out.println("No. of gears are "+ gear);
        System.out.println("No. of gears are "+ speed);
    }

///
    
    // public String toString(){
    //      return ("No. of gears are "+ gear+ "\n"+ " speed of bicycle is "+ speed);
    // }
}

class MountainBike extends Bicycle{

    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight){
        super(gear, speed);
        seatHeight=startHeight;
    }

    public void seatHeight(int newValue){
        seatHeight = newValue;
    }

    void display(){
        super.display();
        System.out.println("Seat Height is "+ seatHeight);
    }

    // public String toString(){
    //     return (super.toString() + "\nseat height is "+ seatHeight);
    // }
}

public class _02_Example {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        // System.out.println(mb.toString());
        mb.display();
    }
    
}
