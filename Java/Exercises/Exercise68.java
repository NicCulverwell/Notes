import java.util.*; 

 public class Exercise68 {
 public static void main(String[] args)
 {
    int n= 21;
    
    int[] array = new int[n];
	

    for(int i = 1; i < n; i++)
        array[i] = 2 * i;       
	 System.out.println("New Array: "+Arrays.toString(array)); 
	 }
}