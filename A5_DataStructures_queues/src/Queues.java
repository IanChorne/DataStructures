// Name: Ian Chorne
// Class: CS 3305 / W02
// Term: Spring 2023
//Instructor:  Carla McManus
//Assignment:  05-Part-1-Queues

import java.util.LinkedList;
import  java.util.Scanner;
public class Queues {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue();
        Scanner myScan = new Scanner(System.in);
        String name;
        int priority = 0;
        int choice = 0;

        //Menu for user to use
        while(choice != 4){
            System.out.println("Press 1 to add a chore. Press 2 to view your to-do list. Press 3 to cross off your highest priority chore. press 4 to exit.");
            choice = myScan.nextInt();
            myScan.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter a chore to add to your to do list: ");
                    name = myScan.nextLine();
                    System.out.println("What is the priority of this chore?");
                    priority = myScan.nextInt();
                    myScan.nextLine();

                    //Add new chore to to-do list
                    Chore newChore = new Chore(name, priority);
                    pQueue.enqueue(newChore);
                    break;
                case 2:
                    System.out.println("Here is your to-do list: ");
                    for(int i = 0; i < pQueue.size(); i++){
                        System.out.println(pQueue.choreList.get(i).getName() + ", " + pQueue.choreList.get(i).getPriority());
                    }
                    break;
                case 3:
                    char hasFinished;
                    System.out.println("Have you completed your highest priority chore? Y/N");
                    hasFinished = myScan.next().charAt(0);
                    if(hasFinished == 'Y' || hasFinished == 'y'){
                        System.out.println(pQueue.dequeue());
                    }
                    else{
                        System.out.println("Get to work then!");
                    }
                    break;
                case 4:
                    break;
            }
        }

        //While(!= finished)
        //enter chore to remove once you've completed it
        //pQueue.dequeue(choreToRemove.getname())

    }

}
class Chore /*implements Comparable<Chore>*/{
    String name;
    int priority;

    Chore(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public int getPriority(){
        return this.priority;
    }
    public String getName(){
        return this.name;
    }
}

class PriorityQueue{
    LinkedList<Chore> choreList = new LinkedList<>();
    public int size(){
        return choreList.size();
    }
    PriorityQueue(){

    }

    public void enqueue(Chore c){
        int newPriority = c.getPriority();
        //If list is empty, add the new chore first
        if(choreList.isEmpty()){
            choreList.addFirst(c);
            return;
        }
        //If new chore priority is less than the first chore in list, then add it to the front
        else if(newPriority < choreList.getFirst().getPriority()){
            choreList.addFirst(c);
            return;
        }
        //If new chore priority is greater than the last chore in list, then add it to the end
        else if(newPriority > choreList.getLast().getPriority()){
            choreList.addLast(c);
            return;
        }
        for(int i = 0; i < choreList.size(); i++){
            //Variables to compare the new chore to the next two in the list
            Chore leftChore = choreList.get(i);
            Chore rightChore = choreList.get(i + 1);
            //Add next at correct index
            if(newPriority > leftChore.getPriority() && c.getPriority() < rightChore.getPriority()){
                choreList.add(i+1, c);
                return;
            }
            else if(newPriority == leftChore.getPriority()){
                choreList.add(i, c);
                return;
            }
            else if(newPriority == rightChore.getPriority()) {
                choreList.add(i+1, c);
                return;
            }
        }
    }

    public String dequeue(){
        if(choreList.isEmpty()){
            return "No chores to remove, to-do list is empty";
        }
        else{
            System.out.println("Current top of the list is: " + choreList.getFirst().getName());
            choreList.removeFirst();
            return "New highest priority chore is: " + choreList.getFirst().getName();
        }
    }



}

/*
Pseudocode
    static class Chore
        STRING name
        INT priority

        CONSTRUCTOR Chore(name, priority)
            Chore.name = name
            Chorne.priority = priority

     MAIN
        LinkedList<Chore> ListOfChores
        PriorityQueue pQueue

        ListOfChores.add(chores, priority)

        //add list to pQueue

        WHILE pQueue != empty
            PRINT To do List: + chores
 */

//Resources used:
//https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
//

//Scrapped code:


        /*do{
            System.out.println("Enter a chore to add to your to do list: ");
            name = myScan.nextLine();
            System.out.println("What is the priority of this chore?");
            priority = myScan.nextInt();
            myScan.nextLine();
            //listOfChores.add(new Chore(name, priority));

            Chore newChore = new Chore(name, priority);
            pQueue.enqueue(newChore);
            System.out.println("Do you want to enter a new chore? Y/N");
            addChore = myScan.nextLine();
            System.out.println(addChore);
            if(addChore.equals("N")){
                break;
            }
            //myScan.nextLine();
        }while (!addChore.equals('N'));*/
