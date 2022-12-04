package 프로그래머스_알고리즘;
import java.util.*;
public class 양과늑대 {
	static ArrayList<Integer>[] childs;
    static int maxSheepCnt = 0;
    
    public int solution(int[] info, int[][] edges) {
        int answer = 0;
        
        int sheepCnt = 0; //현재 양의 수
        int wolfCnt = 0;  //현재 늑대의 수
      
        childs = new ArrayList[info.length];
            
        for (int i = 0; i < edges.length; i++){
            int parent = edges[i][0];
            int child = edges[i][1];
            
            if(childs[parent] == null){
                childs[parent] = new ArrayList<>();
            }
            
            childs[parent].add(child);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        go(0, 0, 0, list, info);
        
        return maxSheepCnt;
    }
    
    public static void go(int idx, int sheepCnt, int wolfCnt, ArrayList<Integer> nextPos, int[] info){
        
        if(info[idx] == 0) sheepCnt++;
        else wolfCnt ++;
        
        //System.out.println("현재 위치 = " + idx + " 양 = " + sheepCnt + " 늑대 = " + wolfCnt);
        
        if(sheepCnt <= wolfCnt) {return;} // 현재 양의 마리 수 보다 늑대가 더 많거나 같으면 return
        maxSheepCnt = Math.max(maxSheepCnt, sheepCnt); //그렇지 않으면 maxSheep 갱신
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(nextPos);
        // System.out.println(list.toString());
        list.remove(Integer.valueOf(idx)); //현재 위치 제거
        
        if(childs[idx] != null) {//자식있으면
            for (int child : childs[idx]){
                list.add(child);
            }
        }
        
        for (int next : list){
            go(next, sheepCnt, wolfCnt, list, info);
        }
    }
}
