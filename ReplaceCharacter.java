package bhagirath;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string 1: ");
        String S = scanner.nextLine();
        
        System.out.print("Enter replace character from string 1: ");
        char o = scanner.next().charAt(0);
        
        System.out.print("Enter the new character: ");
        char n = scanner.next().charAt(0);
        
        String S1 = S.replace(o, n);
        System.out.println("Replaced String: " + S1);
    }
}
