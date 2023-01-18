/* Main class
 public class solution {
	public static void main(String[] args) {
		MedianFinder medianFinder = new MedianFinder();
		medianFinder.addNum(1);    // arr = [1]
		medianFinder.addNum(2);    // arr = [1, 2]
		medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
		medianFinder.addNum(3);    // arr[1, 2, 3]
		medianFinder.findMedian(); // return 2.0
	}
 }
*/

// Time: O(log n) add, O(1) find
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }
}
