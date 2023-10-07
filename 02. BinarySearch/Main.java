public class Main{
    //HW: https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1
    public static int binarySearch(int [] A, int key){
        int i = 0;
        int j = A.length-1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(A[mid] == key){
                return mid;
            }
            else if(A[mid] > key){
                //search in LEFT direction
                j = mid - 1;
            }
            else{
                //search in RIGHT direction
                i = mid + 1;
            }
        }
        return -1;
    }

    //HW: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    //HW: https://www.geeksforgeeks.org/c-program-multiply-two-matrices/
    //HW: Submit -> https://practice.geeksforgeeks.org/problems/multiply-matrices/1

    public static void main(String [] args){
        int [] A = {1,2,3,4,5,6,7,8};
        int key = 7;
        int ans = binarySearch(A, key);
        System.out.println(ans);
    }
}