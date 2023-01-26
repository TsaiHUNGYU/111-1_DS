
package week14;

class RBNode {
    int val;
    boolean color;
    RBNode left, right, parent;

    public RBNode(int val) {
        this.val = val;
        this.color = false;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}

public class RBtree {

    RBNode root;

    public RBtree() {
        root = null;
    }

    public void insert(int val) {
        RBNode newNode = new RBNode(val);
        RBNode temp = root;
        if (root == null) {
            root = newNode;
            newNode.color = false;
            return;
        }
        while (temp != null) {
            if (val < temp.val) {
                if (temp.left == null) {
                    temp.left = newNode;
                    newNode.parent = temp;
                    break;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    newNode.parent = temp;
                    break;
                } else {
                    temp = temp.right;
                }
            }
        }
        fixTree(newNode);
    }

    public void fixTree(RBNode node) {
        while (node.parent != null && node.parent.color == true) {
            RBNode uncle = null;
            if (node.parent == node.parent.parent.left) {
                uncle = node.parent.parent.right;

                if (uncle != null && uncle.color == true) {
                    node.parent.color = false;
                    uncle.color = false;
                    node.parent.parent.color = true;
                    node = node.parent.parent;
                    continue;
                }
                if (node == node.parent.right) {
                    node = node.parent;
                    leftRotate(node);
                }
                node.parent.color = false;
                node.parent.parent.color = true;
                rightRotate(node.parent.parent);
            } else {
                uncle = node.parent.parent.left;
                if (uncle != null && uncle.color == true) {
                    node.parent.color = false;
                    uncle.color = false;
                    node.parent.parent.color = true;
                    node = node.parent.parent;
                    continue;
                }
                if (node == node.parent.left) {
                    node = node.parent;
                    rightRotate(node);
                }
                node.parent.color = false;
                node.parent.parent.color = true;
                leftRotate(node.parent.parent);
            }
        }
        root.color = false;
    }

    public void leftRotate(RBNode node) {
        RBNode temp = node.right;
        node.right = temp.left;
        if (temp.left != null) {
            temp.left.parent = node;
        }
        temp.parent = node.parent;
        if (node.parent == null) {
            root = temp;
        } else if (node == node.parent.left) {
            node.parent.left = temp;
        } else {
            node.parent.right = temp;
        }
        temp.left = node;
        node.parent = temp;
    }

    public void rightRotate(RBNode node) {
        RBNode temp = node.left;
        node.left = temp.right;
        if (temp.right != null) {
            temp.right.parent = node;
        }
        temp.parent = node.parent;
        if (node.parent == null) {
            root = temp;
        } else if (node == node.parent.right) {
            node.parent.right = temp;
        } else {
            node.parent.left = temp;
        }
        temp.right = node;
        node.parent = temp;
    }

    public static void main(String[] args) {
        RBtree tree = new RBtree();
        tree.insert(7);
        tree.insert(6);
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
    }

}
