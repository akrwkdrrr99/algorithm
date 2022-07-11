package sort;

// 퀵 정렬  최소 O(n logn) ~ O(n2)
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {15, 1, 6, 31, 5, 66, 9, 13};
        quickSort(arr, 0, arr.length - 1);
        for(int i : arr)
            System.out.println(i);

    }

    // 재귀
    public static void quickSort(int[] arr, int start, int end) {
        int rear = CalcSort(arr, start, end);
        if(start < rear - 1)
            quickSort(arr, start, rear - 1);
        if(rear < end)
            quickSort(arr, rear, end);
    }

    public static int CalcSort(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start < end) {
            while(arr[start] < pivot) start++; // 앞부분 순회하면서 피봇 값
            while(arr[end] > pivot) end--;

            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr, int N, int M) {
        int tmp = arr[N];
        arr[N] = arr[M];
        arr[M] = tmp;
    }
}
