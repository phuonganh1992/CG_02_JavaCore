public class Main {
    public static void main(String[] args) {
        BST<Integer> integerBST=new BST<>();
        integerBST.insert(40);
        integerBST.insert(60);
        integerBST.insert(30);
        integerBST.insert(26);
        integerBST.insert(74);
        integerBST.insert(53);
        integerBST.insert(37);
        integerBST.insert(100);
        integerBST.insert(47);
        integerBST.insert(55);
        integerBST.insert(54);
        System.out.println(integerBST.getSize());
        System.out.println(integerBST.search(37));
        System.out.println(integerBST.search(50));

        System.out.println("--------------------------INORDER-----------------------------");
        integerBST.inorder();
        System.out.println();
        System.out.println("--------------------------POSTORDER-----------------------------");
        integerBST.postorder();
        System.out.println();
        System.out.println("--------------------------PREORDER-----------------------------");
        integerBST.preorder();
        System.out.println();
        System.out.println("--------------------------DELETE-------------------------------");
        integerBST.delete(60);
        integerBST.delete(74);
        integerBST.delete(26);
        integerBST.preorder();
    }
}
