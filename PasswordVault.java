import java.io.Console;
import java.util.Scanner;

public class PasswordVault {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("To avoid console errors, run this program from Terminal or Command Prompt.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int shift = 3; // Caesar Cipher shift value
        String encryptedPassword = "";

        while (true) {
            System.out.println("\n-- Welcome to PasswordVault --\n");
            System.out.println("1. Register your password");
            System.out.println("2. Login with your password");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    char[] charPassword = console.readPassword("Enter your Password: ");
                    String plainPassword = new String(charPassword);

                    encryptedPassword = encrypt(plainPassword, shift);
                    System.out.println("Password encrypted and registered successfully!");
                    break;

                case 2:
                    if (encryptedPassword.equals("")) {
                        System.out.println("No password registered. Please register first.");
                        break;
                    }

                    char[] loginChars = console.readPassword("Login with your Password: ");
                    String loginPassword = new String(loginChars);

                    String encryptedLoginPassword = encrypt(loginPassword, shift);

                    if (encryptedPassword.equals(encryptedLoginPassword)) {
                        System.out.println("Login Successful ✅");

                        System.out.println("\nEnter Your Choice:\n");
                        System.out.println("1. IT-Files");
                        System.out.println("2. Non-IT Files");
                        System.out.print("Choose Category: ");
                        int category = sc.nextInt();
                        sc.nextLine();

                        switch (category) {
                            case 1:
                                System.out.println("\n-- IT-Files --\n");
                                System.out.println("1. Java");
                                System.out.println("2. C");
                                System.out.println("3. Python");
                                System.out.println("4. Testing");
                                System.out.print("Choose file to open: ");
                                int fileChoice = sc.nextInt();
                                sc.nextLine();
                                showFile("IT", fileChoice);
                                break;

                            case 2:
                                System.out.println("\n-- Non-IT Files --\n");
                                System.out.println("1. Accountancy");
                                System.out.println("2. Finance");
                                System.out.println("3. Economics");
                                System.out.println("4. History");
                                System.out.print("Choose file to open: ");
                                int fileChoiceNonIT = sc.nextInt();
                                sc.nextLine();
                                showFile("NonIT", fileChoiceNonIT);
                                break;

                            default:
                                System.out.println("Invalid category selection.");
                        }
                    } else {
                        System.out.println("Incorrect Password ❌");
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Caesar Cipher Encryption
    public static String encrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) ((ch - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Show files based on category
    public static void showFile(String category, int choice) {
        System.out.println("\nOpening " + category + " file option: " + choice);

        if (category.equals("IT")) {
            switch (choice) {
                case 1: System.out.println("File - Java.pdf"); break;
                case 2: System.out.println("File - C.pdf"); break;
                case 3: System.out.println("File - Python.pdf"); break;
                case 4: System.out.println("File - Testing.pdf"); break;
                default: System.out.println("Invalid file selection."); break;
            }
        } else if (category.equals("NonIT")) {
            switch (choice) {
                case 1: System.out.println("File - Accountancy.pdf"); break;
                case 2: System.out.println("File - Finance.pdf"); break;
                case 3: System.out.println("File - Economics.pdf"); break;
                case 4: System.out.println("File - History.pdf"); break;
                default: System.out.println("Invalid file selection."); break;
            }
        }
    }
}
