import java.util.*;
public class CommandParser {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter command (type 'exit' to quit):");

	        while (true) {
	            System.out.print("> ");
	            String input = sc.nextLine();

	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting...");
	                break;
	            }

	            parseCommand(input);
	        }

	        sc.close();
	    }

	    public static void parseCommand(String input) {
	        String[] parts = input.split(" ");

	        String command = parts[0];

	        switch (command.toLowerCase()) {

	            case "add":
	                if (parts.length == 3) {
	                    int a = Integer.parseInt(parts[1]);
	                    int b = Integer.parseInt(parts[2]);
	                    System.out.println("Result: " + (a + b));
	                } else {
	                    System.out.println("Usage: add num1 num2");
	                }
	                break;

	            case "sub":
	                if (parts.length == 3) {
	                    int a = Integer.parseInt(parts[1]);
	                    int b = Integer.parseInt(parts[2]);
	                    System.out.println("Result: " + (a - b));
	                } else {
	                    System.out.println("Usage: sub num1 num2");
	                }
	                break;

	            case "mul":
	                if (parts.length == 3) {
	                    int a = Integer.parseInt(parts[1]);
	                    int b = Integer.parseInt(parts[2]);
	                    System.out.println("Result: " + (a * b));
	                } else {
	                    System.out.println("Usage: mul num1 num2");
	                }
	                break;

	            case "div":
	                if (parts.length == 3) {
	                    int a = Integer.parseInt(parts[1]);
	                    int b = Integer.parseInt(parts[2]);
	                    if (b != 0) {
	                        System.out.println("Result: " + (a / b));
	                    } else {
	                        System.out.println("Cannot divide by zero");
	                    }
	                } else {
	                    System.out.println("Usage: div num1 num2");
	                }
	                break;

	            case "help":
	                System.out.println("Available commands:");
	                System.out.println("add a b  -> Addition");
	                System.out.println("sub a b  -> Subtraction");
	                System.out.println("mul a b  -> Multiplication");
	                System.out.println("div a b  -> Division");
	                System.out.println("exit     -> Quit program");
	                break;

	            default:
	                System.out.println("Unknown command. Type 'help'");
	        }
	    }
	}