package code1810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//牛客网编程：水仙花
public class Main3003 {
	public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = buff.readLine().toString().split(" ");
        int m = Integer.parseInt( str[0]);
        int n = Integer.parseInt( str[1]);
        boolean have = false;
        for(int i = m; i <= n; i++){
        	if(i == ((int) Math.pow(i/100, 3)
        			+(int) Math.pow((i%100)/10, 3))
        			+(int) Math.pow(i%10, 3)){
        		if(have){
        			System.out.print(" ");
        		}
        		have = true;
        		System.out.print(i);
        	}
        }
        if(!have){
        	System.out.println("no");
        }
	}
}
