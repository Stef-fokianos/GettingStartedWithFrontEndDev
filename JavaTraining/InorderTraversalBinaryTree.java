import java.util.Scanner;

public class InorderTraversalBinaryTree{


    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int elements,i,data;
    
        System.out.println("Enter the number of the elements: ");
        elements = scanner.nextInt();

        BinaryTree binaryTree = new BinaryTree();

        System.out.println("Enter the elements: ");
        for (i = 0; i < elements; i++){
            data = scanner.nextInt();
            binaryTree.insert(data);
        }

        System.out.println("Depth-First Traversal: ");
        binaryTree.printDepthFirstTraversal();

        scanner.close();

    }


}


class TreeNode{
    int data;
    TreeNode left, right; 

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }  
}

class BinaryTree{
    TreeNode root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data){
        if (root == null){
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if (data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
        
    }
    
    public void printDepthFirstTraversal(){
        DepthFirstTraversal(root);
    }
    private void DepthFirstTraversal(TreeNode root){
        if (root != null){
            System.out.print(root.data +" ");
            DepthFirstTraversal(root.left);
            DepthFirstTraversal(root.right);
        }
    }
}

