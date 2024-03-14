package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements_medium {
    public static int[] topKFrequent(int[] nums, int k)
    {
        int[] ans = new int[k];
        Map<Integer, Integer> map = getFreqTable(nums);


        for (int i=0; i<k; i++)
        {
            Map.Entry[] arr = map.entrySet().toArray(new Map.Entry[0]);
            int maxKey = (int) arr[0].getKey();

            for (Map.Entry<Integer, Integer> m : map.entrySet())
            {
                if (m.getValue() > map.get(maxKey))
                {
                    maxKey = m.getKey();
                }
            }

            map.remove(maxKey);
            ans[i] = maxKey;
        }
        return ans;
    }

    public static Map<Integer, Integer> getFreqTable(int[] nums)
    {
        Map<Integer, Integer> tm = new HashMap<>();
        for (int i : nums)
        {
            if (tm.containsKey(i))
            {
                int val = tm.get(i);
                val++;
                tm.put(i, val);
            }
            else
            {
                tm.put(i, 1);
            }
        }
        return tm;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

//        for (Map.Entry<Integer, Integer> m : getFreqTable(nums).entrySet())
//        {
//            System.out.println("key: "+m.getKey()+" value:"+m.getValue());
//        }

        for (int i : topKFrequent(nums, k)) {
            System.out.println(i);
        }
    }
}
