// Name: Ian Chorne
// Class: CS 3305/ W02
// Term: Spring 2023
//Instructor:  Carla McManus
//Assignment:  3 – Part 1 Iterator

public class LinkedList
{
    public static java.util.LinkedList<Integer> myList = new java.util.LinkedList<Integer>();
    public static void main(String[] args)
    {
        //List = {1, 1, 2, 3, 3, 4, 4, 5, 6, 7}
        myList.addFirst(1);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(4);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.addLast(7);

        removeRepetitions();
        printRange(2, 5);
        printRange(2, 78);
        printRange(2, 1);
        printRange(8, 5);
    }
    static void printRange(int x, int y)
    {
        boolean foundX = false;
        for (int i = 0; i < myList.size(); i++) //loops through list to find x
        {
            if (myList.get(i) == x)
            {
                foundX = true;
            }
            if (foundX)
            {
                if (myList.get(i) == y)
                {
                    break;
                }
                System.out.print(myList.get(i) + " ");
            }
        }
        if (!foundX)
        {
            System.out.print("");
        }
        System.out.println();
    }

    static void removeRepetitions()
    {
        for (int i = 0; i < myList.size() - 1; i++)
        {
            int p = myList.get(i);
            int q = i + 1;
            while (q < myList.size())
            {
                if (myList.get(q) == p)
                {
                    myList.remove(q);
                }
                else
                {
                    q++;
                }
            }
        }
    }
}


//Scrapped code
/*
Node current = head;        //Pointer Node
        current.data = head.data;
        boolean foundX = false;
        while (current != null)
        {
            if (current.data == x) //checks for x
            {
                foundX = true;
            }
            if (foundX)     //if x is found, print data up to that point
            {
                System.out.print(current.data + " ");
            }
            if (current.data == y)      //if y is found, stop printing data
            {
                System.out.println();
                return;
            }
            current = current.next;
        }
        System.out.println();
 */

/*
int xIndex = 0;
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i) == x)
            {
                xIndex = i;
                break;
            }
        }
        int yIndex = 0;
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i) == y)
            {
                yIndex = i;
                break;
            }
        }
        for(int i = xIndex; i < yIndex; i++)
        {
            System.out.println(myList.get(i));
        }
 */


//Nested way too much, need to refactor to clean up.
   /* void removeRepetitions()
    {
        Node current = head;
        int p;
        while(current != null)
        {
            for(int q : myList)     //For each num in list, create a variable q...
            {
                do
                {
                    p = q;          //...that is equal to p while q is not the last num in list
                    if(current.data == p)
                    {
                        myList.remove(current); //if next num equal to p, remove the next number
                    }
                    else
                    {
                        q = current.next.data;  //otherwise move q to the next num
                    }
                }while(q != myList.getLast());
            }
        }
    }
*/
//    class Node
//    {
//        int data;
//        Node next;
//        Node(int d) { data = d; }  //constructor to create a new node
//    }