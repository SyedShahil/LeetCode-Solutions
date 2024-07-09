class Search_in_2dMatrix{
    public boolean find(int arr[],int t){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==t){
                return true;
            }
            else if(arr[mid]<t){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]){
                ans=find(matrix[i],target);
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
