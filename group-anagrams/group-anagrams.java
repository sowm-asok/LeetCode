class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String str: strs) {
            char[]ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }
        // System.out.print(map.values());
        List<List<String>> list = new ArrayList();
        for(List<String> l: map.values())
            list.add(l);
        return list;
    }
}