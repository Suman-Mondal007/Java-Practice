import java.util.*;

public class FIFO {
    public static void main(String[] args) {
        int pages[] = {1, 3, 0, 3, 5, 6};
        int capacity = 3;

        Queue<Integer> queue = new LinkedList<>();
        int faults = 0;

        for (int page : pages) {
            if (!queue.contains(page)) {
                if (queue.size() == capacity) {
                    queue.poll(); // remove oldest
                }
                queue.add(page);
                faults++;
            }
        }

        System.out.println("FIFO Page Faults = " + faults);
    }
}