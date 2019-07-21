/*
题目描述
  给定一个字符串和一个词典dict，确定s是否可以根据词典中的词分成
  一个或多个单词。
  比如，给定
  s = "leetcode"
  dict = ["leet", "code"]
  返回true，因为"leetcode"可以被分成"leet code"
比特科技
方法：动态规划
状态：
  子状态：前1，2，3，...,n个字符能否根据词典中的词被成功分词
  F(i): 前i个字符能否根据词典中的词被成功分词
状态递推：
  F(i): true{j <i && F(j) && substr[j+1,i]能在词典中找到} OR false
  在j小于i中，只要能找到一个F(j)为true，并且从j+1到i之间的字符能在词典
  中找到，则F(i)为true
初始值：
  对于初始值无法确定的，可以引入一个不代表实际意义的空状态，作为状态的起始
  空状态的值需要保证状态递推可以正确且顺利的进行，到底取什么值可以通过简单
  的例子进行验证
  F(0) = true
返回结果：F(n)
*/


import java.util.Set;
import java.util.TreeSet;


class Test2{
    public static void main(String[] args) {
        String s = new String("leetcode");
        Set<String> dict = new TreeSet();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s,dict));
    }
        public static boolean wordBreak(String s, Set<String> dict) {
            boolean[] t = new boolean[s.length()+1];
            t[0] = true; //set first to be true, why?
            //Because we need initial state

            for(int i=0; i<s.length(); i++){
                //should continue from match position
                if(!t[i])
                    continue;

                for(String a: dict){
                    int len = a.length();
                    int end = i + len;
                    if(end > s.length())
                        continue;

                    if(t[end]) continue;

                    if(s.substring(i, end).equals(a)){
                        t[end] = true;
                    }
                }
            }

            return t[s.length()];
        }
    }
