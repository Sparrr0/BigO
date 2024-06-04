import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class BigO
{
    private static int swap2, comparison2;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int output;
        
        State[] states = new State[52];

        // Initialize State objects for each state
        states[0] = new State("Texas", 32.4);
        states[1] = new State("California", 24.2);
        states[2] = new State("Kentucky", 34.6);
        states[3] = new State("Georgia", 30.7);
        states[4] = new State("Wisconsin", 30.7);
        states[5] = new State("Oregon", 30.1);
        states[6] = new State("Virginia", 29.2);
        states[7] = new State("Tennessee", 33.8);
        states[8] = new State("Louisiana", 36.2);
        states[9] = new State("New York", 25);
        states[10] = new State("Michigan", 31.2);
        states[11] = new State("Idaho", 28.6);
        states[12] = new State("Florida", 26.8);
        states[13] = new State("Alaska", 29.8);
        states[14] = new State("Montana", 23.6);
        states[15] = new State("Minnesota", 26.1);
        states[16] = new State("Nebraska", 31.4);
        states[17] = new State("Washington", 26.4);
        states[18] = new State("Ohio", 29.8);
        states[19] = new State("Illinois", 30.8);
        states[20] = new State("Missouri", 32.4);
        states[21] = new State("Iowa", 32.1);
        states[22] = new State("South Dakota", 30.4);
        states[23] = new State("Arkansas", 34.5);
        states[24] = new State("Mississippi", 35.6);
        states[25] = new State("Colorado", 20.2);
        states[26] = new State("North Carolina", 30.1);
        states[27] = new State("Utah", 24.5);
        states[28] = new State("Oklahoma", 33.9);
        states[29] = new State("Wyoming", 29);
        states[30] = new State("West Virginia", 35.6);
        states[31] = new State("Indiana", 31.3);
        states[32] = new State("Massachusetts", 24.3);
        states[33] = new State("Nevada", 26.7);
        states[34] = new State("Connecticut", 25.3);
        states[35] = new State("District of Columbia", 22.1);
        states[36] = new State("Rhode Island", 26);
        states[37] = new State("Alabama", 35.6);
        states[38] = new State("Puerto Rico", 29.5);
        states[39] = new State("South Carolina", 31.7);
        states[40] = new State("Maine", 30);
        states[41] = new State("Hawaii", 22.7);
        states[42] = new State("Arizona", 28.4);
        states[43] = new State("New Mexico", 28.8);
        states[44] = new State("Maryland", 28.9);
        states[45] = new State("Delaware", 29.7);
        states[46] = new State("Pennsylvania", 30);
        states[47] = new State("Kansas", 34.2);
        states[48] = new State("Vermont", 25.1);
        states[49] = new State("New Jersey", 25.6);
        states[50] = new State("North Dakota", 31);
        states[51] = new State("New Hampshire", 26.3);



        double[] obesityRates = {
            32.4, 24.2, 34.6, 30.7, 30.7, 30.1, 29.2, 33.8, 36.2, 25, 
            31.2, 28.6, 26.8, 29.8, 23.6, 26.1, 31.4, 26.4, 29.8, 30.8, 
            32.4, 32.1, 30.4, 34.5, 35.6, 20.2, 30.1, 24.5, 33.9, 29, 
            35.6, 31.3, 24.3, 26.7, 25.3, 22.1, 26, 35.6, 29.5, 31.7, 
            30, 22.7, 28.4, 28.8, 28.9, 29.7, 30, 34.2, 25.1, 25.6, 
            31, 26.3
        };
        System.out.println("Unorted Data:");
        for (State state : states) {
            System.out.println(state);
        }
        System.out.println();
        System.out.println();
        System.out.println("Pick a sorting algorithm in correspondance with the number");
        System.out.println("1) Merge Sort");
        System.out.println("2) Insertion Sort");
        System.out.println("3) Selection Sort");
        output = input.nextInt();
        if(output ==1)
        {
            long mergeSortStartTime = System.currentTimeMillis();
            mergeSort(obesityRates);
            long mergeSortEndTime = System.currentTimeMillis();
            System.out.println("Sorted Data:");
            
            for(int i = 0;i<obesityRates.length;i++)
            {
                for(int j = 0;j<states.length;j++)
                {
                    if(obesityRates[i]==states[j].getRate())
                        System.out.println(states[j]);
                }
            }
            System.out.println("Number of Swaps: N/A");
            double n = obesityRates.length;
            double x = n*(Math.log(n)/Math.log(2));
            double y = n-1;
            double z = x-y;
            System.out.println("Number of Comparisons: "+z);
            System.out.println("Execution Time: "+(mergeSortStartTime-mergeSortEndTime)+" milliseconds");
        }
        
        else if(output==2)
        {
            long insertionSortStartTime = System.currentTimeMillis();
            insertionSort(obesityRates);
            long insertionSortEndTime = System.currentTimeMillis();
            System.out.println("Sorted Data:");
            for(int i = 0;i<obesityRates.length;i++)
            {
                for(int j = 0;j<states.length;j++)
                {
                    if(obesityRates[i]==states[j].getRate())
                        System.out.println(states[j]);
                }
            }
            System.out.println("Number of Comparisons: " + comparison2);
            System.out.println("Number of Swaps: " + swap2);
            System.out.println("Execution Time: "+(insertionSortStartTime-insertionSortEndTime)+" milliseconds");
        }
        else if(output ==3)
        {
            long selectionSortStartTime = System.currentTimeMillis();
            selectionSort(obesityRates);
            long selectionSortEndTime = System.currentTimeMillis();
            System.out.println("Sorted Data:");
            for(int i = 0;i<obesityRates.length;i++)
            {
                for(int j = 0;j<states.length;j++)
                {
                    if(obesityRates[i]==states[j].getRate())
                        System.out.println(states[j]);
                }
            }
            System.out.println("Number of Comparisons: " + comparison2);
            System.out.println("Number of Swaps: " + swap2);
            System.out.println("Execution Time: "+(selectionSortStartTime-selectionSortEndTime)+" milliseconds");
            
        }
            
    
          
        
        
        
        
        
        
        
        
    }
     public static void mergeSort(double[] arr) {
        if (arr == null || arr.length <= 1) {
            // Array is already sorted or empty
            return;
        }

        int n = arr.length;
        double[] temp = new double[n];
        mergeSortHelper(arr, temp, 0, n - 1);
    }

    private static void mergeSortHelper(double[] arr, double[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergeSortHelper(arr, temp, left, mid);
            mergeSortHelper(arr, temp, mid + 1, right);

            // Merge the sorted halves
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(double[] arr, double[] temp, int left, int mid, int right) {
        // Copy data to temporary arrays
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        // Merge the two halves back into the original array
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left subarray, if any
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right subarray, if any
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
     public static void insertionSort(double[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }

        swap2 = swaps;
        comparison2 = swaps;
    }
     public static void selectionSort(double[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Increment the comparison counter
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                double temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swaps++; // Increment the swap counter
            }
        }

        // Print counters at the end
        swap2 = swaps;
        comparison2 = comparisons;
    }
}

