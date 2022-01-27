public class sortAlgo {
private int count;
private int numSwaps;
private int mergesortCounter;


  /*Precondition
    A non empty string array is taken in

    Postcondition
    String array is sorted alphabetically
   */
    public void bubbleSort(String[] array) {
        int i = 0, b;
        boolean keepGoing = false;
        while(!keepGoing) {
            keepGoing = true;
            for (i = 0; i < array.length - 1; i++) {
                if(compare(array[i],array[i+1])>0){
                    swap(array, i, i + 1);
                    keepGoing = false;

                }

            }
        }


    }

    public void quickSort(String []array,int low, int high){
        if (low <high){
            int pi = partition(array,low,high);
            quickSort(array,low,pi);
            quickSort(array,pi+1,high-1);
        }


    }

    /*Precondition
      A non-empty string array is taken in, a low number and high number to partition the array
      based on the size of the array

      Post condition
      Array is partitioned and returned to be sorted
     */
    public int partition(String []arr, int low, int high){
        int pivot = arr.length-1;
        int i = low-1;
        for (int j = 0 ;j<high-1;j++){
            if (compare(arr[pivot], arr[j])<0){
                i++;
                swap(arr,pivot,j);
            }

        }

        swap(arr,i+1,high);
        return (i+1);


    }

    public void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        getSwaps();

    }


    /*Precondition
     Two strings are taken in

      Postcondition
      String strings are compared and a value is returned based on which string is bigger
     */
public int compare(String a, String b){

        int i = a.length();
        int j =b.length();
        int min = Math.min(i,j);
    char []arr1 =a.toCharArray();
    char[]arr2= b.toCharArray();
        for(int k = 0;k<min;k++) {


            if (arr1[k] != arr2[k]) {
                char c1 = arr1[k];
                char c2 = arr2[k];
                getCompares();
                if (c1 != c2)
                    return c1 - c2;


            }
        }

        return i-j;

}





public void printArray(int [] array){
        for (int s : array) {
            System.out.println(s);
        }
    }
    public void printArray(String [] array){
        for (String s : array) {
            System.out.println(s);
        }
    }


    /*Precondition
      A non empty string array is taken in

      Postcondition
      String array is Array is Split into smaller arrays then passed into the merge sort method to be sorted
     */
   public void merge(String []array){
        if(array.length>=2)
        {
            String[] left = new String[array.length/2];
            String[] right = new String[array.length-array.length/2];


            for(int i = 0;i<left.length;i++){
                left[i]=array[i];
            }
            for(int i=0;i<right.length;i++){
                right[i]= array[i+array.length/2];
            }
            merge(left);
            merge(right);
            mergeSort(array,left,right);

        }
   }

    /*Precondition
      Three string arrays are taken in: main array, and sub arrays

      Postcondition
      Arrays are sorted and merged back together
     */
public void mergeSort(String []array, String[]a,String[]b){
        int i=0,j=0,compare = 0;

        for(int k = 0;k<array.length;k++ ){

            if (j>= b.length||(i<a.length&& compare(a[i],b[j])<0)) {
                //fills left array
                array[k] = a[i];
                i++;
            }
            else
            {
                //fills right array
                array[k]=b[j];
                 mergesortCounter = (j - k);
                j++;

            }
        }

}
    public int getCompares(){
        return count++;
    }

public int getSwaps(){
        return numSwaps++;
}
public int getMergesortCounter(){
        return mergesortCounter++;
}
}



