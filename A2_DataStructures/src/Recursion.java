// Name: Ian Chorne
// Class: CS 3305/ W02
// Term: Spring 2023
//Instructor: Carla McManus
//Assignment: 2 – Part 2 Recursion

import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args)
    {
        try (Scanner myScan = new Scanner(System.in))
        {
            System.out.println("Enter a non-negative number: ");
            int input = myScan.nextInt();
            recursive(input);
        }
    }

    public static void recursive(int input)
    {
        recursive(input, 1, "");
    }

    public static void recursive(int input, int level, String tab)
    {
        if (level > input) {
            //System.out.println(tab + "Output value: 1");
            return;
        }
        System.out.println(tab + "This was written by call number: " + level);

        recursive(input, level + 1, tab.concat("\t"));
        System.out.println(tab + "This was ALSO written by call number: " + level);
        //System.out.println(tab + "Output value: " + output + " + 1");
        return;
    }
}


/*
public void main()
    write: Enter a number:
    read: int Input
    write:


public void howDeep(int n)
    int start = 0;
    if(n == 1)
        break;
    if(start == n)
        return "This was ALSO written by call number " + (n - 1);
    else
        return "This was written by call number " + (start + 1)
 */