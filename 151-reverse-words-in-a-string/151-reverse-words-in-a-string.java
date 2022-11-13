class Solution {
    public String reverseWords(String s) {
        String[] ar = s.trim().split(" +");
        Collections.reverse(Arrays.asList(ar));
        return String.join(" ", ar);
    }
}