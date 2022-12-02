package 프로그래머스_알고리즘;
import java.util.*;

public class 택배상자_덱 {
	public int solution(int[] order) {
        int answer = 0;
        
        Deque<Integer> mainCon = new LinkedList<>();
        Deque<Integer> subCon = new LinkedList<>();
        
        for (int i = 1; i <= order.length; i++){
            mainCon.push(i);
        }
        
        int i = 0;
        
        while(!mainCon.isEmpty()){
            if(order[i] == mainCon.peekLast()){
                answer++;
                i++;
                mainCon.removeLast();
            }else{
                if(!subCon.isEmpty() && order[i] == subCon.peek()){
                    
                    answer++;
                    i++;
                    subCon.pop();
                }else{
                    subCon.push(mainCon.pollLast());
                }
            }
        }
        
        while(!subCon.isEmpty()){
            if(order[i] == subCon.peek()){
                
                answer++;
                i++;
                subCon.pop();
            }else{
                break;
            }
        }
        
        return answer;
    }
}
