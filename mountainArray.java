public class mountainArray {
    public int peakIndexInMountainArray(int[] arr){

        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        int mid;

        while (s <= e) {
            for(int i=0; i<n; i++){
                mid = s + (e-s)/2;
                if(arr[mid] > arr[mid+1]){
                    ans = mid;
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        mountainArray m = new mountainArray();

        int array[] = {1,3,5,4,2};
        int result = m.peakIndexInMountainArray(array);

        System.out.println(result);
    }
}
