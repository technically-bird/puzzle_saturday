// Write a program to reverse a given string without using any built-in string manipulation functions.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to reverse?");
        String forward = scanner.nextLine(); // takes user input
        char[] ch_array = forward.toCharArray(); // moves user input into char array

        int i = 0; // ids the beginning of the ch_array
        int x = ch_array.length - 1; // ids the end of the ch_array
        char y ; // used as a holding variable in the array

        while (i < x) {
            y = ch_array[i]; // assigns current position to the hold
            ch_array[i] = ch_array[x]; // assigns the current end to current position
            ch_array[x] = y; // assigns the hold to end position
            i++;
            x--;
        }

        String reverse = new String(ch_array); // sets the reverse as a string
        System.out.println(forward);
        System.out.println(reverse);

    }
}
