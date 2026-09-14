public class painterProblem {

    static boolean isValidAnswer(int arr[], int k, int mid) {

        int painterCount = 1;
        int painted = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }
            if (painted + arr[i] <= mid) {
                painted += arr[i];
            }
            else {
                painterCount++;
                painted = arr[i];
                if (painterCount > k) {
                    return false;
                }
            }
        }
        return true;
    }

    public int painterBoards(int[] arr, int k) {

        int n = arr.length;
        int s = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            e += arr[i];
        }
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        painterProblem obj = new painterProblem();
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        int answer = obj.painterBoards(arr, k);

        System.out.println("Minimum = " + answer);
    }
}