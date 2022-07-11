package sort;

public class MergeSort {
    static int[] arr;
    static int[] tmp;
    public static void main(String[] args) {
        arr = new int[]{15, 1, 6, 31, 5, 66, 9, 13};
        tmp = new int[arr.length];
        mergeSort(0, arr.length);
        for(int i : tmp)
            System.out.println(i);

    }

    public static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            int midP = mid+1;
            mergeSort(start, mid);
            mergeSort(midP, end);
            int idx = start;
            while(start<= mid || mid+1<=end) {
                if(midP>end || (start <= mid && arr[start] < arr[midP])) {
                    tmp[idx++] = arr[start++];
                } else {
                    tmp[idx++] = arr[midP++];
                }
            }
            for(int i=start; i<=end; i++) {
                arr[i] = tmp[i];
            }
        }
    }
}
