
package com.betulgulcicek;

import java.util.Scanner;
/**
 * 
 * @author  Betul Gulcicek
 */

public class CASApplication {

    /**
     * main method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CASConsoleUI casui = new CASConsoleUI();

        System.out.println("1 - KENDIM DENEMEK ISTIYORUM" + "\n"
                + "2 - HAZIR SENARYOLARI KULLANMAK ISTIYORUM" + "\n"
                + "3 - CIKIS");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice == 1 || choice == 2 || choice == 3)) {
            System.out.println("Tekrar Giriniz");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        if (choice == 1) {
            casui.processCommandsConsole();
        } else if (choice == 2) {
            casui.processSenarios();
        } else if (choice == 3) {
            return;

        }

    }

}
