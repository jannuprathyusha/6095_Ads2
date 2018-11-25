import java.util.Scanner;
import java.util.Comparator;
class Stopwatch { 

    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    Stopwatch() {
        start = System.currentTimeMillis();
    } 


    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
} 
class Insertion {

    // This class should not be instantiated.
    private Insertion() { 

    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
            // assert isSorted(a, 0, i);
        }
    }
     
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    
    private static boolean less(Object v, Object w, Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // exchange a[i] and a[j]  (for indirect sort)
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
        

 private static boolean isSorted(Object[] a, int lo, int hi, Comparator comparator) {
        for (int i = lo + 1; i < hi; i++)
            if (less(a[i], a[i-1], comparator)) return false;
        return true;
    }

}   
public class Solution {
    Solution() {

    }
       // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(",", str.length());
        Stopwatch sw = new Stopwatch();
        Insertion.sort(temp);
        show(temp);
        double totalTime = sw.elapsedTime();
        System.out.println(totalTime);
    }
}