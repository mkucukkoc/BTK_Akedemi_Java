class MyStack
{
private int maxSize; // size of stack array
private long[] stackArray;
private int top; // top of stack
public MyStack(int s) // constructor
{
maxSize = s; // set array size
stackArray = new long[maxSize]; // create array
top = -1; // no items yet
}
public void push(long j) // put item on top of stack
{
stackArray[++top] = j; // increment top, insert item
}
public long pop() // take item from top of stack
{
return stackArray[top--];
// access item, decrement top
}
public long peek() // peek at top of stack
{
return stackArray[top];
}
public boolean isEmpty()
// true if stack is empty
{
return (top == -1);
}
public boolean isFull()
// true if stack is full
{
return (top == maxSize-1);
}
} // end class MyStack
public class Sınav {
    public static void main(String[] args) 
    {
      MyStack theStack = new MyStack(10); // make new stack
theStack.push(20); // push items onto stack
theStack.push(40);
theStack.push(60);
theStack.push(80);
while( !theStack.isEmpty() ) // until it’s empty,
{ // delete item from stack
long value = theStack.pop();
System.out.print(value); // display it
System.out.print("");
} // end while
System.out.println("");

       
    }
    }
