class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s  : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String res = new String(arr);
            if(map.containsKey(res)){
                map.get(res).add(s);
            }
            else{
                map.put(res,new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> e : map.entrySet()){
            result.add(e.getValue());
        }
        return result;
    }
}
