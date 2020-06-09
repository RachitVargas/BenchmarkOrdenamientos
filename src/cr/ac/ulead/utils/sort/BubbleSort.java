package cr.ac.ulead.utils.sort;

public class BubbleSort implements Sort {

    public int[] sortArray(int[] array) {
        return bubbleSort(array);
    }

    private int[] bubbleSort(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

        return array;

    }
}
