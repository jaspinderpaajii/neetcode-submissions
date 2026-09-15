

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store: SortedString -> List of original Anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Convert string to character array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // 2. If the sorted key doesn't exist, create a new list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // 3. Add the original string to its matching anagram group
            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

