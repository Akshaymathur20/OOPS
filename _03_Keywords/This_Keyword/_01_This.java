package _03_Keywords.This_Keyword;

/*
   this keyword --> THere can a lot of usage of Java "this" keyword.
            In java , this is a reference varible that referes to the currentobject

            --this is used to reduct name-space-collison
            --Sometimes a method will need to refer to the object that invoked it.
            -- To allow this java defines "this" keyword


            ***Usage of java this keyword

            1)this can be used to refer current class instance variable
            2) this can be used to invoke current class method(implicity)
            3) this() can be used to invoke currentt class Constructor
            4) this can be passed as an argument in the method call.
            5) this can be passed as argument in the constructor call.
            6) this can be used to return the currennt class instanct from the method.


 */


 class Circle{
    double x , y;
    double r;

    double circumference(){
        return 2 * 3.14 *r;
    }

    double area(){
        return (22/7)*r*r;
    }

    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
 }

public class _01_This {
    public static void main(String[] args) {
        Circle c1 = new Circle( 3.0,4.0,5.0);

        Circle c2 = new Circle(-4.0, 8.0, 10.0);

        System.out.println("Circumference of Circle : "+ c1.circumference() );
        System.out.println("Area of Circle : "+ c1.area());

        System.out.println("Circle of c2");
        System.out.println("Circumference of Circle : "+ c2.circumference() );
        System.out.println("Area of Circle : "+ c2.area());

        
    }
    
}
