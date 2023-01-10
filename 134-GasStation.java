
public class solution {

	public static void main(String[] args) {
		System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
	}
	
	static int canCompleteCircuit(int[] gas, int[] cost){
		int n = gas.length;
		int total_gas = 0;
		int curr_gas = 0;
		int start = 0;
		for (int i = 0; i < n; i++) {
			total_gas = gas[i] - cost[i];
			curr_gas = gas[i] - cost[i];
			if (curr_gas < 0) {
				curr_gas = 0;
				start = i + 1;
			}
		}
		return (total_gas < 0) ? -1 : start;
	}

}