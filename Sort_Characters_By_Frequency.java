class Sort_Characters_By_Frequency{
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        
              StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
