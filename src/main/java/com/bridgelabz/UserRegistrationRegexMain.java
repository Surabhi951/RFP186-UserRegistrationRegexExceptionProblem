package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationRegexMain {
    public static void main(String[] args) throws InvalidUserDetailsException {

        UserRegistrationRegex userRegistrationRegex = new UserRegistrationRegex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        userRegistrationRegex.validFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = sc.next();
        userRegistrationRegex.validLastName(lastName);

        System.out.println("Enter email");
        String email = sc.next();
        userRegistrationRegex.validEmail(email);

        System.out.println("Enter mobile number");
        sc.nextLine();
        String mobileNo = sc.nextLine();
        userRegistrationRegex.validMobileNo(mobileNo);

        System.out.println("Enter password minimum 8 character");
        String passwordRule1 = sc.next();
        userRegistrationRegex.validPasswordRule1(passwordRule1);

        System.out.println("Enter atleast one uppercase letter in password");
        String passwordRule2 = sc.next();
        userRegistrationRegex.validPasswordRule2(passwordRule2);

        System.out.println("Enter atleast one numeric number in password");
        String passwordRule3 = sc.next();
        userRegistrationRegex.validPasswordRule3(passwordRule3);

        System.out.println("Enter exactly one special character in password");
        String passwordRule4 = sc.next();
        userRegistrationRegex.validPasswordRule4(passwordRule4);
    }
}
