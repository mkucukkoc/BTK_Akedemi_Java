package veriyapilari2;
public class OgrenciList {
 private Ogrenci first;
 public OgrenciList()
 {
 first=null;
 }
 public boolean isEmpty()
 {
 return(first==null);
 }
 public void displayList()
 {
 Ogrenci current=first;
 while(current!=null)
 {
     current.displayogrenci();
     current=current.next;
 }
 }
 public Ogrenci find(int no)
 {
  Ogrenci current=first;
  while(current.ogrno!=no)
  {
  if(current.next==null)
  {
  return null;
  }
  else
  {
  current=current.next;
  }
  }
  return current;
 }
 public void insertSorted(int ogrno,String adi,String soyadi)
 {
   Ogrenci ogrenci=new Ogrenci(ogrno, adi, soyadi); 
   Ogrenci previous=null;
   Ogrenci current=first;
    while(current!=null&&ogrno>current.ogrno)
 {
     previous=current;
     current=current.next;
 }
   if(previous==null)
  {
  first=ogrenci;
  }
  else
  {
  previous.next=ogrenci;
  ogrenci.next=current;
  } 
 }
 public Ogrenci delete(int no)
 {
 Ogrenci current=first;
 Ogrenci previous=first;
 while(current.ogrno!=no)
 {
 if(current.next==null)
  {
  return null;
  }
  else
  {
      previous=current;
  current=current.next;
  }
 }
 if(current==first)
 {
  first=first.next;
 }
 else
 {
  previous.next=current.next;
 }return current;
 }
}
