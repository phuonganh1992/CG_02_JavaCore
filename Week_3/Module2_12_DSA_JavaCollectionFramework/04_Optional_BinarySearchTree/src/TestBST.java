public class TestBST {
    public static void main(String[] args) {
        BST<String> treeString=new BST<>();
        treeString.insert("Phuong Anh");
        treeString.insert("Huy Hoang");
        treeString.insert("Ngoc Huyen");
        treeString.insert("Anh Tu");
        treeString.insert("Xuan Lan");
        treeString.inorder();
        System.out.println("Size is: "+treeString.getSize());

        BST<Integer> treeInteger=new BST<>();
        treeInteger.insert(40);
        treeInteger.insert(56);
        treeInteger.insert(26);
        treeInteger.insert(30);
        treeInteger.insert(76);
        treeInteger.insert(156);
        treeInteger.inorder();
        System.out.println("Size is: "+treeInteger.getSize());


    }
}
