
public class TestLinkList {
	public static void main(String [] args) {
		MyLinkedList<String> L = new MyLinkedList<String>();
		L.add("Browns");
		L.add("Ravens");
		L.add("Steelers");
		L.add("Chargers");
		L.quicksort();
		
		System.out.println(L);
		
	}

}
