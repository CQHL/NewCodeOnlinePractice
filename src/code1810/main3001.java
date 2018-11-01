package code1810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//牛客网编程：句子反转
public class main3001{
    public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = buff.readLine().toString().split(" ");
        for(int i = str.length; i > 0; i--){
            System.out.print(changeStr(str[i-1]));
            if(i != 1){
                System.out.print(" ");
            }
        }
    }
    public static String changeStr(String oldStr){
        StringBuffer str = new StringBuffer();
        for(int i = oldStr.length() ; i > 0; i--){
            str.append(oldStr.charAt(i-1));
        }
        return str.toString();
    }
}