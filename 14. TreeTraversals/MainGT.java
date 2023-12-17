import java.util.Stack;
import java.util.ArrayList;
public class MainGT{
    public static class TreeNode{
        int val;
        ArrayList<TreeNode> children;

        TreeNode(int v){
            val = v;
            children = new ArrayList<>();
        }
        TreeNode(int v, ArrayList<TreeNode> c){
            val = v;
            children = c;
        }
    }

    public static TreeNode createTree(int [] A){
        Stack<TreeNode> st = new Stack<>();
        for(int i = 0; i < A.length-1; i++){
            if(A[i] == -1){
                TreeNode tmp = st.pop();
                st.peek().children.add(tmp);
            }
            else{
                st.push(new TreeNode(A[i]));
            }
        }
        return st.peek();
    }

    public static void preOrder(TreeNode root){
        System.out.print(root.val + " ");
        for(TreeNode child : root.children){
            preOrder(child);
        }
    }


    public static void main(String [] args){
        int [] A = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 100, -1, 110, -1, -1, 90, -1, -1, 40, 120, 140, -1, 150, -1, -1, -1, -1};
        TreeNode root = createTree(A);
        preOrder(root);
    }
}