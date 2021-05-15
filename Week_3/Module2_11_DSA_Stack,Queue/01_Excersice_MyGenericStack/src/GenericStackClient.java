public class GenericStackClient {
    public static void stackOfIsString(){
        MyGenericStack<String> stack=new MyGenericStack<>();
        System.out.println("Stack is emtpy: " +stack.isEmpty());
        stack.push("cat");
        stack.push("dog");
        stack.push("pig");
        System.out.println("Stack of "+stack.size()+" elements: ");
        stack.print();
        System.out.println("Pop element: "+stack.pop());
        System.out.println("Stack of "+stack.size()+" elements: ");
        System.out.println("Stack is emtpy: " +stack.isEmpty());
        stack.print();
    }
    public static void stackOfIsInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack of "+stack.size()+" elements: ");
        stack.print();
        System.out.println("Pop element: "+stack.pop());
        System.out.println("Stack of "+stack.size()+" elements: ");
        stack.print();
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of String: ");
        stackOfIsString();
        System.out.println("\n2. Stack of Integer: ");
        stackOfIsInteger();
    }
}
