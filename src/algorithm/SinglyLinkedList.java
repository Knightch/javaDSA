package algorithm;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data; // Generic type
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//Display items of LinkList	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	//Count number of items in LinkList	
	public int countLinkList() {
		if(head == null) {
			return 0;
		}		
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	// Insert item in singlyLinkedList
	public void insertItem(int data) {
		ListNode newNode = new ListNode(data);
		 newNode.next = head;
		 head = newNode;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head = new ListNode(10);
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(8);
//		ListNode fourth = new ListNode(11);
//		
//		//Now we will connect them together to form a chain
//		sll.head.next = second;
//		second.next = third;
//		third.next = fourth;
//		
		sll.insertItem(11);
		sll.insertItem(10);
		sll.insertItem(9);
		sll.insertItem(8);
		sll.display();
		System.out.println("number of items in list " + sll.countLinkList());
	}
}
