class Divide_Players_Into_Teams_of_Equal_Skill
{
    public long dividePlayers(int[] skill) {
        if(skill.length==2)return skill[0]*skill[1];
        HashMap<Integer,Integer> obj=new HashMap<>();
        int sum=0;
        for(int i=0;i<skill.length;i++){
            sum+=skill[i];
            obj.put(skill[i],obj.getOrDefault(skill[i],0)+1);
        }
        long ans=0;
        int n=skill.length;
        int group=n/2;
        int target=sum/group;
        for(int i=0;i<skill.length;i++){
            if(obj.get(skill[i])==0){
                continue;
            }
            else {
                int temp=target-skill[i];
                if(obj.containsKey(temp) && obj.get(temp)>0){
                    obj.put(skill[i],obj.get(skill[i])-1);
                    obj.put(temp,obj.get(temp)-1);
                    ans+=((long)skill[i]*temp);
                }
                else{
                    return -1;
                }
            }
        }
        return ans;
    }
}
