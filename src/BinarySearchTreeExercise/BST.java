package BinarySearchTreeExercise;

public class BST {
    Node root;

    public void insert(int v) {
        if (root == null) {
            root = new Node(v);
            return;
        }
        Node curr  = root;
        while (true) {
            if (v < curr.val) {
                if (curr.left == null) {
                    curr.left = new Node(v);
                    return;
                }
                curr = curr.left;

            }
            else  {
                if (curr.right == null) {
                    curr.right = new Node(v);
                    return;
                }
                curr = curr.right;
            }
        }
    }

    public boolean search(int v) {
        Node curr = root;
        while (curr != null) {
            if (curr.val == v) {
                return true;
            }
            curr = (v < curr.val) ? curr.left : curr.right;
        }
        return false;
    }

    public void delete(int v) {
        root = deleteRec(root,v);
    }
    public Node deleteRec(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.val) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.val) {
            node.right = deleteRec(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
            return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            Node succ = minNode(node.right);
            node.val = succ.val;
            node.right = deleteRec(node.right, succ.val);
        }
        return node;
    }

    public Node minNode(Node node) {
        Node cur = node;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
}
