package Sorting_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Insertion_Sort {


    public static int[] insertionSort(int[] inputArray){

        int[] arr = inputArray.clone();
        int n = arr.length;

        for (int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        printReasult(inputArray, arr);
        return arr;
    }

    public static void printReasult(int[] unsortedArray, int[] sortedArray){
        System.out.println("Unsorted Array        : " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array          : " + Arrays.toString(sortedArray));
    }


    public static void main(String[] args) throws IOException{

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

        insertionSort(inputArray);
    }
    
}
