class TimeMap {

    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";
        TreeMap<Integer, String> timestamp = m.get(key);
        Map.Entry<Integer, String> entry = timestamp.floorEntry(timestamp);
        return entru == null ? "" : entry.getValue();
    }
}
