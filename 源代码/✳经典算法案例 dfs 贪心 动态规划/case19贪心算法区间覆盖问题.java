package ���������㷨����;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

/*
 * 1��������ȫ��������
��������������һ������Ϊm�����䣬�ٸ���n���߶ε������յ㣨ע�������Ǳ����䣩��������ʹ�ö������߶ο��Խ�����������ȫ����

������

���䳤��8����ѡ�ĸ����߶�[2,6],[1,4],[3,6],[3,7],[6,8],[2,4],[3,5]

�������:

1��ÿһ�����䰴����˵����˳�����У��������Ϊ[1,4]��[2,4]��[2,6]��[3,5]��[3,6]��[3,7]��[6,8]

2����һ��������ʾ�Ѿ����ǵ���������ʣ�µ��߶����ҳ�������˵�С�ڵ��ڵ�ǰ�Ѿ����ǵ���������Ҷ˵���߶��У��Ҷ˵������߶��ڼ��룬ֱ���Ѿ�����ȫ��������

3����:

�����һ������[1,4]����ô��һ���ܹ�ѡ�����[2,6]��[3,5]��[3,6]��[3,7]������7���������һ��ѡ��[3,7]�����һ��ֻ��ѡ��[6,8]�����ʱ��պôﵽ��8�˳�����ѡ����Ϊ3

4̰��֤��:

��Ҫ���ٵ��߶ν��и��ǣ���ôѡȡ���߶α�ȻҪ�����������Ѿ����ǵ�������֮ǰ�ĵط��Ѿ�����ν�ˣ��������������еĿ��Ը��ǵ���˵㶼���Ѿ����ǵ��ĵط�������ô�����ܹ�ʹ���߶θ��ɵ����Ҷ˵㣬��˵�û��̫������壬����ѡ���Ҷ˵�������
 * */
public class case19̰���㷨���串������ {
/*
 * ���⣺��nͷţ�����Ƕ���һ������ʱ�������s��e������һ���ܵĹ���ʱ��t����������Ҫ����ͷţ���ܸ��Ǵ�1��t�Ĺ���ʱ��
 * */
	
	private static class Job implements Comparable<Job>{
		int s;
		int t;
		public Job(int s,int t) {
			this.s=s;
			this.t=t;
		}
		
		@Override
		public int compareTo(Job other) {
			int x=this.s-other.s;
			if(x==0)
				return this.t-other.t;
			else
				return x;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		Job[] jobs=new Job[N];
		for(int i=0;i<N;i++) {
			jobs[i]=new Job(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(jobs);
		int start=1;
		int end=1;
		int ans=1;
		for(int i=0;i<N;i++) {
			int s=jobs[i].s;
			int t=jobs[i].t;
			if(i==0&&s>1)break;
			if(s<=start) {
				end=Math.max(t,end);
			}
			else {
				ans++;
				start=end+1;
				if(s<=start) {
					end=Math.max(t, end);
				}
				else {
					break;
				}
			}
			if(end>=T) {
				break;
			}
		}
		

	}

}
