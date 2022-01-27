public class BubbleSort {

    public static void BubbleSorter(int [] array){

        for (int i = 0; i < array.length; i++){
            for (int j= 1; j < array.length;j++ ){
                if (array[j] > array[j-1])
                sort(array,array[i], array[j-1]);
            }
        }
    }

   static void sort(int [] arr, int i, int j){
          int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
   }


}
