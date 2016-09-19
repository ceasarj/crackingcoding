package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ceejay562 on 9/17/2016.
 */
public class QuickSort<T extends Comparable> implements Sort{

    private List<T> list;

    private void swap(List<T> l, int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private void sortHelper(List<T> l, int min, int max){
        if(min >= max) return;
        print(list );
        int mid = (max + min)/2;
        T pivot = list.get(min);
        int i=min;
        int k=max;
        while(i < k){
            while( i < k  && list.get(i).compareTo(pivot) <= 0) i++;
            while(k >= i && pivot.compareTo(list.get(k)) <= 0) k--;

            if(i <= k){
                swap(l, i, k);
            }

        }
        swap(l, min, k);
        if (min < k) sortHelper(l,min, k-1);
        if (i < max)sortHelper(l, k+1 , max );
    }

    @Override
    public List sort(List l) {
        this.list = l;
        sortHelper(list, 0, l.size()-1);
        return this.list;
    }

    @Override
    public void print(List l) {
        l.forEach(e ->{
            System.out.print( e + " ");
        });
        System.out.println("");
    }

    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(7);
        l.add(3);
        l.add(3);
        l.add(5);
        l.add(2);
        l.add(6);
        l.add(1);
        Sort s = new QuickSort<>();
        s.print(s.sort(l));
    }
}
