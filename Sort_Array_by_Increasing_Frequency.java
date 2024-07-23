class Sort_Array_by_Increasing_Frequency{
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int ele:nums){
          obj.put(ele,obj.getOrDefault(ele,0)+1);
        }
        Integer[] numsobj=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            numsobj[i]=nums[i];
        }
        Arrays.sort(numsobj,(a,b)->{
            if(obj.get(a).equals(obj.get(b))){
                return Integer.compare(b,a);
            }
            return Integer.compare(obj.get(a),obj.get(b));
        });
        for(int j=0;j<nums.length;j++)
        {
            nums[j]=numsobj[j];
        }
        return nums;
    }
}
