import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class answer {

	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
	}
	
	static List<List<String>> groupAnagrams(String[] strs){
		if (strs.length == 0) return new ArrayList();
		Map<String, List> ans = new HashMap<>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
}