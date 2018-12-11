import java.util.Arrays;
public class Sorts{

  public static void main(String[] args){
    int[] arguements = new int[args.length];
    for (int i = 0; i<args.length; i++){
      arguements[i] = Integer.parseInt(args[i]);
    }
    System.out.println("These are your args: " + Arrays.toString(arguements));
    //swap(arguements, 2, 4);
    //System.out.println("Swap 4th and 2nd index: " + Arrays.toString(arguements));
    selectionSort(arguements);
    System.out.println("sSorted args: " + Arrays.toString(arguements));
    //selectionsort(arguements);
    //System.out.println("Sorted with selectionsort: " + Arrays.toString(arguements));
  }
  public static void swap(int[] ary, int i1, int i2){
    int hold = ary[i2];
    ary[i2] = ary[i1];
    ary[i1] = hold;
  }
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] ary){
    for(int currentIndex = 0; currentIndex < ary.length; currentIndex++){
      int indexOfSmall = currentIndex;
      for (int i = currentIndex; i<ary.length; i++){
        if (ary[i] < ary[indexOfSmall]){
          indexOfSmall = i;
        }
      }
     //System.out.println("What array looks like now:" + Arrays.toString(ary));
     //System.out.println("CurrentIndex: " + currentIndex + " indexOfSmall: " + indexOfSmall + " value of small: " + ary[indexOfSmall]);
//      System.out.println("What array looks like now:" + Arrays.toString(ary));
      swap(ary, indexOfSmall, currentIndex);
    }
  }
 /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
 public static void bubbleSort(int[] ary){
 	boolean done = false;
 	while(!done){
		boolean aSort = false;
		for (int i = 0; i<ary.length-1; i++){
			if (ary[i]>ary[i+1]){
				swap(ary,i,i+1);
				aSort = true;
			}
		}
		if (!aSort) {
			done = true;
		}
		//System.out.println("What array looks like now:" + Arrays.toString(ary));
	}
 }

 public static void insertionSort(int [] ary){
   for (int i = 1; i<ary.length; i++){
     //System.out.println("Current array:" + Arrays.toString(ary));
     int current = ary[i];
     boolean sorted = false;
     int j = i-1;
     if (current>ary[i-1]){
       sorted = true;
     }
     while (!sorted){
       if(ary[j] > current){
         ary[j+1] = ary[j];
         j--;
       }
       if(j == 0){
         ary[0] = current;
         sorted = true;
       }
       else{
         ary[j+1] = current;
         sorted = true;
       }
       /**
       if (current<ary[j]){
         for (int k = i; k >= j; k--){
           if (k == j){
             ary[j] = current;
           }
           else{
             ary[k] = ary[k-1];
           }
         }
         //ary[j] = current;
         sorted = true;
       }
       else{
         j++;
       }
       **/
     }
   }
 }
}
