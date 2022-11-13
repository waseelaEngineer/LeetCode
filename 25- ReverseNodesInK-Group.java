// 	Definition for singly-linked list.
//	public class ListNode {
//		int val;
//		ListNode next;
//		ListNode() {}
//		ListNode( int val) { this.val = val; }
//		ListNode( int val, ListNode next) {this.val = val; this.next = next; }
//	}
public class answer {

	public static void main(String[] args) {
		ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));    //[1, 2, 3, 4, 5]
		ListNode res = reverseKGroup(a,3);    // [3, 2, 1, 4, 5]
	}
	
    static ListNode reverseKGroup(ListNode head, int k) {
    	if (k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
	    ListNode pointer = dummy;
	    while (pointer != null) {
	        ListNode node = pointer;
	        //  check there are k nodes to reverse
	        for (int i = 0; i < k && node != null; i++) {
	            node = node.next;
	        }
	        if (node == null) break;
	        
	        //  we have k nodes, then start from the first node
	        ListNode prev = null, curr = pointer.next, next = null;
	        for (int i = 0; i < k; i++) {
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }    // after loop ends values are : prev=321, curr=45, next=45
	       
	        ListNode tail = pointer.next;
	        tail.next = curr;    // tail=145
	        pointer.next = prev;    // pointer = 032145
	        pointer = tail;
	    }
	    return dummy.next;
    }
}
