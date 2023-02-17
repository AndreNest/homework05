// Реализация пирамидальной сортировки на Java
public class Task03 {
    public static void main(String args[])
    {
        int arr[] = {33, 17, 2, -3, 101, 0, 1, 21};
        System.out.print("Заданный массив:        ");
        printArr(arr);
        Task03 ob = new Task03();
        ob.sort(arr);
        System.out.print("Отсортированный массив: ");
        printArr(arr);
    }
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            sortedArr(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            sortedArr(arr, i, 0);
        }
    }
    void sortedArr(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            sortedArr(arr, n, largest);
        }
    }
    static void printArr(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}