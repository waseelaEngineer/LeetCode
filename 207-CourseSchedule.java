import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

	public static void main(String[] args) {
		System.out.println(canFinish(2, new int[][] {{1, 0}}));
	}

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int count=0; //  2
        
        for(int i=0;i<numCourses;i++)
            graph[i] = new ArrayList<>();
            
        for(int i=0; i<prerequisites.length;i++){
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i=0; i<degree.length;i++){
            if(degree[i] == 0){
                queue.add(i);
                count++;
            }
        }
        
        while(queue.size() != 0){
            int course = (int)queue.poll();
            for(int i=0; i<graph[course].size();i++){
                int pointer = (int)graph[course].get(i);
                degree[pointer]--;
                if(degree[pointer] == 0){
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if(count == numCourses)
            return true;
        else    
            return false;
    }
}
