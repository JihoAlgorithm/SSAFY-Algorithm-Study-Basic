package study.June.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_16472_����� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		String str = br.readLine();
		int alpha[] = new int[26];
		int s = 0;
		int e = 0;
		int len = str.length();
		int cnt = 0;
		if(N >= len) {
			System.out.println(len);
			return;
		}
		int max = 0;
		while(e < len) {//���ڿ� ������ �� ������
			int idx = str.charAt(e++) - 'a'; //�� �ε��� ���� �����ϸ� ���ĺ��� �ε����� ����
			if(alpha[idx] == 0) cnt++; //���ĺ��� �ε����� ���� 0�̸� ������ ���� ���̹Ƿ� ����(cnt)�� ����
			alpha[idx]++; //����(cnt)�� ������� �ش� ���ĺ��� ��(�� ��)�� ����
			if(cnt > N) { //������ N�� �ʰ��ϸ�
				while(cnt > N) { //������ N�� �ʰ����� ���� �� ����
					int tmp = str.charAt(s++) - 'a'; //���� �ε��� ���� �������Ѱ��鼭 
					alpha[tmp]--; //�ش��ϴ� ���ĺ��� �ε����� ���� ����
					if(alpha[tmp] == 0) cnt--; //�ε����� ���� 0�� �Ǹ� ���̻� �������� �ʴ¾��ĺ��̹Ƿ� �������� ����
				}
			}
			else {
				max = Math.max(max, e - s);//������ N�� �ʰ����� ������ max�� ����
			}
		}
		System.out.println(max);
	}


}
