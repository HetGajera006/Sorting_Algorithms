public class sorting {
    // 1 -> bubble-Sort
    static void bubbleSort(int[] array){
        int n = array.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
        }
    }

    // 2 -> Selection-Sort
    static void selectionSort(int[] array){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int midIndex = i;
            for(int j=i+1; j<n; j++){
                //compare and than swap
                if(array[j] < array[midIndex]){
                    midIndex = j;
                }
            }
            //now swap numbers
            int temp = array[i];
            array[i] = array[midIndex];
            array[midIndex] = temp;
        }
    }

    // 3 -> Inserstion Sort
    static void inserstionSort(int[] array){
        int n= array.length;
        for(int i=1; i<n; i++){
            int prev = i-1;
            int curr = i;
            int currValue = array[i];

            while (prev>=0 && currValue < array[prev]) {
                //shifting
                array[prev+1] = array[prev];
                //placing
                array[prev] = currValue;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,3};
        
        bubbleSort(arr);
        System.out.println("Bubble sort:-");
        for(int value: arr){
            System.out.print(value +" ");
        }

        System.out.println();

        selectionSort(arr);
        System.out.println("Selection Sort:-");
        for(int value: arr){
            System.out.print(value+" ");
        }

        System.out.println();

        inserstionSort(arr);
        System.out.println("Insersion Sort:-");
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
}
