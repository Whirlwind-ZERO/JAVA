package ���������㷨����;
/*
 * ��Ŀ����
������:��1��n��n�����ڳ�һ������Ҫ�����ڵ��������ĺ���һ���������磬n=8�ǣ�������Ϊ��

1 2 3 8 5 6 7 4

1 2 5 8 3 4 7 6

1 4 7 6 5 8 3 2

1 6 7 4 3 8 5 2

������Ϊ4

����
n��ֵ��n������15��

���
��ӡ������������������������������������� ��no solution�����������˫���ţ���

������������⣬�����������е�һ��ֵ1��֮��Ϳ���ÿ�δ�2��n��ʼ��̽���������ˣ�ע���ڹ������ų�������������������Ϊ���������ܳ����ظ����������Ϳ����ˣ���Ϊ��Щֵ��ɵ��ǻ����������ж�ͷβ֮���Ƿ�Ϊ������


 * */
import java.util.Scanner;
public class case��dfs������ {
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        res[0] = 1;//Ĭ�ϵ�һ��Ϊ1
        dfs(res,n,1);
        if(cnt==0) {
            System.out.println("no solution!");
        }else {
            System.out.println(cnt);
        }
    }
    
    /**
     *
     * @param r ������
     * @param n �����ĸ���
     * @param k ��ǰ����
     */
    static void dfs(int[] r,int n,int k) {
        if(k == n && isSu(r[0]+r[k-1])) {
            printRes(r);
            cnt++;
            return;
        }
        for(int i=2;i<=n;i++) {
            if(check(r,k,i)) {
                r[k] = i;
                dfs(r,n,k+1);
                r[k] = 0;//��ʡ�Ի���
            }
        }
    }
    
    //��ӡ������
    private static void printRes(int[] r) {
        for(int i=0;i<r.length;i++) {
            System.out.print(r[i]+"  ");
        }
        System.out.println();
    }
    /**
     *
     * @param r �洢����
     * @param k ��ǰ��������
     * @param i �Ƿ�������ֵ
     * @return
     */
    private static boolean check(int[] r,int k,  int i) {
        if(!isSu(r[k-1]+i))return false;//k-1�ǵ�k��������������е�λ��
        for(int j=0;j<k;j++)if(i==r[j])return  false;//ȷ����֮ǰ����û���ظ���
        return true;
    }
    //�ж��Ƿ�Ϊ����
    private static boolean isSu(int i) {
        for(int j=2;j<i;j++) {
            if(i%j == 0) return false;
        }
        return true;
    }
}