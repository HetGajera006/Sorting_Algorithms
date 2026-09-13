public class findPivotIndex {
    // index where array devide into two parts -> 1) accending L1 and 2) accendign L2.
    
    public int index(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int pivotIndex = -1;

        if(nums[s] < nums[e]){
            return -1;
        }

        while (s<=e) {
            int mid = s + (e-s)/2;

            if(nums[mid] <= nums[n-1]){
                e = mid - 1;
            }
            else{
                pivotIndex = mid;
                s = mid + 1;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args) {
        findPivotIndex p = new findPivotIndex();
        int array[] = {50,60,70,10,20,30,40};
        int ans = p.index(array);

        System.out.println(ans);
    }
}
