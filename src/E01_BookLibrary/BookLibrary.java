package E01_BookLibrary;

import java.util.Scanner;

public class BookLibrary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] bookTitles = {"The Hitchhiker's Guide to the Galaxy", "Pride and Prejudice", "To Kill a Mockingbird"};
        int[] bookQuantities = {5, 3, 2};
        int choice;

        do {
            System.out.println("\nBook Library Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableBooks(bookTitles, bookQuantities);
                    break;
                case 2:
                    borrowBook(bookTitles, bookQuantities);
                    break;
                case 3:
                    returnBook(bookTitles, bookQuantities);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public static void displayAvailableBooks(String[] titles, int[] quantities) {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < titles.length; i++) {
            if (quantities[i] > 0) {
                System.out.println((i + 1) + ". " + titles[i] + " - " + quantities[i] + " copies available");
            }
        }
    }

    public static void borrowBook(String[] titles, int[] quantities) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the book to borrow: ");
        int bookIndex = input.nextInt() - 1;

        if (bookIndex >= 0 && bookIndex < titles.length && quantities[bookIndex] > 0) {
            quantities[bookIndex]--;
            System.out.println("You have borrowed " + titles[bookIndex] + ".");
        } else {
            System.out.println("Invalid book selection or no copies available.");
        }
    }

    public static void returnBook(String[] titles, int[] quantities) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the book to return: ");
        int bookIndex = input.nextInt() - 1;

        if (bookIndex >= 0 && bookIndex < titles.length) {
            quantities[bookIndex]++;
            System.out.println("You have returned " + titles[bookIndex] + ".");
        } else {
            System.out.println("Invalid book selection.");
        }
    }
}
