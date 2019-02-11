public class MergeSortRunner {
    public static void main(String[] args)
    {
        int[] arr = MergeSort.randomIntArr(50);
        MergeSort.mergeSort(arr);
        for(int num: arr)
        {
            System.out.print(arr[num]);
            System.out.print(" ");
        }
    }
}
