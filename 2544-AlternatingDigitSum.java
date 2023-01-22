import java.util.ArrayList;

public class solution {

	public static void main(String[] args) {
		System.out.println(alternateDigitSum(521));
	}
		
	static int alternateDigitSum(int n) {
	    int sum = 0;
	    ArrayList<Integer> list = new ArrayList<>();
	    while(n != 0){
	        list.add(n % 10);
	        n /= 10;
	    }
	    int c = list.size() - 1;
	    boolean p = true;
	    while(c >= 0){
	        if (p){
	            sum += list.get(c);
	            p = !p;
	        } 
	        else{
	            sum -= list.get(c);
	            p = !p;
	        } 
	        c--;
	    }
	    return sum;
	}

}
