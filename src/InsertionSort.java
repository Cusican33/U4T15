import java.util.ArrayList;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements)
    {
        for (int i = 1; i < elements.length; i++)
        {
            int temp = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > temp)
            {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = temp;
        }
    }

    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words)
    {
        for (int i = 1; i < words.size(); i++)
        {
            String temp = words.get(i);
            int j = i - 1;
            while (j >= 0 && words.get(j).compareTo(temp) > 0)
            {
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, temp);
        }
    }
}