class LRUCache {

    public static class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head; 
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        //search in map, not in -1
        Node n = map.get(key);
        if(n == null) return -1;

        //remove
        remove(n);
        placeInFront(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        Node n = map.get(key);
        if(n!= null){
            n.value = value;
            remove(n);
            placeInFront(n);
            return;
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        placeInFront(newNode);
        if(map.size() > capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

    }

    private void remove(Node n){
        Node prv = n.prev;
        Node nxt = n.next;
        prv.next = nxt;
        nxt.prev = prv;
    }

    private void placeInFront(Node n){
        Node t = head.next;
        head.next = n;
        n.next = t;
        t.prev = n;
        n.prev = head;
    }
}
