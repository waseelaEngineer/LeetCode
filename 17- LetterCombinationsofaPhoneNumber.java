import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class answer {

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
	
    static List<String> letterCombinations(String digits) {
    	
       List<String> res = new ArrayList<>();
       if(digits.length() == 0) return res;
       HashMap<Character,String> map = new HashMap<>();
       map.put('2',"abc");
       map.put('3',"def");
       map.put('4',"ghi");
       map.put('5',"jkl");
       map.put('6',"mno");
       map.put('7',"pqrs");
       map.put('8',"tuv");
       map.put('9',"wxyz");
      
       Queue<String> q = new LinkedList<>();
       q.add("");
       for(int i = 0; i < digits.length(); i++){
           String letters = map.get(digits.charAt(i));
           int n = q.size();
           for(int j = 0; j < n; j++){
               String pull = q.poll();
               for(int k = 0; k < letters.length(); k++){
                   String temp = pull.concat(letters.charAt(k)+"");
                   q.add(temp);
               }
           }
       }
       while(!q.isEmpty())
           res.add(q.poll());
       return res;  
    }
}