public class Main{
    public static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(){}
        TreeNode(int v){
            val = v;
        }
    }

    static int idx = 0;
    public static TreeNode createTree(int [] arr){
        if(idx >= arr.length || arr[idx] == -1){
            idx++;
            return null;
        }

        TreeNode node = new TreeNode(arr[idx++]);
        node.left = createTree(arr);
        node.right = createTree(arr);

        return node;
    }

    public static void display(TreeNode root){
        if(root == null){
            return;
        }
        String s = "";
        if(root.left == null){
            s += ".";
        }else{
            s += root.left.val;
        }
        s += " <- " + root.val + " -> ";
        if(root.right == null){
            s += ".";
        }else{
            s += root.right.val;
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public static void preOrder(TreeNode root){
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

     public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String [] args){
        int[] arr={10,20,40,-1,-1,50,80,-1,-1,90,-1,-1,30,60,100,-1,-1,-1,70,110,-1,-1,120,-1,-1};
        TreeNode root = createTree(arr);
        // display(root);

        // preOrder(root);
        // inOrder(root);
        postOrder(root);
    }

   
}