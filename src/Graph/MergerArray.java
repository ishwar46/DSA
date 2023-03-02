package Graph;


import java.util.Arrays;
import java.util.Scanner;

//public class MergerArray {
//    public static void merge(int[] num1, int m, int[] num2, int n) {
//        int i = m - 1; // index of the last element in num1 that should be merged
//        int j = n - 1; // index of the last element in num2
//        int k = m + n - 1; // index of the last empty slot in num1
//
//        // Iterate over both arrays in reverse order, comparing the last elements of each array
//        while (i >= 0 && j >= 0) {
//            if (num1[i] > num2[j]) {
//                num1[k--] = num1[i--];
//            } else {
//                num1[k--] = num2[j--];
//            }
//        }
//
//        // If there are remaining elements in num2, copy them to the beginning of num1
//        while (j >= 0) {
//            num1[k--] = num2[j--];
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements in num1: ");
//        int m = scanner.nextInt();
//
//        int[] num1 = new int[m + 3];
//        System.out.println("Enter the elements of num1 in non-decreasing order:");
//        for (int i = 0; i < m; i++) {
//            num1[i] = scanner.nextInt();
//        }
//
//        System.out.print("Enter the number of elements in num2: ");
//        int n = scanner.nextInt();
//
//        int[] num2 = new int[n];
//        System.out.println("Enter the elements of num2 in non-decreasing order:");
//        for (int i = 0; i < n; i++) {
//            num2[i] = scanner.nextInt();
//        }
//
//        // Call the merge method to merge num1 and num2 into num1
//        merge(num1, m, num2, n);
//
//        // Print the sorted array
//        System.out.println("The merged and sorted array is: " + Arrays.toString(num1));
//    }
//}


//public class MergerArray {
//    public static void merge(int[] num1, int m, int[] num2, int n) {
//        int i = m - 1; // index of the last element in num1 that should be merged
//        int j = n - 1; // index of the last element in num2
//        int k = m + n - 1; // index of the last empty slot in num1
//
//        // Iterate over both arrays in reverse order, comparing the last elements of each array
//        while (i >= 0 && j >= 0) {
//            if (num1[i] > num2[j]) {
//                num1[k--] = num1[i--];
//            } else {
//                num1[k--] = num2[j--];
//            }
//        }
//
//        // If there are remaining elements in num2, copy them to the beginning of num1
//        while (j >= 0) {
//            num1[k--] = num2[j--];
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements in num1: ");
//        int m = scanner.nextInt();
//
//        int[] num1 = new int[m];
//        System.out.println("Enter the elements of num1 in non-decreasing order:");
//        for (int i = 0; i < m; i++) {
//            num1[i] = scanner.nextInt();
//        }
//
//        System.out.print("Enter the number of elements in num2: ");
//        int n = scanner.nextInt();
//
//        int[] num2 = new int[n];
//        System.out.println("Enter the elements of num2 in non-decreasing order:");
//        for (int i = 0; i < n; i++) {
//            num2[i] = scanner.nextInt();
//        }
//
//        // Call the merge method to merge num1 and num2 into num1
//        merge(num1, m, num2, n);
//
//        // Print the sorted array
//        System.out.println("The merged and sorted array is: " + Arrays.toString(num1));
//    }
//}









//



import java.util.Arrays;
import java.util.Scanner;

public class MergerArray {
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        if (num1.length < m + n) {
            throw new IllegalArgumentException("num1 array is not large enough to hold the merged arrays.");
        }

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        int[] num1 = new int[m + 100]; // add buffer for safety
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < m; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] num2 = new int[n + 100]; // add buffer for safety
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n; i++) {
            num2[i] = scanner.nextInt();
        }

        scanner.close();

        // Merge the two arrays
        merge(num1, m, num2, n);

        // Print the sorted array
        System.out.println("Merged array: " + Arrays.toString(Arrays.copyOf(num1, m+n)));
    }
}




//public class MergerArray{
//
//
//    public static void merge(int[] num1, int m, int[] num2, int n) {
//        int i = m - 1; // last element in num1 that should be merged
//        int j = n - 1; //the last element in num2
//        int k = m + n - 1; // last empty slot in num1
//
//
//        while (i >= 0 && j >= 0)
//        {
//            if (num1[i] > num2[j]) {
//                num1[k--] = num1[i--];
//            } else {
//                num1[k--] = num2[j--];
//            }
//        }
//
//        //If there are any leftover elements in num2, they should be replicated at the start of num1.
//        while (j >= 0) {
//            num1[k--] = num2[j--];
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] num1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] num2 = {2, 5, 6};
//        int n = 3;
//
//        // Call the merge method
//        merge(num1, m, num2, n);
//
//        // Print the sorted array
//        System.out.println(Arrays.toString(num1));
//    }
//}
