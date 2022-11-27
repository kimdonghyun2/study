package 프로그래머스_알고리즘;

import java.util.*;

public class 두큐합같게만들기 {

	class Solution {
		public int solution(int[] queue1, int[] queue2) {
			int answer = 0;

			long queue1Sum = 0;
			long queue2Sum = 0;

			Queue<Long> q1 = new LinkedList<>();
			Queue<Long> q2 = new LinkedList<>();

			int queue1Length = queue1.length;
			int queue2Length = queue2.length;

			for (int i = 0; i < queue1.length; i++) {
				queue1Sum += queue1[i];
				queue2Sum += queue2[i];

				q1.add(Long.valueOf(queue1[i]));
				q2.add(Long.valueOf(queue2[i]));
			}

			while (queue1Sum != queue2Sum) {
				if (queue1Sum > queue2Sum) {
					Long v = q1.poll();
					answer++;
					queue1Sum -= v;
					queue2Sum += v;
					q2.add(v);
				} else {
					Long v = q2.poll();
					answer++;
					queue2Sum -= v;
					queue1Sum += v;
					q1.add(v);
				}
				if (answer > (queue1Length + queue2Length) * 2) //break 조건.. queue1 Length + queue2 Length 만큼만 하면 안됨..
					return -1;
			}

			return answer;
		}
	}
	
}
