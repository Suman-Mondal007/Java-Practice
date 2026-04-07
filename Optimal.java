import java.util.*;

public class Optimal {
    public static void main(String[] args) {
        int pages[] = {1, 3, 0, 3, 5, 6};
        int capacity = 3;

        List<Integer> frame = new ArrayList<>();
        int faults = 0;

        for (int i = 0; i < pages.length; i++) {
            int page = pages[i];

            if (!frame.contains(page)) {
                if (frame.size() < capacity) {
                    frame.add(page);
                } else {
                    int farthest = -1, index = -1;

                    for (int j = 0; j < frame.size(); j++) {
                        int k;
                        for (k = i + 1; k < pages.length; k++) {
                            if (frame.get(j) == pages[k])
                                break;
                        }

                        if (k > farthest) {
                            farthest = k;
                            index = j;
                        }
                    }

                    frame.set(index, page);
                }
                faults++;
            }
        }

        System.out.println("Optimal Page Faults = " + faults);
    }
}