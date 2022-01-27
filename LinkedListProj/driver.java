/*
Zeek Granston
Data Structures

 */
import java.util.*;
public class driver {
    public static void main(String[] args) {
        LinkedListProject list = new LinkedListProject();
        Scanner kb = new Scanner(System.in);
        int userInput = 0;
        mainMenu();
        validation(userInput, kb, list);
    }
    //Method to take user input
    public static int userAddtoList(Scanner kb) {
        int input = kb.nextInt();
        return input;
    }
    /*
        Method containing user options
    */
    public static void switchMenu(LinkedListProject list, int userInput, Scanner kb) {
        if (userInput < 1 || userInput > 8) {
            System.out.println("Incorrect entry, enter a number 1-7 to choose from menu options");
            validation(userInput, kb, list);
        } else

            switch (userInput) {

                case 1:
                    System.out.println("Insert a number to add to the head");
                    list.insert_head(userAddtoList(kb));
                    Continue(list, userInput, kb);
                    break;

                case 2:
                    System.out.println("Insert a number to add to the tail");
                    list.insert_tail(userAddtoList(kb));
                    Continue(list, userInput, kb);
                    break;

                case 3:
                    System.out.println("The number " + list.head.getData() + " at the head has been removed");
                    list.removeHead();
                    Continue(list, userInput, kb);
                    break;

                case 4:
                    System.out.println("The number at the tail has been removed");
                    list.removeTail();
                    Continue(list, userInput, kb);
                    break;

                case 5:
                    System.out.println("Enter the number you want to find");
                    list.isThere(list.nodeCount, userAddtoList(kb));
                    Continue(list, userInput, kb);
                    break;


                case 6:
                    System.out.println("The current items in the list include: ");
                    list.printList();
                    Continue(list, userInput, kb);
                    break;


                case 7:
                    System.out.println("Currently " + list.nodeCount + " nodes in the list");
                    Continue(list, userInput, kb);
                    break;

                case 8:
                    System.out.println("Exit Program");
                    break;


            }


    }
    /*
         Checks to ensure that input is not a non-integer
         if non-integer selected user is prompted to try again
         Precondition: List, Integer(for user to select menu options & navigate list),Scanner to take entry.
         Post Condition: User enters integer,list choices can be selected using the switchMenu method.
         */
    public static int validation(int userInput, Scanner kb, LinkedListProject list) {
        while (true) {
            try {
                userInput = kb.nextInt();

                switchMenu(list, userInput, kb);


                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter an integer: ");
                kb.nextLine();
            }
        }

        return userInput;
    }
    /*
     Asks the user if they would like to continue
     Precondition: List, Integer(for user to select menu options & navigate list),Scanner to take entry.
     Post Condition: Program continues to run until user exits.
     */
    public static void Continue(LinkedListProject list, int userInput, Scanner kb) {
        mainMenu();
        validation(userInput, kb, list);

    }
    //Main Menu takes no input just displays options
    public static void mainMenu(){
    System.out.println("***********User Menu***********");
    System.out.println("1.Add to the list head.");
    System.out.println("2.Add to the list tail.");
    System.out.println("3.Remove from the list head.");
    System.out.println("4.Remove from the  list tail.");
    System.out.println("5.Search the list for a target.");
    System.out.println("6.Print the list.");
    System.out.println("7.Count the amount of nodes.");
    System.out.println("8.Exit.");
    System.out.println("***********User Menu***********");
}
}



















