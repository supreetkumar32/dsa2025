package ArrayMedium;

public class prac {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, -2, 7, -4};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        // Print the result
        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i < end ? ", " : ""));
        }
        System.out.println("]");
    }

}
