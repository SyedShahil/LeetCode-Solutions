class Median_of_Two_Sorted_Arrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int cnt=0;
        int n=(n1+n2);
        int indx1=n/2;
        int indx2=n/2-1;
        int indele1=-1;
        int indele2=-1;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(cnt==indx1){
                    indele1=nums1[i];
                }
                if(cnt==indx2){
                    indele2=nums1[i];
                }
                i++;
                cnt++;
            }
            else{
                if(cnt==indx1){
                    indele1=nums2[j];
                }
                if(cnt==indx2){
                    indele2=nums2[j];
                }
                j++;
                cnt++;
            }
        }
        while(i<n1){
                if(cnt==indx1){
                    indele1=nums1[i];
                }
                if(cnt==indx2){
                    indele2=nums1[i];
                }
                i++;
                cnt++;
              
        }
        while(j<n2){
                if(cnt==indx1){
                    indele1=nums2[j];
                }
                if(cnt==indx2){
                    indele2=nums2[j];
                }
                j++;
                cnt++; 
            }
        if(n%2==1){
            return (double)indele1;
        }
        else{
            return (((double)indele1+(double)indele2)/2);
        }
        
    }
}
