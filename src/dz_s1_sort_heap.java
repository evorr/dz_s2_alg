public class dz_s1_sort_heap {
    public static void main(String[] args){
        int[] array = new int[] {2, 6, -7, 5, 4, -6, 0};
        ArrayUtils.printArray(array);
        SortUtils.sort(array);
        ArrayUtils.printArray(array);
    }

    static class ArrayUtils{
        static void printArray(int[] arr) {
            for(int e: arr){
                System.out.printf("%d\t", e);
            }
            System.out.println();
        }
    }
    C:\Users\Лена\IdeaProjects\algoritmy_2\src\dz_s1_sort_heap.java
    static class SortUtils{
        static void sort(int[] arr){
            for (int i = arr.length / 2 - 1; i >= 0; i--){
                heapSort(arr, arr.length, i);
            }
            for(int i = arr.length - 1; i >= 0; i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapSort(arr, i, 0);
            }
        }

        static void heapSort(int[] arr, int heapSize, int rootIndex){
            int largest = rootIndex;
            int left = 2 * rootIndex + 1;
            int right = 2 * rootIndex + 2;
            if(left < heapSize && arr[left] > arr[largest]){
                largest = left;
            }
            if(right < heapSize && arr[right] > arr[largest]){
                largest = right;
            }
            if(largest != rootIndex){
                int temp = arr[rootIndex];
                arr[rootIndex] = arr[largest];
                arr[largest] = temp;
                heapSort(arr, heapSize, largest);
            }
        }
    }
}
