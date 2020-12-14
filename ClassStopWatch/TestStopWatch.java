package PracticeRectangles.ClassStopWatch;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        var choice = 0;
        var input = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        do {
            System.out.println("1: Bat Dau");
            System.out.println("2: Ket Thuc");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println(stopWatch.Start());
                    break;
                case 2:
                    System.out.println(stopWatch.End());
                    break;
            }
        }while (choice!=0);
    }
}
