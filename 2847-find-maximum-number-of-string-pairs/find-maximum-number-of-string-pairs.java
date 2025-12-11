class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       Set<String> seen = new HashSet<>();
        int pairs = 0;

        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (seen.contains(rev)) {
                pairs++;
                seen.remove(rev); // use up the matched string
            } else {
                seen.add(w);
            }
        }

        return pairs; 
    }
}