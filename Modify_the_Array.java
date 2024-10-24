
class Modify_the_Array{
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && i<arr.length-1 && arr[i+1]==arr[i]){
                obj.add(arr[i]*2);
                i++;
            }
            else if(arr[i]!=0){
                obj.add(arr[i]);
            }
        }
        
      while(obj.size()<arr.length){
          obj.add(0);
      }
        return obj;
    }
}
