class CustomStack{
    int arr[];
    int size;
    int capacity;
    int index;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        size=0;
        capacity=maxSize;
        index=-1;
    }
    
    public void push(int x) {
        if(isFull())return;
        index++;
        size++;
        arr[index]=x;
    }
    
    public int pop() {
        if(isEmpty())return -1;
        int val=arr[index];
        index--;
        size--;
        return val;
    }
    
    public void increment(int k, int val) {
        if(isEmpty())return;
        int num=Math.min(size,k);
        for(int i=0;i<num;i++){
            arr[i]+=val;
        }
    }
    public boolean isFull(){
        if(size==capacity)return true;
        return false;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
