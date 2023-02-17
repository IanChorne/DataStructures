// Name: Ian Chorne
// Class: CS 3305/ W02
// Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 2 – Part 1 Factorial

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        try (Scanner myScan = new Scanner(System.in))
        {
            System.out.println("Enter a non-negative number: ");
            int input = myScan.nextInt();
            System.out.println("Factorial of " + input + " is: " + factorial(input));
        }
    }

    public static int factorial(int n)
    {
        if(n == 0)
            return 1;
        else
            return(n * factorial(n - 1));
    }
}

/*PseudoCode

Factorial = n!, ex: 4*3*2*1 = 24

Public static void Main

Write("Enter a non-negative integer: ")

read: int input

Write("Factorial of input is: " + Factorial(input))

public static int Factorial(int input)

if(input == 0)

return 1;

else

return(input * Factorial(input - 1))*/