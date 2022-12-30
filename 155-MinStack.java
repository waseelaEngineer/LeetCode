/* main method in different class
public class solution {
	public static void main(String[] args) {
		MinStack obj = new MinStack();
		 obj.push(2);
		 int p3 = obj.top();
		 int p4 = obj.getMin();
		 obj.pop();
	}
}
 */
public class MinStack{
		
	Node head;
	
	void push(int val) {
		if (head == null)
			head = new Node(val, val, null);
		else
			head = new Node(val, Math.min(val, head.min), head);
	}
	
	void pop() {
		head = head.next;
	}
	
	int top() {
		return head.val;
	}
	
	int getMin() {
		return head.min;
	}
	
	class Node{
		int val;
		int min;
		Node next;
		
		Node(int val, int min, Node next){
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}
}
// Time: O(1)
// Space: O(n)