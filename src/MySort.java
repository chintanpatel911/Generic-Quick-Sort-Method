
public class MySort {
	public static class ReturnObject <E extends Comparable<E>>{
		MyNode<E> pivot;
		MyNode<E> newHead;
		MyNode<E> newTail;
	}
	
	public static <E extends Comparable<E>> MyNode<E> quickSort(MyNode<E> list) {
		if (list == null)
			return null;
		MyNode<E> tail = getTail(list);
		
		if (list == tail)
			return list;
		return quickSortRecur(list, tail);
	}
	
	public static <E extends Comparable<E>> ReturnObject<E> partition(MyNode<E>head, MyNode<E>end, ReturnObject<E> retValue){
	MyNode<E> pivot = end;
	MyNode<E> prev = null, curr = head, tail = pivot;
	
	while (curr != pivot){
		if(curr. element. compareTo(pivot.element) < 0)
		{
			if ((retValue.newHead) == null)
				(retValue.newHead) = curr;
			
			prev = curr;
			curr = curr.next;
		}
		else
		{
			if (prev != null)
				prev.next = curr.next;
			MyNode<E> tmp = curr.next;
			curr.next = null;
			tail.next = curr;
			tail = curr;
			curr = tmp;
		}
	}
	if ((retValue.newHead) == null)
		(retValue.newHead) = pivot;
	(retValue.newTail) = tail;
	retValue.pivot = pivot;
	return retValue;
}
	public static <E extends Comparable<E>> MyNode<E> getTail(MyNode<E> curr){
		while (curr != null && curr.next != null)
			curr = curr.next;
		return curr;
	}
	public static <E extends Comparable<E>> MyNode <E> quickSortRecur(MyNode<E> head, MyNode<E> end)
	{
		if (head == null || head == end)
			return head;
		MyNode <E> newHead = null, newEnd = null;
		
		ReturnObject<E> retValue = new ReturnObject<E>();
		retValue = partition (head, end, retValue);
		MyNode <E> pivot = retValue.pivot;
		newHead = retValue.newHead;
		newEnd = retValue.newTail;
		
		if (newHead != pivot)
		{
			MyNode<E> tmp = newHead;
			while (tmp.next != pivot)
			tmp = tmp.next;
			tmp.next = null;
			
			newHead = quickSortRecur(newHead, tmp);
			tmp = getTail(newHead);
			tmp.next = pivot;
		}
		pivot.next = quickSortRecur(pivot.next, newEnd);
				return newHead;
	}
}
	
