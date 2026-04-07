import java.util.*;

public class LRU {
    public static void main(String[] args) {
        int pages[] = {1, 3, 0, 3, 5, 6};
        int capacity = 3;

        List<Integer> frame = new ArrayList<>();
        Map<Integer, Integer> recent = new HashMap<>();
        int faults = 0;

        for (int i = 0; i < pages.length; i++) {
            int page = pages[i];

            if (!frame.contains(page)) {
                if (frame.size() < capacity) {
                    frame.add(page);
                } else {
                    int lru = Integer.MAX_VALUE, val = -1;

                    for (int f : frame) {
                        if (recent.get(f) < lru) {
                            lru = recent.get(f);
                            val = f;
                        }
                    }

                    frame.remove(Integer.valueOf(val));
                    frame.add(page);
                }
                faults++;
            }
            recent.put(page, i); // update recent use
        }

        System.out.println("LRU Page Faults = " + faults);
    }
}