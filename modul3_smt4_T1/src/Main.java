/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        ExampleStack st = new ExampleStack();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next: " + st.peek());

        st.push("Raya");

        System.out.println(st.pop());
        st.push(":");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());

        System.out.println(st.isEmpty());
    }
}


