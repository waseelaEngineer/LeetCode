/*
class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){this.val = val;}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}  
 */
public class solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }
        
        return a;
    }
}