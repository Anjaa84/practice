public class Practice {
    private static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]= arr[high];
        arr[high]= temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.println();
    }





    public static void main(String[]args){
        int[] array ={10,80,30,90,40,50,70};

        System.out.println("Original array");
        printArray(array);

        quickSort(array,0,array.length-1);

        System.out.println("Sorted array");
        printArray(array);
    }
}