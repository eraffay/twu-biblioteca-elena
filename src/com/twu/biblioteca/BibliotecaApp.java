package com.twu.biblioteca;

import java.util.*;
import com.twu.biblioteca.Book;

public class BibliotecaApp {

    private static ArrayList<Book> books = new ArrayList<Book>()
    {{
        add(new Book("The Great Gatsby","F. Scott Fitzgerald", 1925));
        add(new Book("The Grapes of Wrath", "John Steinbeck", 1939));
        add(new Book("Nineteen Eighty-Four","George Orwell", 1949));
        add(new Book("Ulysses", "James Joyce", 1918));
        add(new Book("Lolita", "Vladimir Nabakov", 1955));
        add(new Book("Catch-22", "Joseph Heller", 1961));
        add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        add(new Book("Beloved", "Toni Morrison", 1987));
        add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        add(new Book("One Hundred Years of Solitude", "J. R. R. Tolkien", 1954));
    }};

    private static List<String> menu = new ArrayList<String>()
    {{
        add("Quit");
        add("List Books");
    }};

    public static void main(String[] args) {

        System.out.println(welcomeMessage() + "\n");

        mainMenu();

    }


    public static String welcomeMessage() {
        return "Hello, Welcome to Biblioteca!";
    }

    public static void mainMenu() {
        do {
            displayMainMenu();
        }while(decideMainMenuAction(readUserChoice()));
    }

    public static Boolean decideMainMenuAction(int userChoice) {
        if (userChoice == 0){
            return false;
        }
        else if(userChoice != 1){
            System.out.println("Select a valid option!");
            return true;
        }else{
            printBookList();
            return true;
        }
    }

    public static void printBookList() {
        System.out.printf("%-35s%-25s%-4s\n", "Title", "Author", "Year");
        System.out.println("----------------------------------------------------------------");
        for (Book book : books){
            System.out.printf("%-35s%-25s%-4s\n", book.getTitle(), book.getAuthor(), book.getDatePublished());
        }
        System.out.println("----------------------------------------------------------------");
    }

    private static int readUserChoice() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static void displayMainMenu() {
        System.out.println("Main Menu: ");
        System.out.println("--------------------");
        for (int i = 0; i < menu.size(); i++){
            System.out.println("Option " + i + ": " + menu.get(i));
        }
        System.out.println("--------------------");
    }
}
