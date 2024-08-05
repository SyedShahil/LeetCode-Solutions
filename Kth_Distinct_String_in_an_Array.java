class Kth_Distinct_String_in_an_Array{
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> obj=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            obj.put(arr[i],obj.getOrDefault(arr[i],0)+1);
        }
        for(String str:arr){
            if(obj.get(str)==1){
                k--;
            }
            if(k==0){
                return str;
            }
        }
        return "";
    }
}
