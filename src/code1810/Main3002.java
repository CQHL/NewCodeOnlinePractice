package code1810;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//牛客网编程：电话号码分身
public class Main3002 {
	public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buff.readLine().toString());
        int[] count = new int[10];//记录个数
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < t; i++){
        	bf = new StringBuffer();
        	count = new int[10];
        	String str = buff.readLine().toString();
        	count[2] = chNum('Z',str);
        	count[4] = chNum('W',str);
        	count[6] = chNum('U',str);
        	count[8] = chNum('X',str);
        	count[0] = chNum('G',str);
        	count[5] = chNum('H',str)-count[0];
        	count[7] = chNum('F',str)-count[6];
        	count[9] = chNum('S',str)-count[8];
        	count[1] = chNum('I',str)-count[7]-count[8]-count[0];
        	count[3] = chNum('N',str)-count[9]-2*count[1];
        	
        	for(int m =0; m < 10;m++){
        		for(int n =0; n < count[m];n++){
        			bf.append(""+m);
        		}
        	}
        	System.out.println(bf.toString());
        }
    }
	public static int chNum(char ch,String str){
		int index=0,count = 0;
		while((index = str.indexOf(ch)) != -1){
			str = str.substring(index+1);
			count++;
	     }
		return count;
	}
}
