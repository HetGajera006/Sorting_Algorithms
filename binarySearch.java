public class binarySearch {
    public int binarySearchAlgo(int[] arr, int target){
        // print the index of target element or if not present than return -1;
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;

        while (start <= end) {
            if(target == arr[mid]){
                return mid;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

            mid = start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {-1,0,3,5,9,12};

        binarySearch search = new binarySearch();

        int ans = search.binarySearchAlgo(array, 2);

        System.out.println(ans);
    }
}
