import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements)
    {
        for (int i = 0; i < elements.length; i++)
        {
            int temp = elements[i];
            for (int j = i + 1; j < elements.length; j++)
            {
                int min = elements[i];
                int minIndex = i;
                if (elements[j] < min)
                {
                    min = elements[j];
                    minIndex = j;
                }
                System.out.println(Arrays.toString(elements));
                if (j == elements.length - 1 && min < temp)
                {
                    elements[i] = min;
                    elements[minIndex] = temp;
                }
            }
        }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me
    }
}