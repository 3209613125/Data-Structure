class Test{
    public static void main(String[] args) {
        int[]a=new int[]{9,8,7,6,4,3,2,1,0,55,68,98,12};
        XIER.shellSort(a);
    }
}
 class XIER{
    public static void shellSort(int[] a){
        double gap = a.length;//增量长度
        int dk,sentinel,k;
        while(true){
            gap = (int)Math.ceil(gap/2);//逐渐减小增量长度
            dk = (int)gap;//确定增量长度
            for(int i=0;i<dk;i++){
                //用增量将序列分割，分别进行直接插入排序。随着增量变小为1，最后整体进行直接插入排序
                for(int j=i+dk;j<a.length;j = j+dk){
                    k = j-dk;
                    sentinel = a[j];
                    while(k>=0 && sentinel<a[k]){
                        a[k+dk] = a[k];
                        k = k-dk;
                    }
                    a[k+dk] = sentinel;
                }
            }
            //当dk为1的时候，整体进行直接插入排序
            if(dk==1){
                break;
            }
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
