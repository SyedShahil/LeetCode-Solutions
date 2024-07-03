#include<stdio.h>
int main(){
int arr[]={8,7,1,3,2,6,10};
int n=7;
/*
for(int i=0;i<n-1;i++){
	int min=i;
	for(int j=i+1;j<n;j++){
		if(arr[min]>=arr[j]){
			min=j;
		}
	}
	if(min==i){
		continue;
	}
	else{
	int temp=arr[min];
	arr[min]=arr[i];
	arr[i]=temp;
	}
	
}
*/
int i=0;
int j=0;
while(i<n-1){
	int min=i;
	while(j<n){
		if(arr[min]>arr[j]){
			min=j;
		}
		j++;
	}
	int temp=arr[min];
	arr[min]=arr[i];
	arr[i]=temp;
	
	i++;
}
for(int k=0;k<n;k++){
printf("%d",arr[k]);
}
}
