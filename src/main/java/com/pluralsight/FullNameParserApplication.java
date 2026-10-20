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

        String middleName;
        String lastName;

        int secondSpace = rest.indexOf(" ");

        if (secondSpace == -1) {
            middleName = "(none)";
            lastName = rest;
        } else {
            middleName = rest.substring(0. secondSpace);
            lastName = rest.subString(secondSpace +1);
        }
    }


}

