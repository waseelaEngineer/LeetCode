// Definition for singly-linked list. (in other class)
//public class ListNode {
//	 int val;
//	 ListNode next;
//	 ListNode() {}
//	 ListNode(int val) { this.val = val; }
//	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class answer {

	public static void main(String[] args) {
		ListNode a = new ListNode(1, new ListNode(2, new ListNode(4)));    // [1, 2, 4]
		ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));    // [1, 3, 4]
		ListNode res = mergeTwoLists(a, b);                                // [1, 1, 2, 3, 4, 4]
	}
	
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
            }    
            else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }      
        if (l1 == null)
        	l3.next = l2;
        else 
        	l3.next = l1;
  
        return dummy.next;
    }
}
