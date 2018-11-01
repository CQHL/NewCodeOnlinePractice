package code1810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//牛客网编程：求数列的和
public class Main3004 {
	public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = buff.readLine().toString().split(" ");
        int m = Integer.parseInt( str[0]);
        int n = Integer.parseInt( str[1]);
        double num = m;
        double res = m;
        for(int i =1; i < n; i++){
        	num = Math.sqrt(num);
        	res += num;
        }
        	System.out.format("%.2f",res);
	}
}
