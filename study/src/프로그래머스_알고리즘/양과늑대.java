package ���α׷��ӽ�_�˰���;
import java.util.*;
public class ������� {
	static ArrayList<Integer>[] childs;
    static int maxSheepCnt = 0;
    
    public int solution(int[] info, int[][] edges) {
        int answer = 0;
        
        int sheepCnt = 0; //���� ���� ��
        int wolfCnt = 0;  //���� ������ ��
      
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
        
        //System.out.println("���� ��ġ = " + idx + " �� = " + sheepCnt + " ���� = " + wolfCnt);
        
        if(sheepCnt <= wolfCnt) {return;} // ���� ���� ���� �� ���� ���밡 �� ���ų� ������ return
        maxSheepCnt = Math.max(maxSheepCnt, sheepCnt); //�׷��� ������ maxSheep ����
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(nextPos);
        // System.out.println(list.toString());
        list.remove(Integer.valueOf(idx)); //���� ��ġ ����
        
        if(childs[idx] != null) {//�ڽ�������
            for (int child : childs[idx]){
                list.add(child);
            }
        }
        
        for (int next : list){
            go(next, sheepCnt, wolfCnt, list, info);
        }
    }
}
