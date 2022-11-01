/**
 * Definition for singly-linked list. (in other file)
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode a = new ListNode(2, new ListNode(4, new ListNode(3)));    //[2, 4, 3]
		ListNode b = new ListNode(5, new ListNode(6, new ListNode(4)));    //[5, 6, 4] 
		ListNode result = addTwoNumbers(a, b);
		
		while (result != null) {
			System.out.print(result.val);    //[708]
			result = result.next;
		}	
	}
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
	 
}
