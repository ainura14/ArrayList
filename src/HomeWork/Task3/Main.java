package HomeWork.Task3;

import HomeWork.Task3.models.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerINT = new Scanner(System.in);
        Scanner scannerSTR = new Scanner(System.in);
        ArrayList<Reader> readers = new ArrayList<>();
        Reader reader = new Reader();
        System.out.println("""
                1. sign in
                2. sign up
                """);
        boolean isTrue = false;
        while(isTrue){
            int value = scannerINT.nextInt();
            switch(value){
                case 1->{
                    System.out.println("Enter your full name");
                    reader.setFullName(scannerSTR.nextLine());

                    System.out.println("Enter your email: ");
                    reader.setEmail(scannerSTR.nextLine());

                    System.out.println();
                }
            }
        }
    }
}
