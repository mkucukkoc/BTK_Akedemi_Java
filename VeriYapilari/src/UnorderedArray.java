
public class UnorderedArray
{
private long a[];
private int numberElemens;
public UnorderedArray(int max)
{
a =new long[max];
numberElemens=0;
}
public boolean find(long searchKey)
{
 int j;
 for(j=0;j<numberElemens;j++)
 if(a[j]==searchKey)
 break;
 if(j==numberElemens)
  return false;
 else
  return true;
 }
public void insert(long value)
{
a[numberElemens]=value;
numberElemens++;
}
//GÖRÜNTÜLEME İŞLEM
public void display()
{
for(int j=0;j<numberElemens;j++)
System.out.println(a[j]+"");
System.out.println("");
}
public boolean delete(long value)
{
 int j;
 for(j=0;j<numberElemens;j++)
    if(value==a[j])
        break;
    if(j==numberElemens)
        return false;
    else
    {
    for(int k =j;k<numberElemens;k++)
        a[k]=a[k+1];
        numberElemens--;
        return true;
    }
}
}