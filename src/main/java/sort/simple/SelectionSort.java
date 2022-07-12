package sort.simple;

//O(n2) 선택정렬
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 31, 5, 66, 9};
        selectionSort(arr);
        for(int i : arr)
            System.out.println(i);

    }

    public static void selectionSort(int[] arr) {
        final int L = arr.length;
        int k = 0;
        for(int i=0; i<L; i++) {
            int min = i;
            for(int j= i+1; j<L; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            if(min != i) {
                k = arr[i];
                arr[i] = arr[min];
                arr[min] = k;
            }
        }
    }
}
