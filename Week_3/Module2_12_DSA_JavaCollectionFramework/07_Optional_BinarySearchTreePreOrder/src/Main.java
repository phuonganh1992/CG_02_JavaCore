public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> integerBinarySearchTree=new BinarySearchTree<>();
        integerBinarySearchTree.insert(40);
        integerBinarySearchTree.insert(60);
        integerBinarySearchTree.insert(30);
        integerBinarySearchTree.insert(26);
        integerBinarySearchTree.insert(74);
        integerBinarySearchTree.insert(53);
        integerBinarySearchTree.insert(37);
        integerBinarySearchTree.insert(100);
        System.out.println(integerBinarySearchTree.getSize());
        System.out.println("--------------------------INORDER-----------------------------");
        integerBinarySearchTree.inorder();
        System.out.println();
        System.out.println("--------------------------POSTORDER-----------------------------");
        integerBinarySearchTree.postorder();
        System.out.println();
        System.out.println("--------------------------PREORDER-----------------------------");
        integerBinarySearchTree.preorder();
    }
}
