public class Rob {
    public static int rob(int[] arr){
        int pre=0;
        int cur=0;//用来记录抢劫到第i个住户的最大抢劫量
        for(int i=0;i<arr.length;i++){
            int next=Math.max(pre+arr[i],cur);
            pre=cur;
            cur=next;
        }
        return cur;
    }
    public static void main(String[] args){
        int[] arr={1,2,6,8,9};
        int[] arr2={1,3,7,5,0};
        System.out.println(rob(arr));//16
        System.out.println(rob(arr2));//8
 
    }
}
