
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class ArrayListScanner {
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner soc=new Scanner(System.in);
   List <String> l=new ArrayList<String>();
   System.out.println("How many elements you want to add");
   int n=soc.nextInt();
   for(int i=0;i<n;i++)
   {
       l.add(soc.next());
   }
        //Print the list
        System.out.println("List"+l);
        
        //Added elements again
        System.out.println("How many elements you want to add Again in the List");
        n=soc.nextInt();
       for(int i=0;i<n;i++)
        {
       l.add(soc.next());
     }
        System.out.println("New Dynamic List"+l);
        }
    
}
