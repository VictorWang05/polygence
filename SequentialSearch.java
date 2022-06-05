public class SequentialSearch {
    private int[] array;

    public SequentialSearch(int[] arr){
        array = arr;
    }

    public int sequentialSearch(int[] arr, int target){
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
