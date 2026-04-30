class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String S : strs){
            char [] c = S.toCharArray();
            Arrays.sort(c);
            String str = new String(c);

            map.putIfAbsent(str,new ArrayList<>());

            map.get(str).add(S);
        }

        return new ArrayList<>(map.values());
    }
}
