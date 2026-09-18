package br.com.igorgc.exception.exception.test;

import br.com.igorgc.exception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);

        String usernameFromDatabase = "Pedro";
        String passwordFromDatabase = "Alves";

        System.out.println("Username");
        String enteredUsername = scanner.nextLine();

        System.out.println("Password");
        String enteredPassword = scanner.nextLine();

        if (!usernameFromDatabase.equals(enteredUsername)
                || !passwordFromDatabase.equals(enteredPassword)) {
            throw new LoginInvalidException("Invalid username or password");
        }

        System.out.println("User logged in successfully");

    }
}