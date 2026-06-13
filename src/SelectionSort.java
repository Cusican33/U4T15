import java.util.ArrayList;

public class SelectionSort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements)
    {
        for (int i = 0; i < elements.length; i++)
        {
            int min = elements[i];
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++)
            {
                if (elements[j] < min)
                {
                    min = elements[j];
                    minIndex = j;
                }
            }
            elements[minIndex] = elements[i];
            elements[i] = min;
        }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words)
    {
        int count = 0;
        for (int i = 0; i < words.size(); i++)
        {
            String min = words.get(i);
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++)
            {
                if (words.get(j).compareTo(min) < 0)
                {
                    min = words.get(j);
                    minIndex = j;
                }
                count++;
            }
            words.set(minIndex, words.get(i));
            words.set(i, min);
        }
        System.out.println(count);
    }
}