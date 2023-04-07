
public class Queue {
    LinkedList list;
    
    public Queue() {
        list = new LinkedList();
    }
    
    public void add(Object data) {
        list.add(data);
    }
    
    public Object remove() {
        return list.remove();
    }
    
    public Object element() {
        return list.peek();
    }
    
    public Object poll() {
        return list.remove();
    }
    
    public Object peek() {
        return list.peek();
    }
}