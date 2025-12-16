class Solution {

    public String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int answer = 0;

        for (int i = 0; i < n - 1; i++) {
            if (words[i].equals("0")) {
                continue;
            }

            String a = words[i];

            for (int j = i + 1; j < n; j++) {
                if (words[j].equals("0")) {
                    continue;
                }

                if (a.equals(reverse(words[j]))) {
                    answer++;
                    words[i] = "0"; // mark both used
                    words[j] = "0";
                    break;
                }
            }
        }
        return answer;
    }
}
