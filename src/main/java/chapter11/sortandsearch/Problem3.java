package chapter11.sortandsearch;

/**
 * Created by ceejay562 on 9/27/2016.
 */
public class Problem3 {

    public static int search(int[] arr, int value){
        return search(arr, value , 0, arr.length-1);
    }

    public static int search(int[] arr,int value, int min, int max){
        if(min > max) return -1;
        int mid = (min + max) / 2;
        if(arr[mid] == value) {
            return mid;
        }
        else if(arr[mid] > arr[min]){
            if(arr[mid] > value && value >= arr[min]){
                return search(arr, value, min, mid -1);
            }
            else {
                return search(arr, value, mid + 1, max);
            }
        } else {
            if(arr[mid] < value && value <= arr[max]){
                return search(arr, value, mid + 1, max);
            }
            else {
                return search(arr, value, min, mid -1);
            }
        }
    }
    public static void main(String[] args){
        int[] a = {7, 10, 11, 1, 2, 3, 4, 5};
        System.out.println(search(a, 11));
    }
}
