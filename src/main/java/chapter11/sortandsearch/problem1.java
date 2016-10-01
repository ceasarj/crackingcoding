package chapter11.sortandsearch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ceejay562 on 9/26/2016.
 */
public class problem1 {

    public static void merge(int[] a, int[] b) {
        int indexMerged = a.length - 1;
        int i1 = a.length - b.length - 1;
        int i2 = b.length - 1;

        while(indexMerged >= 0){
            if(i1 >=0 && i2>=0 && a[i1] > b[i2]){
                a[indexMerged] = a[i1];
                i1--;
            } else {
                a[indexMerged] = b[i2];
                i2--;
            }
            indexMerged--;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 100, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 6, 7, 7};
        merge(a, b);
        for(int e: a){
            System.out.println(e + " ");
        }
    }


}
