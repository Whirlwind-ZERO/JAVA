package ���������㷨����;

import java.util.HashSet;
import java.util.Set;

public class case7���Ӽ� {
	private Set<Set<Integer>> getSubsets3Core(int A[],int n,int cur){
		Set<Set<Integer>> newSet=new HashSet<>();
		if(cur==0) {
			Set<Integer> nil=new HashSet<>();
			Set<Integer> first=new HashSet<>();
			first.add(A[0]);
			newSet.add(nil);
			newSet.add(first);
			return newSet;
		}
		
		Set<Set<Integer>> oldSet=getSubsets3Core(A,n,cur-1);
		for(Set<Integer> set:oldSet) {
			newSet.add(set);//����ԭ��
			Set<Integer> clone=(Set<Integer>)((HashSet) set).clone();//��¡һ���Ӽ�
			clone.add(A[cur]);
			newSet.add(clone);
			}
		return newSet;
	}

}
