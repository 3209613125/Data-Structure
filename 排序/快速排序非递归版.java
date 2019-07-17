public void quickSort_1(int[] array){
    Stack<Integer> stack = new Stack<>();
    int low = 0;
    int high = array.length-1;
    int par = FindPartion(array,low,high);
    if(par > low+1){
        stack.push(low);
        stack.push(par-1);
    }
    if(par < high-1){
        stack.push(par+1);
        stack.push(high);
    }
    while(!stack.empty()){
        high = stack.pop();
        low = stack.pop();
        par = FindPartion(array,low,high);
        if(par > low+1){
            stack.push(low);
            stack.push(par-1);
        }
        if(par < high-1){
            stack.push(par+1);
            stack.push(high);
        }
    }
  }
}
