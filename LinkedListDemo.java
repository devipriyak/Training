import java.util.*;    
class LinkedListDemo{    
 public static void main(String args[]){    
     
  List<String> al2=new LinkedList<String>();//creating object for List throgh Linked List    
  al2.add("James");//adding object in linkedlist    
  al2.add("Serena");    
  al2.add("Swati");    
  al2.add("Junaid");    
  System.out.println("linkedlist: "+al2);  
  al2.add(0, "Prem");
  System.out.println(al2);
  al2.set(4, "JUN");
  System.out.println(al2);
  
 LinkedList<String> l=new LinkedList<String>();//Creating Object for Linked List
 l.addFirst("Hello");
 l.addFirst("Welcome");
 System.out.println(l);
 }    
}    
