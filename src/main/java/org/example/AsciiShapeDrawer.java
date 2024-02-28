package org.example;
import java.util.Scanner;

public class AsciiShapeDrawer {
    Scanner scanner = new Scanner(System.in);
    public void drawShape(int choice){
        //conditional menu
        switch (choice){
            case 1:
                System.out.println("Enter the height of triangle: ");
                int triangle = scanner.nextInt();
                drawTriangle(triangle);
                break;
            case 2:
                System.out.println("Enter the height of square : ");
                int square = scanner.nextInt();
                drawSquare(square);
                break;
            case 3:
                System.out.println("Enter the Long of rectangle : ");
                int rectanglelong = scanner.nextInt();

                System.out.println("Enter the wide of rectangle : ");
                int rectanglewide = scanner.nextInt();
                drawRectangle(rectanglelong, rectanglewide);
                //nested loop
                    /*for(int i = 1; i <= rectanglelong;i++){
                        for (int j = 1; j <= rectanglewide; j++){
                            System.out.print(" * ");
                        }
                        //inner loop
                        System.out.println();
                    }*/
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("invalid input");
        }

    }

    public void drawTriangle(int triangle) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= triangle; i++){
            for (int j = 1; j <= triangle- i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }

    public void drawSquare(int square) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= square;i++){
            for (int j = 1; j <= square; j++){
                System.out.print(" * ");
            }
            //inner loop
            System.out.println();
        }
    }

    public void drawRectangle(int rectanglelong, int rectanglewide) {
                 /*System.out.println("Enter the Long of rectangle : ");
                 int rectanglelong = scanner.nextInt();

                 System.out.println("Enter the wide of rectangle : ");
                 int rectanglewide = scanner.nextInt();
            //nested loop*/
        for(int i = 1; i <= rectanglelong;i++){
            for (int j = 1; j <= rectanglewide; j++){
                System.out.print(" * ");
            }
            //inner loop
            System.out.println();
        }
    }
    public void displayMenu(){
        System.out.println("Welcome to ASCII shape Drawer!");
        System.out.println( );
        System.out.println("Choose a shape to draw :");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");
    }

    public void run (){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Enter your choice :");
            int choice = scanner.nextInt();
            drawShape(choice); //dimana ada kondisional (if else atau switch case)
            System.out.println();
        }
    }
    public static void main (String[] args){
        //Inherintance (oop)
        //untuk running
        org.example.AsciiShapeDrawer drawer = new org.example.AsciiShapeDrawer();
        drawer.run();
    }
}