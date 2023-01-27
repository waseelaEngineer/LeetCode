import java.util.ArrayList;
import java.util.List;

// Time: O(n)
// Space: O(n)
public class solution {

	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}
	
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if(p.length() > s.length()) return  list;
    
        int N=s.length();
        int M=p.length();
        int[]count = freq(p); // intialize only 1 time
        
        int[]currentCount = freq(s.substring(0, M)); // update every-time according to sliding window
        
        if(areSame(count,currentCount)) list.add(0);
    
        for(int i=M;i<N;i++){
            currentCount[s.charAt(i-M) - 'a']--; // remove first letter
            currentCount[s.charAt(i)-'a']++; // add new next letter
            if(areSame(count,currentCount)){
                list.add(i-M+1);
            }
        }
        return list;
    }
    
    static boolean areSame(int[] x, int[] y){
        for(int i = 0; i < 26; i++)
            if(x[i] != y[i]) 
            	return false;
  
        return true;
    }

    static int[] freq(String s){
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;
        
        return count;
    }

}
