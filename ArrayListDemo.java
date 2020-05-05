
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List <Integer> l=new ArrayList<Integer>();
        
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(50);
        System.out.println(l);//Printing the List Object
        List <Integer> l2=new ArrayList<Integer>();//New List Object
        l2.add(1200);//Add the element to list2
        l2.addAll(l);//Append the list 1 elements to list2
        System.out.println(l2);
        l.add(2, 34);//Add the elment-34- at index 2
         System.out.println(l);
        l.add(1,50);//Add the element -50 at the index one
        l.add(30);
        System.out.println(l);
             
       System.out.println("index of 30 at "+l.indexOf(300));//search the element 
        System.out.println(" 50 existed in the list"+l.contains(500));//Check given element available in the list
       System.out.println("2 index "+l.get(2));//Reterive value based on the index number
       l.set(0,144);//Replacing the particular element based on the index
       System.out.println(l);
       l.add(0);
       l.add(0);
       System.out.println(l);
       
       l.remove(new Integer(0));//zero value-Based on the Object removes
       System.out.println("Updated List"+l);
       l.remove(2);//Remove the object based on the index number-2
       System.out.println(l.equals(l));
         //iterate the List- using for each
         System.out.println("List of elements using Iterator");
        Iterator iterator=l.iterator();
         while(iterator.hasNext())//verifies elements are existed in the iterator()
         {
             System.out.println(iterator.next());
         }
                System.out.println("List of elements using for-each");
            //iterates the elements using for-each
      for(Integer i:l)//i is pointed element by element of List Object -l
           
       {
           System.out.println(i);
       }
             
    }
}
        
                
                
           
