package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(23);
        reverse(queue);
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> queue){
          Stack<Integer> stack = new Stack<>() ;
          while (!queue.isEmpty())
            stack.push(queue.remove());
          while (!stack.isEmpty())
              queue.add(stack.pop());







//

        }



}
