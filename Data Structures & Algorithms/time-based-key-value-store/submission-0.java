class TimeMap {
    private static class Entry{
            int timeStamp;
            String value;
            Entry(int timeStamp,String value){
                this.timeStamp = timeStamp;
                this.value = value;
            }
        }
    private Map<String, List<Entry>> history;
     
    public TimeMap() {
        history = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         if (!history.containsKey(key)) {
            history.put(key, new ArrayList<>());
        }
        history.get(key).add(new Entry(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Entry> entries = history.get(key);

        if (entries == null) {
            return "";
        }

        int left = 0;
        int right = entries.size() - 1;
        String answer = "";
        // list is like [(1, "happy"), (3, "sad"), (8, "excited")]
        while(left <= right){
            int mid = (left+right)/2;
            Entry current = entries.get(mid);

            if(current.timeStamp <= timestamp){
                answer = current.value;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return answer;
    }
}
