import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        // Task 1: Reverse an array
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Initial array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Task 2: Remove the middle element from an array
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int middleIndex = array2.length / 2;
        int[] newArray = new int[array2.length - 1];
        for (int i = 0, j = 0; i < array2.length; i++) {
            if (i != middleIndex) {
                newArray[j++] = array2[i];
            }
        }
        System.out.println("Array without middle element: " + Arrays.toString(newArray));


        // Task 3: Find elements that are not common in both arrays
        int[] arraynew1 = {1, 2, 3, 4, 5};
        int[] arraynew2 = {4, 5, 6, 7, 8};
        int[] tempArray = new int[arraynew1.length + arraynew2.length];
        int index = 0;

        for (int i = 0; i < arraynew1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arraynew2.length; j++) {
                if (arraynew1[i] == arraynew2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArray[index++] = arraynew1[i];
            }
        }

        for (int i = 0; i < arraynew2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arraynew1.length; j++) {
                if (arraynew2[i] == arraynew1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArray[index++] = arraynew2[i];
            }
        }

        int[] resultArray = Arrays.copyOf(tempArray, index);
        System.out.println("Elements not common in both arrays: " + Arrays.toString(resultArray));
    }
}
