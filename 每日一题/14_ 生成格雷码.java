/**
* @Author: HeHaoYuan
* @Date: 2019/6/2
* @Description:  

*/


//在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同，
// 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
//
//给定一个整数n，请返回n位的格雷码，顺序为从0开始。
//
//测试样例：
//1
//返回：["0","1"]
//测试样例:
//1:0,1
//2:00,01,11,10
//3:000,001,011,010,110,111,101,100


import java.util.*;
class GrayCode {
    public static String[] getGray(int n) {
        String[] resStrs = null;
        if(n == 1){
            resStrs = new String[]{"0","1"};
        }else{
            String[] strs = getGray(n-1);
            resStrs = new String[2*strs.length];
            for(int i=0; i<strs.length; i++){
                resStrs[i] = "0"+strs[i];
                resStrs[resStrs.length-1-i] = "1"+strs[i];
            }
        }
        return resStrs;
    }

    public static void main(String[] args) {
        for(String data : getGray(3)){
            System.out.println(data);

        }
    }
}
