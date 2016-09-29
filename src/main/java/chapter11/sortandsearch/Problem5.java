package chapter11.sortandsearch;

/**
 * Created by ceejay562 on 9/27/2016.
 */
public class Problem5 {
    static int search(Listy l, int value){
        return search(l, value, 0, getSize(l));
    }

    static int search(Listy l, int value, int min, int max){
        if(min > max) return -1;
        int mid = (min + max) /2;
        System.out.println(mid);
        if(l.elementAt(mid) > value){
            return search(l, value, min, mid -1);
        }
        else if(l.elementAt(mid) < value){
           return search(l, value, mid +1, max);
        } else{
            return mid;
        }
    }

    static int getSize(Listy l){
        int base = 1;

        while(l.elementAt(base) >= 0){
            base *= 2;
        }

        return base;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,3,4,5,6,7,8,9,10,10,10,111};
        Listy l = new Listy(arr);
        System.out.println(search(l, 3));
    }


}
