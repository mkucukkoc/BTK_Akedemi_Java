
public class Stacks 
{
int max=100;
int top=-1;
char[] stack=new char[max];
public void push(char element)
{
stack[++top]=element;
}
public boolean isEmpty()
{
    if(top<0)
    {
        System.out.println("stack empty");
        return true;
    }
    else
    {
     return false;
    }
}


public char pop()
{
if(!isEmpty()){
    return stack[top--]; }
else
{
   return 0; 
} 
}
public char stackPop()
{
  return stack[top];  
}
}

