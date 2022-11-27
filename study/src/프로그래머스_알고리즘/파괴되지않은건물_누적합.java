package 프로그래머스_알고리즘;

public class 파괴되지않은건물_누적합 {
	class Solution {
	    public int solution(int[][] board, int[][] skill) {
	        int answer = 0;
	        
	        int[][] map = new int[board.length + 1][board[0].length+1];
	        
	        for (int k = 0; k < skill.length; k++){
	            int type = skill[k][0];
	            int r1 = skill[k][1];
	            int c1 = skill[k][2];
	            int r2 = skill[k][3];
	            int c2 = skill[k][4];
	            
	            int degree = (skill[k][5]) * (type == 1 ? -1 : 1);
	            
	            map[r1][c1] += degree;
	            map[r1][c2 + 1] += (degree * -1);
	            map[r2+1][c1] += (degree * -1);
	            map[r2+1][c2+1] += degree;
	     
	        }
	        
	        for (int i = 1; i <board.length; i++){
	            for (int j = 0; j <board[0].length; j++){
	                map[i][j] += map[i-1][j];
	            }
	        }
	            
	        for (int j = 1; j <board[0].length; j++){
	            for (int i = 0; i <board.length; i++){
	                map[i][j] += map[i][j-1];
	            }
	        }
	        
	        for (int i = 0; i < board.length; i++){
	            for (int j = 0; j < board[i].length; j++){
	                if(map[i][j] + board[i][j] > 0) answer++;
	            }
	        }
	      
	        
	        return answer;
	    }
	}
}
