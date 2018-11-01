package code1810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//牛客网编程：袋鼠过河
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
        //反着推算 会比较合理
        for(int i = len-1; i >= 0; i--){
        	int jump = num[i];
        	for(; jump>0; jump--){
        		if(i+jump>=len){//一步能跳到对面
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
