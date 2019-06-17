import  java.util.*;
class Test{
    public static void main(String[] args) {
        int arr[] = {1,3,4,656,7767,45,454,37,87,91,5};
        adjust(arr);
    }
 public static int[] adjust(int[] arr){

     int[] res = new int[arr.length];
     ArrayList<Integer> arrayList_ji = new ArrayList<>();
     ArrayList<Integer> arrayList_ou = new ArrayList<>();
     for(int i = 0;i < res.length;i++){
         if(arr[i]%2==1){
             arrayList_ji.add(arr[i]);
         }
         else {
             arrayList_ou.add(arr[i]);
         }
     }

    Collections.sort(arrayList_ou);
     Collections.sort(arrayList_ji, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
             if(o1<o2){
                 return 1;
             }
             if(o1>o2){
                 return -1;
             }
             return 0;
         }
     });
     for(int i = 0;i<arrayList_ji.size();i++){
         res[i]=arrayList_ji.get(i);
     }
     for(int i = 0;i<arrayList_ou.size();i++){
         res[i+arrayList_ji.size()]=arrayList_ou.get(i);
     }
     for (int i : res){
         System.out.print(i+" ");
     }

     return res;

 }
}
