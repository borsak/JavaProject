package org.example;
import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in);
    public void drawShape(int choice){
        //conditional menu
        switch (choice){
            case 1:
                System.out.println("masukan berapa tinggi segitiga");
                int tinggiSegitiga = scanner.nextInt();
                drawTriangleSS(tinggiSegitiga);
                break;
            case 2:
                System.out.println("masukan berapa tinggi segitiga");
                int tinggiSegitiga2 = scanner.nextInt();
                drawTriangleSK(tinggiSegitiga2);
                break;
            case 3:
                break;
            default:
                System.out.println("invalid input");
        }

    }

    public void drawTriangleSK(int tinggiSegitiga2) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= tinggiSegitiga2; i++){
            for (int j = 1; j <= tinggiSegitiga2 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }

    public void drawTriangleSS(int tinggiSegitiga) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= tinggiSegitiga;i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }


    public void displayMenu(){
        System.out.println("selamat datang di ASCII gambar!");
        System.out.println("pilih gambar");
        System.out.println("1. Segitiga siku - siku");
        System.out.println("2. Segitiga sama kaki");
        System.out.println("3. Exit");
    }

    public void run (){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Masukan pilihan anda");
            int choice = scanner.nextInt();
            drawShape(choice); //dimana ada kondisional (if else atau switch case)
            System.out.println();
        }
    }
    public static void main1 (String[] args){
        //Inherintance (oop)
        //untuk running
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}