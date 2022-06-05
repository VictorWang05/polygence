public class MergeSort {
    private int[] array;

    public MergeSort(int[] arr){
        array = arr;
    }

    public void sort(int[] arr, int l, int m, int r){

       int n1 = m - l + 1;
       int n2 = r - m;

       int L[] = new int[n1];
       int R[] = new int[n2];

       for (int i = 0; i < n1; ++i)
           L[i] = arr[l + i];
       for (int j = 0; j < n2; ++j)
           R[j] = arr[m + 1 + j];

       int i = 0, j = 0;

       int k = l;
       while (i < n1 && j < n2) {
           if (L[i] <= R[j]) {
               arr[k] = L[i];
               i++;
           }
           else {
               arr[k] = R[j];
               j++;
           }
           k++;
       }

       while (i < n1) {
           arr[k] = L[i];
           i++;
           k++;
       }

       while (j < n2) {
           arr[k] = R[j];
           j++;
           k++;
       }
     
    }

    public void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            sort(arr, l, m, r);
        }
    }

    public void print(int[] array){
        System.out.print("[");
        for(int a=0; a<array.length-1;a++){
            System.out.print(array[a]+",");
        } 
        System.out.print(array[array.length-1]+"]");

    }
}
