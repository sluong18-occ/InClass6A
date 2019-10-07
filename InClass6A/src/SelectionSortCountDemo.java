import java.util.Scanner;

public class SelectionSortCountDemo
{  
    
    
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter array size: ");
        //int n = in.nextInt();
        for (int size = 1; size <= 6; ++size)
        {

            // Construct random array

            int[] a = ArrayUtil.randomIntArray(size * 10000, size * 10000);
    
    
            SelectionSorter.resetcCount();
            SelectionSorter.sort(a);
    

            System.out.println(a.length + " Elements. Comparisons made: " 
                    + SelectionSorter.getcCount());
        }
    }
}
