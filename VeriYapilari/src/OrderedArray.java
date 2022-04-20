public class OrderedArray
{
 private long a[];
    private int nElems;
 public OrderedArray(int max)
 {
 a=new long[max];
 nElems=0;
 }
 public int size()
 {
  return nElems;
 }
 public int find(long searchKey)
 {
 int lowerBound=0;
 int upperBound=nElems-1;
 int currentIndex;
 while(true)
 {
 currentIndex=(lowerBound+upperBound)/2;
if(a[currentIndex]==searchKey)
{
 return currentIndex;
}
else if(lowerBound>upperBound)
{
return -1;
}
else
{
    if(a[currentIndex]<searchKey)
    {
    lowerBound=currentIndex+1;
    }
    else{
       upperBound=currentIndex-1;
       }}
 }
 }
 public void display()
 {
  for(int j=0;j<nElems;j++)
 {
     System.out.println(a[j]+"");
     System.out.println("");
 }  
 }
 public void insert(long value)
 {
 int j;
 for(j=0;j<nElems;j++)
 {
 if(a[j]>value)
 {
 break;
 }
 for(int k=nElems;k>j;k--)
 {
 a[k]=a[k-1];
 a[j]=value;
 nElems++;
 }
 }
 }
 public boolean delete(long value)
 {
 int j=find(value);
 if(j==-1)
 {
 return false;
 }
 else
 {
  for(int k=j;k<nElems;k++)
  {
  a[k]=a[k-1];
  nElems--;
  }
  return true;
 }
 }
}
