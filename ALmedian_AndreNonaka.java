/*Name: Andre Nonaka
  Assignement: Helper Method 
*/
import java.util.*;
public class ALmedian_AndreNonaka
{
  public static void main(String[] args)
  {
    ArrayList<Integer> num = new ArrayList<Integer>(); //initializes and declares an arraylist named num that will store integer values.
    int j = 0, r = 0; // initializes and declares variables r and j as an integer with an initial value of 0
    for(j=0;j<20;j++) //start for loop that will loop 20 times
    {
      r = (int) (Math.random()*50+1);//store random numbers into the arraylist num.
      num.add(r);
    }
    double m = median (num); //call the helper method named m.
    System.out.println();//use System.out.print as a way to skip a line. 
    System.out.printf("The median is %.2f ",m); //output results from the helper method to two decimals places using printf.
  }//end main method
  public static double median (ArrayList<Integer> n)
  {
    Collections.sort (n); //sort the arraylist named n (it is the arraylist named num, (but with a different identifier).
    System.out.print(n + " "); //output the values that are stored in the array list 
    double s = 0; //initialize ande declare variable s with a value of 0.
    double y = (double)n.get(9); //initialize and declare variable y with an initial the value of the value at index at 9 of the arraylist
    double x = (double)n.get(10); // initialize and declare variable x with an initial the value of the value at index 10 of the arraylist
    s = (x+y)/2; //find the average value of the these two numbers that are exactly in the middle of the set of numbers and store the value in a double variable named s.
    return s; // return the value of s to the main method.
  }
}//close class