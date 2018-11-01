package code1810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//ţ������̣��������
public class Main3005 {
	public static final int MAX = 999;
	public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( buff.readLine().toString());
        String[] str = buff.readLine().toString().split(" ");
        int len = str.length;
        int[] num = new int[len];
        int[] time = new int[len];
        for(int i =0; i < len; i++){
        	num[i] = Integer.parseInt(str[i]);
        	time[i] = MAX;
        }
        //�������� ��ȽϺ���
        for(int i = len-1; i >= 0; i--){
        	int jump = num[i];
        	for(; jump>0; jump--){
        		if(i+jump>=len){//һ������������
        			time[i]=1;
        			break;
        		}else{
        			time[i] = time[i]<time[i+jump]+1?time[i]:time[i+jump]+1;
        		}
        	}
        }
        if(time[0] == MAX){
        	System.out.println("-1");
        }else{
        	System.out.println(time[0]);
        }
	}
}
