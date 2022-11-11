//  Definition for singly-linked list.
//	public class ListNode {
//		int val;
//		ListNode next;
//		ListNode() {}
//		ListNode(int val) { this.val = val; }
//		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//	}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class answer {

	public static void main(String[] args) {
		ListNode a = new ListNode(1, new ListNode(4, new ListNode(5)));    // [1, 4, 5]
		ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));    // [1, 3, 4]
		ListNode c = new ListNode(2, new ListNode(6));                     // [2, 6]
		ListNode res = mergeKLists(new ListNode[] {a, b, c});              // [1, 1, 2, 3, 4, 4, 5, 6]
	}
	
	static ListNode mergeKLists(ListNode[] lists) {
		
		List<Integer> l = new ArrayList<>();
		for (ListNode ln : lists) {
			while (ln != null) {
				l.add(ln.val);
				ln = ln.next;
			}
		}
		Collections.sort(l);
		
		ListNode dummy = new ListNode(0);
		ListNode h = dummy;
		for (int i : l) {
			ListNode t = new ListNode(i);
			h.next = t;
			h = h.next;
		}
		h.next = null;
		return dummy.next;
	}
}
