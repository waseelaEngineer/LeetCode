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
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		b.next = a;
		
		System.out.println(hasCycle(a));
	}
	
	static boolean hasCycle(ListNode head) {
		if (head == null) return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) return false;
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;	
	}
}
