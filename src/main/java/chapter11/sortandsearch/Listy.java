package chapter11.sortandsearch;

/**
 * Created by ceejay562 on 9/27/2016.
 */
public class Listy {
    private int[] arr;

    public Listy(int[] arr){
        this.arr = arr;
    }

    public int elementAt(int i){
        try{
            return arr[i];
        } catch(IndexOutOfBoundsException e){
            return -1;
        }
    }

    private void popList(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,2,3,3,4,4,5};
        Listy l = new Listy(arr);
        for(int i=0; i<30; i++){
            System.out.println(l.elementAt(i));
        }
    }


}
