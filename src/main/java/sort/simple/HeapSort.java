package sort.simple;

import java.util.PriorityQueue;

// todo : 2진트리
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {15, 1, 6, 31, 5, 66, 9, 13};

        // 1. 짧은 코드
//        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
//        for(int i : arr)
//            heap.add(arr[i]);
//        for(int i : arr)
//            arr[i] = heap.poll();

        // 2. 직접구현
        sort(arr);

        for(int i : arr)
            System.out.println(i);
    }

    /*
    *
    * 힙정렬 구현
    *
     */
    static void sort(int[] a) {
        sort(a, a.length);
    }

    private static void sort(int[] a, int size) {
        // 음수방지 코드
        if(size < 2) {
            return;
        }

        // 마지막 노드의 부모 선정
        int parentIdx = getParent(size - 1);

        // max heap
        for(int i = parentIdx; i>=0; i--) {
            heapify(a, i, size - 1);
        }

        for(int i = size - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a,0, i - 1);
        }
    }

    // 부모인덱스 확인
    private static int getParent(int child) {
        return (child - 1) / 2;
    }

    // 교환함수
    private static void swap(int[] a, int b, int c) {
        int k = a[b];
        a[b] = a[c];
        a[c] = k;
    }

    // 힙 재구성
    private static void heapify(int[] a, int parentIdx, int lastIdx) {
        int leftChildIdx = 2 * parentIdx + 1;
        int rightChildIdx = 2 * parentIdx + 2;
        int largestIdx = parentIdx;

        if(leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
            largestIdx = leftChildIdx;
        }

        if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
            largestIdx = rightChildIdx;
        }

        if(parentIdx != largestIdx) {
            swap(a, largestIdx, parentIdx);
            heapify(a, largestIdx, lastIdx);
        }
    }
}
