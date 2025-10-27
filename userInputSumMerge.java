import java.util.Arrays;
import java.util.Scanner;
public class userInputSumMerge {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("Enter size of array 2: ");
        int m = sc.nextInt();

        int arr2[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }


        int[] mergedArr = new int[arr1.length + arr2.length];

        // Merging the two arrays
        for (int i = 0; i < arr1.length; i++) {
          mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
          mergedArr[arr1.length + i] = arr2[i];
        }
        Arrays.sort(mergedArr);
        System.out.print("Merged array: ");
        for (int num : mergedArr) {
          System.out.print(num + " ");
        };

        // Finding the sum of the middle elements
        int mid1 = mergedArr[(mergedArr.length / 2) - 1];
        int mid2 = mergedArr[mergedArr.length / 2];
        int sum = mid1 + mid2;

        System.out.println("Sum of  middle elements in the merged array: " + sum);
        sc.close();
    }
}
