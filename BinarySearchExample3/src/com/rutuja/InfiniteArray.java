package com.rutuja;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
	        int target = 10;  // Directly set the target value
	        
	        System.out.println(ans(arr,target));
    
		
		

	}
	static int ans(int[]arr,int target) {
		//find range
		//first start with a box of 2
		int start=0;
		int end=1;
		//condition for target to lie in the range
		while(target>arr[end]) {
			int newStart=end+1;
			//double box value
			end=end+(end-start+1)*2;
			start=newStart;
			
		}
		return binarySearch(arr,target,start,end);
		
		
	}
	static int binarySearch(int[]arr,int target,int start,int end) {
		
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
