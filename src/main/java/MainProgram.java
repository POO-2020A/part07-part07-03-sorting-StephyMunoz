
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] array = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(array);

    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmall = 0;
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmall = startIndex;
        int small = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                small = table[i];
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int indexSmallest;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1 ; i++) {
            indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallest);
            //System.out.println(Arrays.toString(array));
        }

    }
}
