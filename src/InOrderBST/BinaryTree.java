package InOrderBST;

public class BinaryTree {
    private Node root;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node curr = root;
        Node parent = null;

        while (curr != null) {
            parent = curr;

            if (data < curr.data) {
                curr = curr.left;
            } else if (data > curr.data) {
                curr = curr.right;
            } else  {
                return;
            }
        }

        if (data < parent.data) {
            parent.left = newNode;
        }  else {
            parent.right = newNode;
        }
    }

    public boolean searchNode(int data) {
        Node curr = root;

        while (curr != null) {
            if (data == curr.data) {
                return true;
            } else if (data < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return false;
    }

    public void removeNode(int data) {
        Node curr = root;
        Node parent = null;

        while (curr != null && curr.data != data) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
            }  else if (data > curr.data) {
                curr = curr.right;
            }
        }

        if (curr == null) {
            return;
        }

        if (curr.left == null || curr.right == null) {
            Node child ;
            if (curr.left == null) {
                child = curr.left;
            }  else {
                child = curr.right;
            }

            if (parent == null) {
                root = child;
            } else if (parent.left == curr) {
                parent.left = child;
            }  else {
                parent.right = child;
            }
        } else {

            Node succParent = curr;
            Node succ = curr.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            curr.data = succ.data;

            Node succChild = succ.right;

            if (succParent.left == succ) {
                succParent.left = succChild;
            } else {
                succParent.right = succChild;
            }
        }
    }
}
