import java.util.ArrayList;

public class Sort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements)
    {
        for (int i = 0; i < elements.length - 1; i++)
        {
            int temp = elements[i];
            for (int j = i; j < elements.length; j++)
            {
                if (elements[j] < elements[i])
                {
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me
    }
}