public class MergeSort {
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }


    public static void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        for(int n = left; n < mid; n++)
        {
            temp[n - left] = arr[n];
            left++;
        }

    }

    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int [n];
        mergeSortHelper(arr, 0,n-1, temp);
    }

    public static int[] randomIntArr(int count)
    {
        int[]arr = new int[count + 1];
        for (int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random() * (count) + 1);
        }

        return arr;
    }
}
