public class BST<E extends Comparable<E>>   implements Tree<E> {
    private TreeNode<E> root;
    private int size;

    public BST() {
    }


    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean insert(E e) {
        if(root==null) root=createNewNode(e);
        else {
            TreeNode<E> current=root;
            TreeNode<E> parent=null;
            while (current!=null){
                if(e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                } else if (e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
                }else return false;
            }
            if(e.compareTo(parent.element)<0) parent.left=createNewNode(e);
            else parent.right=createNewNode(e);
        }
        size++;
        return true;
    }
    public TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public boolean search(E e) {
        if (root==null) return false;
        else {
            TreeNode<E> current=root;
            while (current!=null){
                if(e.compareTo(current.element)<0) {
                    current=current.left;
                }
                else if(e.compareTo(current.element)>0) {
                    current=current.right;
                }
                else return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(E e) {
        if (root==null) return false;
        else {
            TreeNode<E> current=root;
            TreeNode<E> parent=null;
            while (current!=null){
                if(e.compareTo(current.element)<0) {
                    parent=current;
                    current=current.left;
                }
                else if(e.compareTo(current.element)>0) {
                    parent=current;
                    current=current.right;
                } else {
                    if(current.left==null && current.right==null){
                        if(current.element.compareTo(parent.element)<0) parent.left=null;
                        else parent.right=null;
                        return true;
                    } else if(current.left==null && current.right!=null){
                        TreeNode<E> currentRight=current.right;
                        if(currentRight.element.compareTo(parent.element)<0) parent.left=currentRight;
                        else parent.right=currentRight;
                        return true;
                    } else {
                        TreeNode<E> parentOfRightMost=current;
                        TreeNode<E> rightMost=current.left;

                        while (rightMost.right!=null){
                            parentOfRightMost=rightMost;
                            rightMost=rightMost.right;
                        }
                        if(rightMost.left==null) {
                            current.element=rightMost.element;
                            parentOfRightMost.right=null;
                        }
                        else {
                            TreeNode<E> leftOfRightMost=rightMost.left;
                            parentOfRightMost.right=leftOfRightMost;
                            current.element=rightMost.element;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
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
    public void postorder() {
        postorder(root);
    }
    public void postorder(TreeNode<E> root) {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }

}
