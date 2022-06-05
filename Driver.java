public class Driver {
    
    public static void main(String args[]){

        int[] array = {50,82,71,10,15,12,48,51,52,28,6,65,7,99,24};
        
        /*SelectionSort selection = new SelectionSort(array);
        selection.selectionSort(); */

        InsertionSort insertion = new InsertionSort(array);
        insertion.insertionSort(); 
        /*
        MergeSort merge = new MergeSort(array);
        merge.mergeSort(array,0,array.length-1);
        merge.print(array);

        
        QuickSort quick = new QuickSort(array);
        quick.quickSort(array,0,array.length-1);
        quick.print(array);

        
        BinarySearch binary = new BinarySearch(array);
        System.out.println("Target index: "+binary.binarySearch(array,0,array.length-1,3)); 

        SequentialSearch sequential = new SequentialSearch(array);
        System.out.println("Target index: "+sequential.sequentialSearch(array,3));*/
    }
}
