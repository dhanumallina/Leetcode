class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        // For every stone, check if it matches any jewel
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);

            for (int j = 0; j < jewels.length(); j++) {
                char jewel = jewels.charAt(j);

                if (stone == jewel) {
                    count++;
                    break; // no need to check further
                }
            }
        }

        return count;
    }
}
