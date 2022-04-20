package pkgfinal;
import java.util.*;
class TreeNode {
  TreeNode left;
  TreeNode right;
  String data;
  public TreeNode(String val)
  {
   data=val;
   left=null;
   right=null;
  }
  public void levelOrder_Traversal(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode top = q.remove();
      System.out.print(top.data + " ");
      if (top.left != null)
      {
        q.add(top.left);
      }
      if (top.right != null) 
      {
        q.add(top.right);
      }
    }
  }
}

public class Final {

    public static void main(String[] args) 
    {
     TreeNode root=new TreeNode("+");
        root.left=new TreeNode("/");
        root.left.left=new TreeNode("*");
        root.left.left.left=new TreeNode("2");
        root.left.right=new TreeNode("-");
        root.left.left.right=new TreeNode("3");
        root.left.right.right=new TreeNode("1");
        root.left.right.left=new TreeNode("2");
        
        root.right=new TreeNode("*");
        root.right.right=new TreeNode("-");
        root.right.left=new TreeNode("5");
        root.right.right.left=new TreeNode("4");
        root.right.right.right=new TreeNode("1");
        System.out.println("Level order Traversel:: ");
        root.levelOrder_Traversal(root);
        
        
    }
    
}
