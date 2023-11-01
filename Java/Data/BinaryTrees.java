package Data;

class BinaryTrees {
    
    public static void main(String [] args) {

        // Binary Trees
            // Lists, Stacks and Queues are linear data Structures that consist of a sequence of elements
            // Binary Trees use a Hierarchical Structure

            // Consists of a Root Element:
            // Proceeded by 2 Distinct Binary Trees, called the left subtree and the right subtree
            // The height of a Binary Tree is the maximum distance of a leaf node to the root
            // the element of the left subtree is called the left child of the node and vice versa for the right 
            // a node (element of a binary tree) without children is called a leaf
            // special type of binary tree called a binary search tree is used for solving search problems

            // A Binary Search Tree with no duplicates is designed as:
                // The left child is less than the value of the node
                // The right child is greater than the value of the node


        // Binary Search Tree
            // Each node in a binary search tree, comes with a reference to its right child, and a reference to its left child
            // leaf nodes contain references as well, but they are null
            
    }

    class TreeNode<E> {

        E element;

        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }

        // T(n) for Search, Insertion and Deletion = O(log(n)) for a Balanced Tree and O(n) for an elongated tree

        public boolean search(E element) {

            // visited, means that the node is checked for having the value you are searching for

            // Breadth-First Search:
                // proceeds level by level from top-down
                // visits node from left to right
                // implemented using a queue
                // place the root in the queue
                // node at the front of the queue(root) is removed and visited
                // replaced by its children if any

            // Depth-First Search:
                // proceeds by following left or right branches as far as possible
                // 6 variations
                // focusing on 3:

                // Preorder Search:
                    // VLR (Visit, Left, Right):
                    // visit the current node (starting at the root)
                    // if possible go left
                    // otherwise go right
                    // repeat

                // Postorder Search:
                    // LRV (Left, Right, Visit)
                    // go Left if possible
                    // else go Right
                    // if no children available, visit the current node

                // Inorder Search:
                    // LVR( Left, Visit, Right)
                    // Go Left if possible
                    // otherwise visit node
                    // backtrack, visiting each node, until you find a right child
                    // visit the current node first, then go right


                // T(n) for PreOrder, PostOrder and InOrder = O(n)

            return true;
        }


        public boolean insert(E element) {
            
            // finding the first available empty node
                // maintains order of left children being smaller and right children being greater

            // if (root = null)
                // root = element;
            // else:
                // while (current node != null)
                    // if (element.value < current.value) 
                        // parent = current
                        // current = current.left
                    // else if (element.value > current.value)
                        // parent = current
                        // current = current.right
                    // else
                        // return false
                    
            // Inserting it Accordingly

            // if ( element < parent.element)
                // parent.left = new TreeNode<E> (element)
            // else
                // parent.right = new TreeNode<E> (element)

            return true;
        }

        public boolean Deletion() {
            
            // Deletion is a Complex Operation Depending on the Placement of the Node
                // Case 1: The Node is a Leaf
                    // Set the Parent Link to Null
                    // Delete the Leaf Node

                // Case 2: The Node has 1 Child
                    // Set the Parent Node, to the Node's Child, instead of the Node itself
                    // Skip out the Middle Man
                
                // Case 3: The Node has 2 Children
                    // Complicated:
                    // 2 Methods:
                        // Deletion by Merging
                        // Deletion by Copying
                


                // Merging:
                    // Merging the 2 Childrens' Subtrees together into one bigger tree
                    // Right Sub Tree > Left Sub Tree
                    // The first left option, takes the original nodes place
                    // the right subtree, becomes the subtree of the rightmost node on the left subtree


                // Copying:
                    // Again, find the rightmost node of the left subtree
                    // That node, directly replaces the deleted node
                    // note that no other node moves
                    // if it was intially a left branching node of the left subtree
                        // it now branches off of the replaced node

            return true;
        }

    }

}
