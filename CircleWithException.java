import java.util.*;
class CircleWithException{  
    private final static double PI = 3.142;
    private double radius;

    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius < 0){
            throw new IllegalArgumentException();
        }else{
            this.radius = radius;
        }
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea() throws Exception{
        double area = PI * this.getRadius() * this.getRadius();
        if(area > 1000){
            throw new Exception();
        }else{
            return area;
        }
       
    }

    public double getDiameter(){    
        return 2 * PI * this.getRadius();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CircleWithException circleException = new CircleWithException();
        try{
            System.out.print("Enter radius of circle:");
            double radius = input.nextDouble();
            circleException.setRadius(radius);
            System.out.println("The area of circle is: " + circleException.getArea());
            System.out.println("The diameter of the cricle is: " + circleException.getDiameter());

            
        }catch(IllegalArgumentException e){
            System.out.println("Input must be a positive number");
        }catch(Exception e){
            System.out.println("Area of circle is more than 1000");
        }

        input.close();
    }

    
}