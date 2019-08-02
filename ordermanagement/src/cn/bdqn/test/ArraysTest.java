package cn.bdqn.test;

public class ArraysTest {

	public static void main(String[] args) {
		byte bt=12;
		
		/*int[] nums={1,3,5,7,9,10,0};
		int index=nums.length-1;
		int number=6;
		//��λ��
		for (int i = 0; i < nums.length; i++) {
			if(number<nums[i]){
				index=i;
				break;
			}
		}
		//��λ��
		for (int i = nums.length-1; i >index; i--) {
			nums[i]=nums[i-1];
		}
		nums[index]=number;
		System.out.println(Arrays.toString(nums));*/
		
		int [] nums=new int[10000];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=i;
		}
		int index=binarySearch(nums,7879,9999);
		System.out.println(index);
	}
	/**
	 * ������������в���һ������Ҫ���ٴ�
	 * @param nums
	 * @param number
	 * @return
	 */

	public static int binarySearch(int[] A, int target, int n){
	    int low = 0, high = n, mid;
	    int count=0;
	    while(low <= high){
	    	count++;
	        mid = low + (high - low) / 2;
	        if(A[mid] == target){
	        	System.out.println("������"+count);
	            return mid;
	        }else if(A[mid] > target){
	            high = mid - 1;
	        }else{
	            low = mid + 1;
	        }
	    }
	    return -1;
	}
}
