/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class solution {

	public static void main(String[] args) {
		ListNode input = new ListNode(1, new ListNode(2, new ListNode(3)));
		ListNode reversed = reverse(input);
	}
	
	static ListNode reverse(ListNode head) {
		return helper(head, null);
	}
	
	static ListNode helper(ListNode head, ListNode newHead) {
		if (head == null) return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return helper(next, head);
	}

}
