interface Tree<E> {
    boolean insert(E e);
    boolean search(E e);
    boolean delete(E e);
    void inorder();
    void preorder();
    void postorder();
    int getSize();

}
