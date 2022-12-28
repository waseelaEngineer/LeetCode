/*
public class ListNode {
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){ this.val = val; }
	ListNode(int val, ListNode next){ this.val = val; this.next = next; }
}
*/
public class solution {

	public static void main(String[] args) {
		ListNode root = new ListNode(10, new ListNode(1, new ListNode (30, new ListNode(2, new ListNode(5)))));
		ListNode res = sortList(root);
		System.out.println(res.next.next.next.next.val);
	}
	
	static ListNode tail = new ListNode();
	static ListNode nextSubList = new ListNode();
	
	static ListNode sortList(ListNode head) {
		if (head == null || head.next == null) return head;
		
		int n = getCount(head);
		ListNode start = head;
		ListNode dummyHead = new ListNode();
		for (int size = 1; size < n; size = size * 2) {
			tail = dummyHead;
			while (start != null) {
				if (start.next == null) {
					tail.next = start;
					break;
				}
				ListNode mid = split(start, size);
				merge(start, mid);
				start = nextSubList;
			}
			start = dummyHead.next;
		}
		
		return dummyHead.next;
	}
	
	static ListNode split(ListNode start, int size) {
		ListNode premid = start;
		ListNode end = start.next;
		
		for (int i = 1; i < size && (premid.next != null || end.next != null); i++) {
			if (end.next != null) {
				end = (end.next.next != null) ? end.next.next : end.next;
			}
			if (premid.next != null) {
				premid = premid.next;
			}
		}
		
		ListNode mid = premid.next;
		premid.next = null;
		nextSubList = end.next;
		end.next = null;
		return mid;
	}
	
	static void merge(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode();
		ListNode newTail = dummyHead;
		
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				newTail.next = list1;
				newTail = newTail.next;
				list1 = list1.next;
			}
			else {
				newTail.next = list2;
				newTail = newTail.next;
				list2 = list2.next;
			}
		}
		
		newTail.next = (list1 != null) ? list1 : list2;
		
		while (newTail.next != null) {
			newTail = newTail.next;
		}
		
		tail.next = dummyHead.next;
		tail = newTail;
	}
	
	static int getCount(ListNode head) {
		int cnt = 0;
		ListNode curr = head;
		while (curr != null) {
			curr = curr.next;
			cnt++;
		}
		return cnt;
	}

}
