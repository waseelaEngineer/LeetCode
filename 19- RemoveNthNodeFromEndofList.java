//Definition for singly-linked list. (in other class)
//public class ListNode {
//	 int val;
//	 ListNode next;
//	 ListNode() {}
//	 ListNode(int val) { this.val = val; }
//	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class answer {

	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))); // [1, 2, 3, 4, 5]
		System.out.println(removeNthFromEnd(list, 2).val); // head of new ListNode
	}

    static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode dummy = new ListNode(0, head);
    	ListNode left = dummy;
    	ListNode right = head;
    	
    	while(n > 0) {
    		right = right.next;
    		n--;
    	}
    	
    	while(right != null) {
    		left = left.next;
    		right = right.next;
    	}
    	
    	left.next = left.next.next;
    	return dummy.next;
    }
}
