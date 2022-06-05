public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] arr){
        array = arr;
    }

    public void selectionSort(){
        int min, minPos;

        for(int i=0;i<array.length-1;i++){
            min = array[i];
            minPos = i;
            for(int j=i+1; j<array.length;j++){
                if(min > array[j]){
                    min = array[j];
                    minPos = j;
                }
            }
            swap(i,minPos);
            
        }

        print(array);
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
