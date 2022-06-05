public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] arr){
        array = arr;
    }

    public int binarySearch(int[] arr, int front, int back, int target){
        int mid = (back+front)/2;
        while(front<back){
            if(arr[mid]<target){
                return binarySearch(arr, mid+1, back, target);
            }
            else if(arr[mid]>target){
                return binarySearch(arr, front, mid-1, target);
            }
            
            return mid;
        }
        
        return -1;
    }
}
