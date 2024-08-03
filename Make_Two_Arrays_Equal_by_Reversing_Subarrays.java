class Make_Two_Arrays_Equal_by_Reversing_Subarrays{
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int num:target){
            obj.put(num,obj.getOrDefault(num,0)+1);
        }
        for(int i:arr){
        if(!obj.containsKey(i) || obj.get(i)==0){
            return false;
        }
            obj.put(i,obj.get(i)-1);
        }
        return true;
    }
}
