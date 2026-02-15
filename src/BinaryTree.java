public class BinaryTree {
    static class Node{
        int data;
        Node left,right;

        Node(int value){
            this.data = value;
            left=right=null;
        }
    }
    Node root;
    public void insert(int data){
        if (root==null){
            root = new Node(data);
            return;
        }
        insert(root,data);
    }
    public void insert(Node node,int data){
        if(node.left == null){
            node.left = new Node(data);
        } else if (node.right == null) {
            node.right = new Node(data);
        }
        else {
            insert(node.left,data);
        }
    }
    public void inorder(Node node){     //left->root->right
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void preorder(Node node){    //root->left->right
        if(node == null){
            return;
        }
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + " ");;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        System.out.println("Inorder: ");
        tree.inorder(tree.root);
    }
}
