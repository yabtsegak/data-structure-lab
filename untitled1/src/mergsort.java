public class mergsort {
    public static void main(String[] args) {
        int[] nums ={1,8,7,5,4,3};
        mergeSort(nums);

    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 1) {
            return;

        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        int j=0;
        for (int i = 0; i < mid; i++) {
            if (i < mid) {
                left[j] = arr[i];
            }
            else{
                right[j] = arr[i];
                j++;
            }




        }
        mergeSort(left);
        mergeSort(right);
        merg(arr,left,right);
    }
    public static void merg(int[] arr, int[] left, int[] right) {
        int l= 0,r=0,i=0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[i] = left[l];
                i++;
                l++;
            }
            else{
                arr[i] = right[r];
                i++;
                r++;


            }
        }
        while (l < left.length) {
            arr[i] = left[l];
            i++;
            l++;
        }
        while (r < right.length) {
            arr[i] = right[r];
            i++;
            r++;
        }

    }
}
