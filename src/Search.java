import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i=0; i<array.length; i++) {
            if (array[i]==value) {
                index = i;
            }
        }
        return index;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        int index = -1;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals(string)) {
                index = i;
            }
        }
        return index;

    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int midIndex = (high+low)/2;
            int midValue = array[midIndex];
            if (midValue==value) {
                return midIndex;
            }
            if (midValue>value) {
                high = midIndex-1;
            }
            if (midValue<value) {
                low = midIndex+1;
            }
        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int midIndex = (high+low)/2;
            String midValue = array[midIndex];
            if (midValue.equals(string)) {
                return midIndex;
            }
            // compares two strings alphabetically
            if (midValue.compareTo(string)>0) {
                // if midValue is alphabetically after string (returns positive number)
                high = midIndex-1;
            }
            else if (midValue.compareTo(string)<0) {
                // if midValue is alphabetically before string (returns negative number)
                low = midIndex+1;
            }
        }
        return -1;

    }
}
