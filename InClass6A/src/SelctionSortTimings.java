import java.util.Scanner;

public class SelctionSortTimings
{  
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter array size: ");
        //int n = in.nextInt();
        for (int size = 1; size <= 100; ++size)
        {

            // Construct random array

            int[] a = ArrayUtil.randomIntArray(size * 10000, size * 10000);
    
            // Use stopwatch to time selection sort
    
            StopWatch timer = new StopWatch();
    
            timer.start();
            SelectionSorter.sort(a);
            timer.stop();
    
            System.out.println(a.length + " Elements. Elapsed time: " 
                    + timer.getElapsedTime() + " milliseconds");
        }
    }
}
