public class Selection_Sort {

    private static void printArray(int[] num) {

        System.out.print("[");
        for (int i : num) {
            System.out.print(" "+ i);
        }
        System.out.println("\b]");
    }

    public static void main(String[] args) {
        
        int[] num = {5, 4, 1, 8, 3, 9, 6};

        int size = num.length;
        int temp = 0;
        int minIndex = -1;
        System.out.print("Before sorting : " );
        printArray(num);

        System.out.println("While sorting : ");

        for (int i=0; i<size; i++){

            minIndex = i;

            for(int j=i+1; j<size; j++){

                if(num[minIndex] > num[j]){
                    minIndex = j;
                }
            } 
            temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;

            printArray(num);
        }

        System.out.print("After sorting : " );
        printArray(num);
    }

    
    
}
