package com.michaelcane;

import java.util.Scanner;

public class UserInputHandler {


    public static Scanner input = new Scanner(System.in);

    /**
     * This method will ask the user for an integer.
     * @param msg
     * @return
     */
    public static int promptUserForInt(String msg) {
        promptUser(msg);
        return input.nextInt();
    }

    /**
     * This method will show the message passed to it.
     * @param msg
     */
    public static void promptUser(String msg) {
        System.out.println(msg);
    }
}
