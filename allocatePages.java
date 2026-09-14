class allocatePages {

    static boolean isValidAnswer(int arr[], int k, long mid) {

        long page = 0;
        int student = 1;

        for(int i = 0; i < arr.length; i++) {
            if(page + arr[i] <= mid) {
                page += arr[i];
            }
            else {
                student++;
                if(student > k || arr[i] > mid) {
                    return false;
                }
                page = arr[i];
            }
        }
        return true;
    }

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        if(n < k) {
            return -1;
        }

        long s = 0;
        long sum = 0;
        long ans = -1;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
            // Minimum possible answer
            s = Math.max(s, arr[i]);
        }

        // Maximum possible answer
        long e = sum;

        while(s <= e) {
            long mid = s + (e - s) / 2;
            if(isValidAnswer(arr, k, mid)) {
                ans = mid;
                // Try to find a smaller answer
                e = mid - 1;
            }
            else {
                // mid is too small
                s = mid + 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {

        allocatePages obj = new allocatePages();

        int[] arr = {12, 34, 67, 90};
        int k = 2;

        int answer = obj.findPages(arr, k);
        System.out.println("Minimum pages = " + answer);
    }
}