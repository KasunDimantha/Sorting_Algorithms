package Sorting_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bubble_Sort {

    public static int[] bubblesort01(int[] inputArray) {

        int n = inputArray.length;
        int[] arr = inputArray.clone();

        int comparisons = 0;
        int swap = 0;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                comparisons++;
                if (arr[j] > arr[j+1]){
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        printReasult("bubblesort01", inputArray, arr, comparisons, swap);
        return arr;
    }

    public static int[] bubblesort02(int[] inputArray) {

        int n = inputArray.length;
        int[] arr = inputArray.clone();

        int comparisons = 0;
        int swap = 0;

        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        printReasult("BubbleSort2", inputArray, arr, comparisons, swap);
        

        return arr;

    }

    public static int[] optimizedBubbleSort(int[] inputArray) {
        int comparisons = 0;
        int swap = 0;

        int[] arr = inputArray.clone();
        int n = arr.length - 1;

        boolean swapped;

        int newLimit = n;
        do {
            swapped = false;
            for (int i = 0; i < n; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    newLimit = i;
                    swapped = true;
                    swap++;
                }
            }
            n = newLimit;

        } while (swapped);
        printReasult("OptimizedBubbleSort", inputArray, arr, comparisons, swap);
        return arr;
    }

    public static void printReasult(String algoName, int[] unsortedArray, int[] sortedArray, int comparisons, int swap){
        System.out.println("\nStatistics of '" + algoName + "' algorithm");
        System.out.println("Unsorted Array        : " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array          : " + Arrays.toString(sortedArray));
        System.out.println("Number of comparisons : " + comparisons);
        System.out.println("Number of swapings    : " + swap + "\n");
    }



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will sort integer number in given array using bubble sort.");
        System.out.print("Enter the input array size(n) = ");

        int n = Integer.parseInt(reader.readLine());

        int[] inputArray = new int[n];
        int inputSize;
        String input;

        do {
            System.out.print("Enter " + n + "integers, seperated using spase to sort (n1 n2 n2 ...) : ");
            input = reader.readLine();
            inputSize = input.split(" ").length;
        } while( inputSize != n);

        String[] numbers = input.split(" ");
        for (int i=0; i<n; i++){
            inputArray[i] = Integer.parseInt(numbers[i]);
        }

        bubblesort01(inputArray);
        bubblesort02(inputArray);
        optimizedBubbleSort(inputArray);
    }
    
}
