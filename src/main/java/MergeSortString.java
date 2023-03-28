import java.util.Arrays;

public class MergeSortString {

    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(String[] arr, int left, int middle, int right) {
        String[] leftArr = Arrays.copyOfRange(arr, left, middle + 1);
        String[] rightArr = Arrays.copyOfRange(arr, middle + 1, right + 1);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].length() <= rightArr[j].length()) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
