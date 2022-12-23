public class solution {

	public static void main(String[] args) {
		Node e = new Node(13, null, null);
		Node d = new Node(13, e, null);
		Node c = new Node(13, d, null);
		Node b = new Node(13, c, null);
		Node a = new Node(7, b, null);
		b.random = a;
		c.random = e;
		d.random = c;
		e.random = a;		
		
		Node res = copyRandomList(a);
	}
	
    static Node copyRandomList(Node head) {
        if (head == null) return head;
    	
        Node c = head;
        while(c != null){
            Node next = c.next;
            c.next = new Node(c.val, next, null);
            c = next;
        }

        c = head;
        while (c != null){
            if (c.random != null)
                c.next.random = c.random.next;
            c = c.next.next;
        }

        c = head;
        Node copyHead = head.next;
        Node copy = copyHead;
        while (copy.next != null){
            c.next = c.next.next;
            c = c.next;

            copy.next = copy.next.next;
            copy = copy.next;
        }
        c.next = c.next.next;

        return copyHead;
    }
}
