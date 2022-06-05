public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] arr){
        array = arr;
    }

    public void insertionSort(){
        for(int i=0; i<array.length;i++){

            int now = array[i];
            int j=i-1;

            while(j>=0 && array[j]>now){
                array[j+1]=array[j];
                j--;
            }

            array[j+1]= now;
        }

        print(array);
    }

    public void print(int[] array){
        System.out.print("[");
        for(int a=0; a<array.length-1;a++){
            System.out.print(array[a]+",");
        } 
        System.out.print(array[array.length-1]+"]");

    }
}
