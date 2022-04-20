
import java.util.Scanner;

class ExpressionTree
{
/** class TreeNode **/
class TreeNode
{    
    char data;
    TreeNode left, right;

    /** constructor **/
    public TreeNode(char data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 

/** class StackNode **/
class StackNode
{
    TreeNode treeNode;
    StackNode next;

    /** constructor **/
    public StackNode(TreeNode treeNode)
    {
        this.treeNode = treeNode;
        next = null;
    }
}

private  StackNode top;

/** constructor **/
public ExpressionTree()
{
    top = null;
}

/** function to clear tree **/
public void clear()
{
    top = null;
}

/** function to push a node **/
private void push(TreeNode ptr)
{
    if (top == null)
        top = new StackNode(ptr);
    else
    {
        StackNode nptr = new StackNode(ptr);
        nptr.next = top;
        top = nptr;
    }
}

/** function to pop a node **/
private TreeNode pop()
{
    if (top == null)
        throw new RuntimeException("Underflow");
    else
    {
        TreeNode ptr = top.treeNode;
        top = top.next;
        return ptr;
    }
}

/** function to get top node **/
private TreeNode peek()
{
    return top.treeNode;
}

/** function to insert character **/
private void insert(char val)
{
    try
    {
        if (isDigit(val))
        {
            TreeNode nptr = new TreeNode(val);
            push(nptr);
        }
        else if (isOperator(val))
        {
            TreeNode nptr = new TreeNode(val);
            nptr.left = pop();
            nptr.right = pop();
            push(nptr);
        }
    }
    catch (Exception e)
    {
        System.out.println("Invalid Expression");
    }
}

/** function to check if digit **/
private boolean isDigit(char ch)
{
    return ch >= '0' && ch <= '9';
}

/** function to check if operator **/
private boolean isOperator(char ch)
{
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}

/** function to convert character to digit **/
private int toDigit(char ch)
{
    return ch - '0';
}

/** function to build tree from input */
public void buildTree(String eqn)
{
    for (int i = eqn.length() - 1; i >= 0; i--)
        insert(eqn.charAt(i));
}

/** function to evaluate tree */
public double evaluate()
{
    return evaluate(peek());
}

/** function to evaluate tree */
public double evaluate(TreeNode ptr)
{
    if (ptr.left == null && ptr.right == null)
        return toDigit(ptr.data);
    else
    {
        double result = 0.0;
        double left = evaluate(ptr.left);
        double right = evaluate(ptr.right);
        char operator = ptr.data;

        switch (operator)
        {
        case '+' : result = left + right; break;
        case '-' : result = left - right; break;
        case '*' : result = left * right; break;
        case '/' : result = left / right; break;
        default  : result = left + right; break;
        }
        return result;
    }
}

/** function to get postfix expression */
public void postfix()
{
    postOrder(peek());
}

/** post order traversal */
private void postOrder(TreeNode ptr)
{
    if (ptr != null)
    {
        postOrder(ptr.left);            
        postOrder(ptr.right);
        System.out.print(ptr.data);            
    }    
}

public class VeriYapilari {
    public static void main(String[] args) 
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Expression Tree Test");

    /** make object of ExpressionTree **/
    ExpressionTree et = new ExpressionTree();

    System.out.println("\nEnter equation in prefix form");
    et.buildTree(scan.next());
    System.out.print("\n\nPostfix : ");
    et.postfix();
    System.out.println("\n\nEvaluated Result : "+ et.evaluate());
    }
  }
}
       /* int maxsize=8;
        QuickSort arr;
        arr=new QuickSort(maxsize);
        for(int j=0;j<maxsize;j++)
        {
        long n=(int)(java.lang.Math.random()*99);
        arr.insert(n);
        }
        arr.display();
        arr.quicksort();
        arr.display();*/
        // Asagıdaki main kodu Partitiona aittir..
      /* int maxsize=10;
    ArrayPar arr;
    arr=new ArrayPar(maxsize);
    for(int i=0;i<maxsize;i++)
    {
    long n=(int)(java.lang.Math.random()*199);
    arr.insert(n);
    }
    arr.display();
    long pivot=99;
    System.out.print("Pivot is :"+pivot);
    int size =arr.size();
    int patdex=arr.partition(0, size-1,pivot);
        System.out.println("partion is at index:"+patdex);
    arr.display();*/ 
        
        // Asagıdaki main kodu shell sorta aittir.. 
   /* int maxsize=10;
    ArraySh arr;
    arr=new ArraySh(maxsize);
    for(int i=0;i<maxsize;i++)
    {
    long n=(int)(java.lang.Math.random()*99);
    arr.insert(n);
    }
    arr.display();
    arr.shellSort();
    arr.display();*/

     class sıralama{
    public static void unorderedArray()
    {
       UnorderedArray unarray=new UnorderedArray(132);
        unarray.insert(111);
        unarray.insert(132);
        unarray.insert(141);
        unarray.insert(142);
        unarray.insert(134);
        unarray.insert(145);  
        int searchKey=122;
        if(unarray.find(searchKey))
        {
            System.out.println("Found : "+searchKey);
        }
        else
        {
         System.out.println("Not Found : "+searchKey);
        } 
    unarray.delete(134);
    unarray.delete(141);
    unarray.display();    
    }
    public static void orderedArray()
    {
     int maxSize=100;
     OrderedArray arr=new OrderedArray(maxSize);
     arr.insert(77);
     arr.insert(99);
      arr.insert(66); 
      arr.insert(55);
       arr.insert(88);
       arr.insert(11);
      arr.insert(14);
      arr.insert(00);
      int searchKey=55;
      if(arr.find(searchKey)!=-1)
      {
      System.out.print("Found"+searchKey);
      }
      else
      {
       System.out.print("Cannot Found"+searchKey);
      }
      arr.delete(00);
      arr.delete(55);
      arr.display();
    }
    }