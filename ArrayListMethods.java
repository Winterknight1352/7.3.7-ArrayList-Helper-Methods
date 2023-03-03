import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }
    }
    public static void condense(ArrayList<Double> array)
    {
        ArrayList<Double> newArray = new ArrayList();
        for(int i = 0; i < array.size(); i++)
        {
            double result = array.get(i) * array.get(i + 1);
            newArray.add(result);
            
            i += 1;
            
            if (i % 2 == 0)
            {
                newArray.remove(i);
            }
        }
        Collections.copy(array, newArray);
        int length = array.size() / 2;
        while(array.size() > length)
        {
            array.remove((array.size() / 2 + 1));
        }
    }
    public static void duplicate(ArrayList<Double> array)
    {
        array.addAll(array);
    }
}