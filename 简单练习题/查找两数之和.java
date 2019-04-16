class Test{
    public static void main(String[] args) {
        int[] data=new int[]{1,3,5,9,8,7,4,5,1,6};
        Arrays.find(9,data);
    }
}
class Arrays {
    public static void find(int value, int[] data) {
for(int i=0;i<data.length;i++){
    for(int j=i+1;j<data.length;j++){
        if(data[i]+data[j]==value){
            System.out.println("["+i+","+j+"]");
        }
    }

}
    }
}
