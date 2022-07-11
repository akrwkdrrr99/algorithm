package sort;

//O(n2) 버블정렬
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 31, 5, 66, 9};
        bubbleSort(arr);
        for(int i : arr)
            System.out.println(i);

    }

    public static void bubbleSort(int[] arr) {
        final int L = arr.length;
        int k;
        for(int i=0; i<L; i++) {
            for(int j=0; j<L; j++) {
                if(j+1< L && arr[j] > arr[j+1]) {
                    k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
    }
}
