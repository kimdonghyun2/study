package ���α׷��ӽ�_�˰���;

import java.util.*;

public class ��ť�հ��Ը���� {

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
				if (answer > (queue1Length + queue2Length) * 2) //break ����.. queue1 Length + queue2 Length ��ŭ�� �ϸ� �ȵ�..
					return -1;
			}

			return answer;
		}
	}
	
}
