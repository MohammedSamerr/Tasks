import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int getLongestSeq(int[]arr){
        Map<Integer, Integer> sequenceCounts = new HashMap<>();
        List<Integer> currentSequence = new ArrayList<>();
        boolean inSequence = false;
        int firstIndex = -1;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (!inSequence) {
                    firstIndex = i;

                    inSequence = true;
                }
                currentSequence.add(i);
            } else {
                if (inSequence) {
                    // End of sequence
                    sequenceCounts.put(firstIndex, currentSequence.size());
                    currentSequence.clear();
                    inSequence = false;
                }
            }
        }
        // If the sequence ends at the end of the array
        if (inSequence) {
            sequenceCounts.put(firstIndex, currentSequence.size());
        }

        // Print the results
        for (Map.Entry<Integer, Integer> entry : sequenceCounts.entrySet()) {
            int index = entry.getKey();
            int count = entry.getValue();
            System.out.println("Index: " + index + ", Count: " + count);

        }

        List<Integer> keys = new ArrayList<>(sequenceCounts.keySet());
        for (int i = 0; i < keys.size() - 1; i++) {
            int currentKey = keys.get(i);
            int currentValue = sequenceCounts.get(currentKey);
            int sum = currentKey + currentValue;

            int nextKey = keys.get(i + 1);
            int nextValue = sequenceCounts.get(nextKey);

            int res = nextKey-(currentKey+currentValue);
            max=currentValue;
            if(res==1){
                if(max<(currentValue+nextValue+1))
                    max= nextKey+nextValue-currentKey;
            }
        }
        return max;
    }
}
