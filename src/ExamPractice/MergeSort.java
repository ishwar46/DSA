package ExamPractice;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];


            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            Thread t1 = new Thread(() -> mergeSort(arr, l, m));
            Thread t2 = new Thread(() -> mergeSort(arr, m + 1, r));
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
