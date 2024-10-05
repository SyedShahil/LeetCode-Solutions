class Permutation_in_String{
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n)return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<n;i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=m-n;i++){
             Arrays.fill(arr2,0);
            for(int j=0;j<n;j++){
                arr2[s2.charAt(i+j)-'a']++;
            }
            if(isMatched(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
    public boolean isMatched(int map1[],int map2[]){
        for(int i=0;i<map1.length;i++){
            if(map1[i]!=map2[i]){
                return false;
            }
          
        }
        return true;
    }
}
