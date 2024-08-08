class Asteroid_Collision{
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                obj.add(asteroids[i]);
            }
            else{
            while(!obj.isEmpty() && obj.get(obj.size()-1)>0 && obj.get(obj.size()-1)<Math.abs(asteroids[i])){
                obj.remove(obj.size()-1);
            }
                  if(!obj.isEmpty() && obj.get(obj.size()-1)>0 && Math.abs(asteroids[i])==obj.get(obj.size()-1)){
                obj.remove(obj.size()-1);
            }
             else if(obj.isEmpty() || obj.get(obj.size()-1)<0){
                obj.add(asteroids[i]);
            }
            }
           
        }
        int ans[]=new int[obj.size()];
        for(int i=0;i<obj.size();i++){
            ans[i]=obj.get(i);
        }
        return ans;          
    }
}
