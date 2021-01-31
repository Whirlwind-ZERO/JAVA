package ���������㷨����;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���룺

n����ʾn�����䣩

������n������ ��ÿ����������

ÿ������Ŀ�ʼʱ�� ����ʱ��  ���е�ĸ���

�����

������Ҫ���ٵ�
������Ŀ�Ĵ�����˼�ǣ�����n�������䣬��������������ϵĵ㶼������������Ҫ����ʹ�����ٵĵ���������Щ���䲢��ÿ������ĸ��ǵĵ���������������Ҫ��㸲�������������

�������룺

����������һ������n������n�����䡣

����������������n��ÿ�еĵ�һ��������������㣬�ڶ��������������յ㣬����������������������Ҫѡȡ�ĵ��������
 * */

public class case18̰���㷨����ѡ�� {

	 /*
		 *˼·��(1)���Ƚ�ÿ������Ŀ�ʼʱ�䡢����ʱ�䡢��Ҫ�����ĵ��װ�ڶ����У������ս���ʱ��������򣨽���ʱ����ͬ�����տ�ʼʱ���������
		 *    (2)���α���ÿһ������
		 *    	      ���Ҹ������Ѵ��ڵĵ�
		 *          ����Ѵ��ڵĵ�==����Ҫ�ĵ㣬�����������һ������
		 *          ����Ѵ��ڵĵ�<����Ҫ�ĵ㣬���������Ϊ�����㣬������������ĵ㣬ֱ��������ĵ�Ϊ0
		 *�ؼ����ж�ĳ�����Ƿ��Ѵ��ڣ�����һ������axs��Ϊ���ᣬ�䷶Χ1~��������������Ľ���ʱ�䣬���λ��i�Ѿ���㣬��axs[i]=1
		 *�������ݣ�
	5
	3 7 3
	8 10 3
	6 8 1
	1 3 1
*/

	private static class Interval implements Comparable<Interval>{
        int s;
        int t;
        int c;

        public Interval(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }

        @Override
        public int compareTo(Interval other) {
            int x = this.t - other.t;
            if(x == 0)
                return this.s - other.s;
            else
                return x;
        }
    }

    /**
     * ͳ��axis��s-t�����Ѿ��ж��ٸ��㱻ѡ��
     */
    private static int sum(int[] axis, int s, int t){
        int sum = 0;
        for(int i = s; i <= t; i++){
            sum += axis[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Interval[] intervals = new Interval[n];
        for(int i = 0; i < n; i++){
            intervals[i] = new Interval(in.nextInt(), in.nextInt(), in.nextInt());
        }
        Arrays.sort(intervals);    //�������Ҷ˵�����

        int max = intervals[n-1].t;    //�Ҷ����ֵ
        int[] axis = new int[max+1];    //��������ϵĵ��Ƿ��Ѿ���ѡ��
        //int[] sums = new int[max+1];
        for(int i = 0; i < n; i++){
            //1.�����������ж��ٸ���
            int s = intervals[i].s; //���
            int t = intervals[i].t; //�յ�
            int cnt = sum(axis, s, t);    //�ҵ���������Ѿ�ѡ���������sum[t]-sum[s-1];��Ч��

            //2.����������������Ҷ˿�ʼ��ǣ�����ǹ��ľ�����
            intervals[i].c -= cnt; //��Ҫ�����ĵ������
            while(intervals[i].c > 0){
                if(axis[t] == 0){ //�������յ㿪ʼѡ��
                    axis[t] = 1;
                    intervals[i].c--;    //��һ��������Ҫ����������
                    t--;
                }else{    //���������Ѿ���ѡ����
                    t--;
                }
            }
        }
        System.out.println(sum(axis, 0, max));
    }

}
