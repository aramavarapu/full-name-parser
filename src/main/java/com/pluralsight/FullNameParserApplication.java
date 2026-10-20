package com.pluralsight;
import java.util.Scanner;
public class FullNameParserApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name: ");
        String fullName = scanner.nextLine().trim();

        int firstSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, firstSpace);
        String rest = fullName.substring(firstSpace + 1);
    }


}

