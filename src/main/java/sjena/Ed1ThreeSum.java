import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ed1ThreeSum {
    public List<int[]> FindThreeSumSets(int[] input)
    {
        List<int[]> res = new ArrayList<int[]>();
        HashMap<Integer, Integer> targets = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++)
        {
            targets.put(input[i], i);
        }
        for(int i = 0; i < input.length; i++)
        {
            for(int j = i + 1; j < input.length; j++)
            {
                int target = -1 * (input[j] + input[i]);
                if (targets.containsKey(target) && targets.get(target) > Math.max(i, j))
                {
                    res.add(new int[] { i, j, targets.get(target)});
                }
            }
        }

        return res;
    }
}
