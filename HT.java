package assignment;


public class HT <K, V> {

    private static final int ARRAY_SIZE = 10;
    private Node<K, V>[] nodeList = new Node[ARRAY_SIZE];

    public void insert(K key, V value) throws IllegalAccessError {
        long hashCode = this.getHashCode(key);
        int index = this.getIndex(hashCode);

        if (index > ARRAY_SIZE) {
            throw new IllegalAccessError("Invalid key, please check again!");
        }

        if (this.nodeList[index] != null) {
            Node<K, V> exitingNode = this.nodeList[index];

            while (exitingNode.getNext() != null) {
                exitingNode = exitingNode.getNext();
            }
            Node<K, V> newNode = new Node<>();
            newNode.setKey(key);
            newNode.setValue(value);
            newNode.setHashCode(hashCode);

            exitingNode.setNext(newNode);

        } else {
            Node<K, V> newNode = new Node<>();
            newNode.setKey(key);
            newNode.setValue(value);
            newNode.setHashCode(hashCode);

            this.nodeList[index] = newNode;
        }
    }

    private long getHashCode(K key) {

        String keyString = key.toString();
        return keyString.hashCode();
    }

    private int getIndex(long hashCode) {

        return Math.toIntExact(hashCode % ARRAY_SIZE);
    }

    public void remove(K keys) {
        if (search(keys)) {
            int index = 0;
            while (index < ARRAY_SIZE) {
                Node<K, V> node = this.nodeList[index];
                if (node != null) {
                    while (node != null) {
                        if (node.getKey().equals(keys)) {
                                while (node != null) {
                                    if (node.getNext()!=null) {
                                    node.setKey(node.getNext().getKey());
                                    node.setValue(node.getNext().getValue());
                                    node.setHashCode(node.getNext().getHashCode());
                                    node = node.getNext();
                                    }else{
                                         node.setKey(null);
                                         node.setValue(null);
                                         node = node.getNext();
                                         
                                    }
                                 
                                }
                              
                            
                        } else {
                            node = node.getNext();
                        }
                    }
                }

                index++;
            }
        } else {
            System.out.println("name not found");
        }

    }

    public boolean search(K keys) {

        int index = 0;
        while (index < ARRAY_SIZE) {

            Node<K, V> node = this.nodeList[index];

            if (node != null) {
                while (node != null && node.getKey()!=null) {
                    if (node.getKey().equals(keys)) {
                        return true;
                    } else {
                        node = node.getNext();
                    }
                }
            }

            index++;
        }
        return false;

    }

    public void print() {

        System.out.println("table contains:");

        int index = 0;
        while (index < ARRAY_SIZE) {

            Node<K, V> node = this.nodeList[index];

            if (node != null) {

                while (node != null && node.getKey()!=null) {
                    System.out.print("name : " + node.getKey().toString() + " ////  age  ");
                    System.out.print(node.getValue().toString());
                    node = node.getNext();
                    System.out.println("");

                }

                System.out.println("");
            }

            index++;
        }

    }
//    inner class node 

    public class Node<K, V> {

        private K key;
        private V value;
        private Node<K, V> next;
        private long hashCode;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        public long getHashCode() {
            return hashCode;
        }

        public void setHashCode(long hashCode) {
            this.hashCode = hashCode;
        }
    }
}