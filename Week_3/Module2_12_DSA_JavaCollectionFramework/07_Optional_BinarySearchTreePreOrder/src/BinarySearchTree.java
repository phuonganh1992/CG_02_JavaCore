public class BinarySearchTree<E extends Comparable<E>> implements Tree<E>{
    private TreeNode<E> root;
    private int size;

    public BinarySearchTree() {
    }

    public TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }
    @Override
    public boolean insert(E e) {
        if(root==null) this.root=createNewNode(e);
        else {
            TreeNode<E> current=root;
            TreeNode<E> parent=null;
            while (current!=null){
                if(e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                } else if(e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
                } else return false;
            }
            if(e.compareTo(parent.element)<0) parent.left=createNewNode(e);
            else parent.right=createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    public void inorder(TreeNode<E> root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }

    @Override
    public void postorder() {
            postorder(root);
    }
    public void postorder(TreeNode<E> root){
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }

    @Override
    public void preorder() {
        preorder(root);
    }
    public void preorder(TreeNode<E> root){
        if(root==null) return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    @Override
    public int getSize() {
        return size;
    }
}
