
public class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public void add(Object data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;
            
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            
            currentNode.next = newNode;
        }
    }
    
    public Object remove() {
        if (isEmpty()) {
            return null;
        } else {
            Node currentNode = head;
            head = currentNode.next;
            return currentNode.data;
        }
    }
    
    public Object peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.data;
        }
    }
}
