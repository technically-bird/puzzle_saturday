// prompt: Write a program that prints the numbers from 1 to 100.
// But for multiples of 5, print “Fizz” instead of the number, and for multiples of 7, print “Buzz“.
// For numbers that are multiples of both 5 and 7, print “FizzBuzz.”
// from: https://howtodoinjava.com/interview-questions/interview-puzzles-coding-exercises/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 5 ==0 && i % 7 ==0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0 ) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
