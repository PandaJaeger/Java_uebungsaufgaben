package rectanglearea;

import java.util.*;

public class TriangleArea {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double lengh= getLength(sc);
        double hight= getHight(sc);
        double area= getArea(lenght,hight/2);
        displayData(lenght,hight,area);
    }
    
    public static double 



public class RectangleArea {
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length= getLength(sc);
        double width= getWidth(sc);
        double area= getArea(length,width);
        displayData(length,width,area);
    }
    
    public static double getLength(Scanner sc){
        System.out.println("Enter the length of the rectangle: ");
        return sc.nextDouble();
    }
    

    public static double getWidth(Scanner sc){
        System.out.println("Enter the width of the rectangle: ");
        return sc.nextDouble();
    }
    

    public static double getArea(double length,double width){
       double area = length * width;
       return area;
       }
       
    public static void displayData(double length,double width,double area){
       System.out.println(length +" x "+ width +" = "+area+"\nThe area of the rectangle is "+ area);
    }
    
}