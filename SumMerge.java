import java.util.Arrays;

public class SumMerge {
  public static void main(String[] args) {
    int[] arr1 = {10,20,30,35,40};
    int[] arr2 = {25,32,45,50,55};
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
  }
}