import java.util.*;

public class MyLinkedList<E extends Comparable<E>> 
{
	private MyNode<E> head;
	
	public void MyLinkListedList()
	{
		head = null;
	}
	 public void add(E e)
	 {
		 MyNode<E> newNode = new MyNode<E> (e);
		 newNode.next = head;
		 head = newNode;
	 }
	 public boolean find(E x)
	 {
		 MyNode<E> cursor = head;
		 
		 while (cursor != null) {
			 if(cursor.element.equals(x))
				 return true;
			 cursor = cursor.next;
		 }
		 return false;
	 }
	 public void insertElementBefore(E key, E e)
	 {
		 if (head ==null) return;
		 if (head.element.equals (key))
		 {
			 add(e);
			 return;
		 }
		 
		 MyNode<E> prev = null;
		 MyNode<E> curr = head;
		 
		 while (curr != null && !curr.element.equals(key)){
			 prev = curr;
			 curr = curr.next;
		 }
		 if (curr != null)
			 prev.next = new MyNode<E>(e);
		 curr = prev.next;
		 
	 }
	 public void delete(E key) throws Exception
	 {
		 if (head == null)
			 throw new Exception ("Cannot delete");
		 if (head.element.equals (key))
		 {
			 head = head.next;
			 return;
		 }
		 MyNode<E> curr = head;
		 MyNode prev = null;
		 
		 while (curr != null && !curr.element.equals (key))
		 {
			 prev = curr;
			 curr = curr.next;
			 
		 }
		 if (curr == null)throw new RuntimeException ("Cannot delete");
		 prev.next = curr.next;
	 }
	 public void quicksort(){
		 head = MySort.quickSort(head);
	 }
	 public String toSting(){
		  StringBuilder result = new StringBuilder("[");
		 
		 MyNode<E> curr = head;
		while (curr != null){
			 result.append(curr.element);
			 curr = curr.next;
			 if(curr != null) {
				 result.append(",");
			 }
			 else{
				 
				 result.append("]");
			 }
		 }
		 return result.toString();
	 }
}
