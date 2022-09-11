package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {

    public boolean validFirstName(String firstName) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("First name is valid");
        }
        else{
            throw new InvalidUserDetailsException("First name is Invalid");
        }
        return match.matches();
    }

    public boolean validLastName(String lastName) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(lastName);
        if (match.matches())
            System.out.println("Last name is Valid");
        else
            throw new InvalidUserDetailsException("Last name is InValid");
        return match.matches();
    }

    public boolean validEmail(String email) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@(.+)$");
        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email is Valid");
        else
            throw new InvalidUserDetailsException("Email is InValid");
        return match.matches();
    }

    public boolean validMobileNo(String mobileNo) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("^[\\d]{2}\\s[\\d]{10}$");
        Matcher match = pattern.matcher(mobileNo);
        if (match.matches())
            System.out.println("Mobile number is Valid");
        else
            throw new InvalidUserDetailsException("Mobile number is InValid");
        return match.matches();
    }

    public boolean validPasswordRule1(String passwordRule1) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("[0-9a-zA-Z@!+_.-]{8,}");
        Matcher match = pattern.matcher(passwordRule1);
        if (match.matches())
            System.out.println("Valid");
        else
            throw new InvalidUserDetailsException("Password must have 8 character");
        return match.matches();
    }

    public boolean validPasswordRule2(String passwordRule2) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}");
        Matcher match = pattern.matcher(passwordRule2);
        if (match.matches())
            System.out.println("Valid");
        else
            throw new InvalidUserDetailsException("Password must have atleast one uppercase letter");
        return match.matches();
    }

    public boolean validPasswordRule3(String passwordRule3) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("(?=.*[0-9])[0-9a-zA-Z@!+_.]{8,}");
        Matcher match = pattern.matcher(passwordRule3);
        if (match.matches())
            System.out.println("Valid");
        else
            throw new InvalidUserDetailsException("Password must have atleast one numeric number");
        return match.matches();
    }

    public boolean validPasswordRule4(String passwordRule4) throws InvalidUserDetailsException {
        Pattern pattern = Pattern.compile("(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}");
        Matcher match = pattern.matcher(passwordRule4);
        if (match.matches())
            System.out.println("Valid");
        else
            throw new InvalidUserDetailsException("Password must has exactly one special character");
        return match.matches();
    }
}
