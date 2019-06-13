春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。

给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。

若没有金额超过总数的一半，返回0。
测试样例：
[1,2,3,2,2],5
返回：2


import java.util.*;
public class Gift {
    public int getValue(int[] gifts, int n) {
        if(gifts.length<n) return 0;
        if(gifts.length==0) return 0;
        int count=0,temp=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                temp=gifts[i];
                count=1;
            }
            else{
                if(temp==gifts[i])
                    count++;
                else
                    count--;
            }
        }
        int size=0;
        for(int i=0;i<n;i++){
            if(temp==gifts[i])
                size++;
        }
        return (size>n/2)?temp:0;
    }
}
