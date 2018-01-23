import java.util.Scanner;

public class Assignment41 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the pentagon");
        
        double area = (5*Math.pow(((2*scan.nextDouble())*(Math.sin(Math.PI/5))),2))
                      /(4*Math.tan(Math.PI/5));
        
        System.out.println("The area of that pentagon is " + (Math.round(area * 100.0) / 100.0));
    }
    
}