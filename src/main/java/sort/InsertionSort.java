package sort;

//O(n2) 삽입정렬
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {15, 31, 5, 66, 9};
        insertionSort(arr);
        for(int i : arr)
            System.out.println(i);

    }

    public static void insertionSort(int[] arr) {
        final int L = arr.length;
        for(int i=1; i<L; i++) {
            int k = arr[i];
            int idx = i;

            while(idx>0 && k < arr[idx - 1]) {
                arr[idx] = arr[idx - 1];
                idx--;
            }

            arr[idx] = k;
        }

    }
}
