 //检查两棵树是否是相同的，如果两棵树结构相同，并且在结点上的值相同，那么这两棵树是相同返回true
     public  boolean isSameTree(TreeNode p,TreeNode q){
         if((p==null&&q!=null)||(p!=null&&q==null)){
    return false;


         }
         if(p==null && q==null){
             return  true;

         }
         if(p.value!=q.value){
             return  false;
         }
         return isSameTree(p.left,q.left)&&isSameTree(p.right,q.left)
     }


     //检查是否为子树
     private boolean isSubTree(TreeNode s,TreeNode t){
         if(s==null||t==null){
             return  false;
         }
         if(isSameTree(s,t)){
             return true;
         }
         else if (isSubTree(s.left,t)){
             return  true;
             
         }
         else if(isSubTree(s.right,t)){
             return true;
         }
         else{
             return false;
         }
     }
     
