package Efficiency;

class TreeNode<E> {
    
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E o, TreeNode<E> L, TreeNode<E> R) {
        element = o;
        left = L;
        right = R;
    }

}
