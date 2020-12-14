package PracticeRectangles.QuadraticEquations;

import java.util.Scanner;

public class TestEquation {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nha A");
        var a = Double.parseDouble(input.nextLine());
        System.out.println("Nhap B");
        var b = Double.parseDouble(input.nextLine());
        System.out.println("Nhap C");
        var c = Double.parseDouble(input.nextLine());
        QuadraticEquation Q = new QuadraticEquation(a, b, c);
        var delta = Q.getDiscriminant();
        if (delta == 0) {
            System.out.println("Phuong Trinh Co 1 Ngiem " + Q.getRoot1());
        } else if (delta >= 0) {
            System.out.println("Phuong Trinh Co 2 Ngiem "+Q.getRoot2());
        }else {
            System.out.println("Khong Co Nghiem Nao");
        }
    }
}
