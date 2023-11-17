import java.util.Arrays;
import java.util.PriorityQueue;

public class example {
    
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<String>(Arrays.asList(new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        
        PriorityQueue<String> queue2 = new PriorityQueue<String>(Arrays.asList(new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
        
        queue1.addAll(queue2);
        
        System.out.println("The first output is: " + queue1);
        System.out.println("The second output is: ");
        
        for(int i = 0; i< queue1.size(); i++){
        String e = queue1.poll();
        queue1.add(e);
        System.out.print(" " + e);
        }
        queue1 = new PriorityQueue<String>(Arrays.asList(
        new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        queue1.removeAll(queue2);
        System.out.println("The third output is: " + queue1);
        queue1 = new PriorityQueue<String>(Arrays.asList(
        new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        queue1.retainAll(queue2);
        System.out.println("The fourth output is " + queue1);
    }


}
