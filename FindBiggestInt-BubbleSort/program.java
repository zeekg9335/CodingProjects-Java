import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class program {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 32, 50, 600, 23, 90, 3};
        //System.out.println(addint(nums));
        //System.out.println(search(nums, 600));
       //reverseArray(nums);
        var sort = new BubbleSort();
        sort.BubbleSorter(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int addint(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];

            }

        }

        return count;
    }


    public static int search(int[] x, int y) {
        int leftPointer = 0;
        int resut = 0;
        int rightPointer = x.length - 1;
        for (int i = 0; i < rightPointer; i++) {
            if (x[leftPointer] == y || x[rightPointer] == y) {
                return y;
            }
            if (leftPointer < y) {
                leftPointer++;
            }
            if (rightPointer > y) {
                rightPointer--;
            }
            if (x[leftPointer] == y) {
                resut += x[leftPointer];
                return resut;
            }
            if (x[rightPointer] == y) {
                resut += x[leftPointer];
                return resut;
            }

        }

        return -1;
    }

    public static int regSort(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return x;
            } else
                return -1;

        }

        return -1;
    }

    /* public List<String> restoreIpAddresses(String s) {
         for (int i =0; i< s.length(); i++){


             restoreIpAddresses(s).add(s.substring());
             s.substring(1);
         }
         return null;
     }*/
    public static void reverseArray(int[] a) {
   List<Integer> reverse =  new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter something to search in the array for what you need");

        int userInput=keyboard.nextInt();
   for (int nums: a){
       reverse.add(nums);

   }
        if  (reverse.contains(userInput)){
            System.out.println("found it");
        }
        else {
            System.out.println("Naah playa");
        }





        //for (int i = a.length - 1; i >= 0; i--) {
           // System.out.println(a[i]);
            //reverseArray(a);



            //}

        }
    }


