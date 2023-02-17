// Name: Ian Chorne
// Class: CS 3305/ W02
// Term: Spring 2023
// Instructor:  Carla McManus
// Assignment:  04-Part-1-Stacks
import java.util.Scanner;
public class TwoStacks {
    int size;       //Represents the number of elements in the array
    int array[];    //The array the stacks add to
    int topA, topB; //variables to keep track of he tops of the stacks

    TwoStacks(int n){
        array = new int[n];
        size = 0;
        topA = -1;
        topB = n;
    }
    public boolean pushA(int data){
        if(isFull()){
            System.out.println("Array is full");
            return false;
        }
        //push to start of array
        topA++;
        size++;
        array[topA] = data;
        return true;
    }
    public boolean pushB(int data){
        if(isFull()){
            System.out.println("Array is full");
            return false;
        }
        //push to back of array
        size++;
        topB--;
        array[topB] = data;
        return true;
    }
    public int popA() {
        if (AisEmpty()) {
            throw new IllegalArgumentException("Stack A is empty");
        }
        //doesn't feel right
        int num = array[topA];
        size--;
        topA--;
        return num;
    }
    public int popB(){
        if (BisEmpty()) {
            throw new IllegalArgumentException("Stack A is empty");
        }
        //doesn't feel right either
        int num = array[topB];
        size--;
        topB++;
        return num;
    }
    public boolean AisEmpty(){
        //A is from the start, so we need to check just one space back
        return topA == -1;
    }
    public boolean BisEmpty(){
        //B is from the end, so we need to check the whole thing
        return topB == array.length;
    }
    public boolean isFull(){
        return size == array.length;
    }

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(6);


        Scanner scanA = new Scanner((System.in));
        int inputA = 0;
        int count = 0;
        while(count < 3){
            System.out.println("Enter an int to push to stack A: ");
            inputA = scanA.nextInt();
            twoStacks.pushA(inputA);
            count++;
        }

        Scanner scanB = new Scanner((System.in));
        int inputB = 0;
        boolean success = true;
        while(success){
            System.out.println("Enter an int to push to stack B: ");
            inputA = scanB.nextInt();
            success = twoStacks.pushB(inputA);
        }
        while(!twoStacks.AisEmpty()){
            System.out.println("Popping data from stack A: " + twoStacks.popA());
        }
        while(!twoStacks.BisEmpty()){
            System.out.println("Popping data from stack B: " + twoStacks.popB());
        }

    }
}


//pointers for the array
//implement your own stack class, not generics
//Stack class needs to work with just ints
//Stack class needs to use arrays
//Take input
//Input = int[]
//Push int[] to stack A

//FOR FUTURE REFERENCE - Resources found and used:
//https://www.youtube.com/watch?v=LDb1X52LkbU&ab_channel=ProgrammingTutorials
//https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/

//Scrapped code:
/*
public void stackUsingArray(int size){
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }
 */

//Scrapped stack class/interface
/*
public class Stack<T> implements Stackable<T> {
    private Stack<T> previous; //reference to the item located current instance in stack order
    private T value;    //contains value of current instance of stack stores

    Stack() {
    }

    Stack(T value) {
        this.value = value;
    }

    Stack(Stack<T> previous, T value) {
        this.previous = previous;
        this.value = value;
    }

    @Override
    public void push(T value) {
        this.previous = new Stack<T>(this.previous, this.value);
        this.value = value;
    }

    @Override
    public T pop() {
        if (this.isEmpty())
            throw new IllegalArgumentException("Stack is empty");

        T top = this.value;                     //store current value in temp variable
        this.value = this.previous.value;       //set current value to one from previous stack item
        this.previous = this.previous.previous; //reference current previous attribute to the previous item of underlying item

        return top;                             //return removed value
    }

    @Override
    public T peek() {
        return this.value;
    }

    @Override
    public boolean isEmpty() {
        //since last stack item has no reference to another underlying item,
        //we just need to check if the previous item is null
        return this.previous == null;
    }

    @Override
    public int size() {
        return this.isEmpty() ? 0 : 1 + this.previous.size();
    }

    @Override
    public int search(Object o) {
        int count = 1;

        //loop through all stack items
        for (Stack<T> stack = this; !stack.isEmpty(); stack = stack.previous) {
            //if target item is reached, return it
            if (stack.value.equals(o)){
                return count;
            }
            //otherwise increase count
            count++;
        }
        //if there is no match, return -1
        return -1;
    }
}


//FUTURE REFERENCE
//Instructions and explanations found at this link:
//https://levelup.gitconnected.com/selfmade-stack-class-in-java-d401dc7d68f0

public interface Stackable<T> {
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    int search(Object o);
}
 */