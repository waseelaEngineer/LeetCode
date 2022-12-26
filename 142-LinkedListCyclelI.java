/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class solution {

	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(0);
		ListNode d = new ListNode(-4);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = b;
		
		ListNode res = detectCycle(a);
	}
	
	static ListNode detectCycle(ListNode head) {
		
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) break;
		}
		
		if (fast == null || fast.next == null) return null;

		while (head != slow) {
			head = head.next;
			slow = slow.next;
		}
		
		return head;
	}
}
