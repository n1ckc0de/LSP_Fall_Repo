import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Iterate through the first map
        for (String key : map1.keySet()) {
            // Check if the key exists in the second map and if the values are the same
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;
            }
        }

        return count;
    }
}
