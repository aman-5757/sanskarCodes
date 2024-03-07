public class Main{

    public static void printNto1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);

    }
    public static void print1toN(int n){
        if(n == 0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);

    }

    public static void arrayPrint(int [] A, int idx){
        if(idx == A.length){
            return;
        }
        System.out.print(A[idx] + " ");
        arrayPrint(A, idx+1);
    }


    public static int maxOfArray(int [] A, int idx){
        if(idx == A.length){
            return Integer.MIN_VALUE;
        }
        int recAns = maxOfArray(A, idx + 1);
        return Math.max(A[idx] , recAns);
    }

    public static int sumOfArray(int [] A, int idx){
        if(idx == A.length){
            return 0;
        }
        int recAns = sumOfArray(A, idx + 1);
        return A[idx] + recAns;
    }

    //dry run this for n = 3
    public static void pzz(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);
    }



    public static void main(String [] args){
        // printNto1(5);
        // print1toN(5);
        int [] A = {5,2,1,7,6,4,3};
        // arrayPrint(A, 0);
        System.out.println(maxOfArray(A, 0));
    }
}