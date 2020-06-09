package cr.ac.ulead;

import cr.ac.ulead.utils.sort.BubbleSort;
import cr.ac.ulead.utils.sort.Sort;

public class Main {

    public static void main(String[] args) {

        int[] data = {100, 32, 41, 11, 8, 45, 22, 230, 674, 501, 302, 1, 5, 70, 270, 190};

        int copy[] = data.clone();

        Sort bubble = new BubbleSort();

        print(copy);
        copy = bubble.sortArray(copy);
        print(copy);

    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println();


    }
}
