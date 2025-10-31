public class TestMyStack {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        System.out.println("--- STACK EXERCISE---");
        stack.printStack();
        System.out.println();

        System.out.println("--- 1. PUSH  ---");
        stack.push(10); // Boyut 1. Middle: 10
        stack.printStack();
        stack.push(20); // Boyut 2. Middle: 10
        stack.printStack();
        stack.push(30); // Boyut 3. Middle: 20 (middle.prev)
        stack.printStack();
        stack.push(40); // Boyut 4. Middle: 20
        stack.printStack();
        stack.push(50); // Boyut 5. Middle: 30 (middle.prev)
        stack.printStack();
        System.out.println();


        System.out.println("--- 2. POP  ---");
        int popped = stack.pop();
        System.out.println("Deleted Node (Pop): " + popped);
        stack.printStack();


        System.out.println("--- 3. DELETE MIDDLE  ---");
        int deleted = stack.deleteMiddle();
        System.out.println("Deleted Middle Element: " + deleted);
        stack.printStack();



    }
}
