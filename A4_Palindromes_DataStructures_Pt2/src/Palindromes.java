// Name: Ian Chorne
// Class: CS 3305/ W02
// Term: Spring 2023
// Instructor:  Carla McManus
// Assignment:  04-Part-2-Palindromes
import java.util.Scanner;
import java.util.Stack;

public class Palindromes {
    public static void main(String[] args) {
        Stack<String> Stack_1 = new Stack<>();
        Stack<String> Stack_2 = new Stack<>();
        Stack<String> Stack_3 = new Stack<>();

        Scanner myScan = new Scanner(System.in);
        String input;
        System.out.println("Enter a word: ");
        input = myScan.nextLine();

        //Split the input string into characters?
        for(int i = 0; i < input.length(); i++){
            Stack_1.push(String.valueOf(input.charAt(i)));
            Stack_2.push(String.valueOf(input.charAt(i)));
        }
        while (!Stack_1.empty()) {
            Stack_3.push(Stack_1.pop());
        }

        if(Stack_2.equals(Stack_3)){
            System.out.println("The entered string is a palindrome");

        }
        else{
            System.out.println("The entered string is not a palindrome");
        }
    }
}

//FOR FUTURE REFERENCE - Resources used:
//https://beginnersbook.com/2014/01/java-program-to-check-palindrome-string/
//https://stackoverflow.com/questions/72375580/how-do-we-pop-one-stack-completely-into-another-stack