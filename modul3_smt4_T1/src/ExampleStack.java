public class ExampleStack {
    private int MAX_STACK_SIZE = 100; // ukuran maksimum stack
    private String[] stackArray; // array untuk menampung data stack
    private int top; // index top dari stack

    // Constructor
    public ExampleStack() {
        stackArray = new String[MAX_STACK_SIZE];
        top = -1;
    }

    // Menambahkan elemen ke stack
    public void push(String data) {
        if (top == MAX_STACK_SIZE - 1) {
            System.out.println("Stack penuh, elemen tidak dapat ditambahkan");
            return;
        }
        top++;
        stackArray[top] = data;
    }

    // Menghapus dan mengembalikan elemen teratas dari stack
    public String pop() {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada elemen yang dapat dihapus");
            return null;
        }
        String data = stackArray[top];
        top--;
        return data;
    }

    // Mengembalikan elemen teratas dari stack tanpa menghapusnya
    public String peek() {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada elemen yang dapat dilihat");
            return null;
        }
        return stackArray[top];
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Mencari elemen dalam stack dan mengembalikan jaraknya dari top stack
    public int search(String data) {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada elemen yang dapat dicari");
            return -1;
        }
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(data)) {
                return top - i + 1;
            }
        }
        return -1;
    }

}