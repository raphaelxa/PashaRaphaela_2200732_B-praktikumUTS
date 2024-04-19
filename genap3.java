/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author pasha
 */

    import java.util.Scanner;

public class genap3 {
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int inputNumber = scanner.nextInt();

        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " adalah palindrom.");
        } else {
            System.out.println(inputNumber + " bukan palindrom.");
        }
        scanner.close();
    }
}

    

