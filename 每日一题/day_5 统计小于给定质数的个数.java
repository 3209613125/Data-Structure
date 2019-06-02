/*题目：
统计所有小于非负整数 n 的质数的数量。

示例:

输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
*/



class Solution {
    public int countPrimes(int n) {
        //直接上最优解，厄拉多塞筛法
        boolean[] notPrime = new boolean[n];
        int res = 0;
        
        for(int i = 2; i < n; i++){
            if(notPrime[i] == false){
                res++;
                for(int j = 2; i * j < n; j++){
                    notPrime[i * j] = true;
                }
            }
        }
        return res;
    }
}
/**
我们以n = 25为例，浏览一下上面程序的执行过程：
i = 2： notPrime[2]数组初始值为false，res自增1变为1
    j = 2、i = 2 -> i * j = 4 < 25 -> notPrime[4] = true;
    j = 3、i = 2 -> i * j = 6 < 25 -> notPrime[6] = true;
    j = 4、i = 2 -> i * j = 8 < 25 -> notPrime[8] = true;
    j = 5、i = 2 -> i * j = 10 < 25 -> notPrime[10] = true;
    j = 6、i = 2 -> i * j = 12 < 25 -> notPrime[12] = true;
    j = 7、i = 2 -> i * j = 14 < 25 -> notPrime[14] = true;
    j = 8、i = 2 -> i * j = 16 < 25 -> notPrime[16] = true;
    j = 9、i = 2 -> i * j = 18 < 25 -> notPrime[18] = true;
    j = 10、i = 2 -> i * j = 20 < 25 -> notPrime[20] = true;
    j = 11、i = 2 -> i * j = 22 < 25 -> notPrime[22] = true;
    j = 12、i = 2 -> i * j = 24 < 25 -> notPrime[24] = true;
    j = 13、i = 2 -> i * j = 26 > 25 退出内层for循环
    
i = 3：notPrime[3]数组初始值为false，res自增1变为2
    j = 2、i = 3 -> i * j = 6 < 25 -> notPrime[6] = true;
    j = 3、i = 3 -> i * j = 9 < 25 -> notPrime[9] = true;
    j = 4、i = 3 -> i * j = 12 < 25 -> notPrime[12] = true;
    j = 5、i = 3 -> i * j = 15 < 25 -> notPrime[15] = true;
    j = 6、i = 3 -> i * j = 18 < 25 -> notPrime[18] = true;
    j = 7、i = 3 -> i * j = 21 < 25 -> notPrime[21] = true;
    j = 8、i = 3 -> i * j = 24 < 25 -> notPrime[24] = true;
    j = 9、i = 3 -> i * j = 27 > 25 退出内层for循环
 
i = 4：notPrime[4] = true 继续
 
i = 5：notPrime[5]数组初始值为false，res自增1变为3
    j = 2、i = 5 -> i * j = 10 < 25 -> notPrime[10] = true; 
    j = 3、i = 5 -> i * j = 15 < 25 -> notPrime[15] = true; 
    j = 4、i = 5 -> i * j = 20 < 25 -> notPrime[20] = true; 
    j = 5、i = 5 -> i * j = 25 退出内层for循环
 
i = 6：notPrime[6] = true 继续
 
i = 7：notPrime[7]数组初始值为false，res自增1变为4
    j = 2、i = 7 -> i * j = 14 < 25 -> notPrime[14] = true;
    j = 3、i = 7 -> i * j = 21 < 25 -> notPrime[21] = true;
    j = 4、i = 7 -> i * j = 28 > 25 退出内层for循环
    
i = 8：notPrime[6] = true 继续
i = 9：notPrime[9] = true 继续
i = 10：notPrime[10] = true 继续
 
i = 11：notPrime[11] = false，res自增为5
    j = 2、i = 11 -> i * j = 22 < 25 -> notPrime[22] = true;
    j = 3、i = 11 -> i * j = 33 > 25 退出内层for循环
    
i = 12：notPrime[12] = true 继续
 
i = 13：notPrime[13] = false，res自增为6
    j = 2、i = 13 -> i * j = 26 < 25 退出内层for循环
    
i = 14：notPrime[14] = true 继续
 
i = 15：notPrime[15] = true 继续
 
i = 16：notPrime[16] = true 继续
 
i = 17：notPrime[17] = false，res自增为7
    j = 2、i = 17 -> i * j = 34 < 25 退出内层for循环
    
i = 18：notPrime[18] = true 继续
 
i = 19：notPrime[19] = false，res自增为8
    j = 2、i = 19 -> i * j = 38 < 25 退出内层for循环
    
i = 20：notPrime[20] = true 继续
 
i = 21：notPrime[21] = true 继续
 
i = 22：notPrime[22] = true 继续
 
i = 23：notPrime[23] = false，res自增为9
    j = 2、i = 23 -> i * j = 46 < 25 退出内层for循环
 
i = 24：notPrime[24] = true 继续 
 
i = 25退出循环，返回res = 9
**/

