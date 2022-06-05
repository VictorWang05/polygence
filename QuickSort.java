public class QuickSort {
    private int[] array;

    public QuickSort(int[] arr){
        array = arr;
    }

    public void quickSort(int arr[], int front, int back){
        if(front <back){
            int pi = sort(arr,front,back);

            quickSort(arr,front, pi-1);
            quickSort(arr, pi+1, back);
        }
    }
    public int sort(int arr[],int front, int back){

        int i = (front -1);
        int pivot = arr[back];

        for(int j=front; j<back ;j++){
            if(arr[j]<=pivot){
                i++;
                swap(i,j);
            }
        }
        swap(i+1,back);
        return (i+1);
    }

    private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; 
    }

    public void print(int[] array){
        System.out.print("[");  
        for(int a=0; a<array.length-1;a++){
            System.out.print(array[a]+",");
        } 
        System.out.print(array[array.length-1]+"]");

    }
}
