package PracticeRectangles;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter The Width");
        var width = Double.parseDouble(input.nextLine());
        System.out.println("Enter The Height");
        var height = Double.parseDouble(input.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.toString());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
