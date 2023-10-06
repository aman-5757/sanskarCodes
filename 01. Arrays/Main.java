public class Main{
    public static void printArray(int [] A){
        for(int ele : A){
            System.out.print(ele + " ");
        }
    }


    public static int maxOfArray(int [] A){
        int max = Integer.MIN_VALUE;        // - infinite
        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

    public static void swap(int [] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    //LC 384: https://leetcode.com/problems/reverse-string/
    public static void reverseArray(int [] A){
        int i = 0;
        int j = A.length-1;
        while(i < j){
            swap(A,i,j);
            i++;
            j--;
        }
        printArray(A);
    }

    public static void reverseArray(int [] A, int left, int right){
        int i = left;
        int j = right;
        while(i < j){
            swap(A,i,j);
            i++;
            j--;
        }
        printArray(A);
    }

    public static int countDigit(int n){
        // n = 12345 : ans -> 5
        //HW: write code here

        return -1;

    }

    //LC: 189: https://leetcode.com/problems/rotate-array/
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;      // k is in the range of n
        
        reverseArray(nums, 0, n-k-1 );
        reverseArray(nums, n-k, n-1 );
        reverseArray(nums, 0, n-1);
    }

    public static void printSubArray(int [] A){
        for(int st = 0; st < A.length; st++){
            for(int end = st; end < A.length; end++){
                //now work for 1 subarray
                for(int k = st; k <= end; k++){
                    System.out.print(A[k] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String [] args){
        // int [] arr = {1,-2,-3,6,3,7,5,-4};
        // int max = maxOfArray(arr);
        // System.out.println(max);

        // reverseArray(arr);

        // int ans = countDigit(12345);
        // System.out.println(ans);

        int [] A = {10,20,30,40};
        printSubArray(A);
    }
}