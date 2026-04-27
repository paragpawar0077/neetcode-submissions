class Solution {
    public boolean isAnagram(String s, String t) {
        char [] S = s.toCharArray();
        Arrays.sort(S);
        char [] T = t.toCharArray();
        Arrays.sort(T);

        if(Arrays.equals(S,T)) return true;
        return false;
    }
}
