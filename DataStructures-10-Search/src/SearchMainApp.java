public class SearchMainApp {
    public static void main(String[] args) {
        int[] myArr=new int[]{1,2,3,4,5,6,89,100,110,111,112};
        System.out.println("Linear search, index = "+MyLinearSearch.linearSearch(myArr, 112));
        System.out.println("Binary search, index = "+MyBinarySearch.binarySearch(myArr, 112));
        System.out.println("Binary search,Iteration,  index = "+MyBinarySearchIterative.binarySearchIterative(myArr,
                112));
        System.out.println("Ternary search, index = "+MyTernarySearch.ternarySearch(myArr, 112));

        System.out.println("Jump search, index = "+MyJumpSearch.jumpSearch(myArr, 112));

        System.out.println("Exponential search, index = "+MyExponentialSearch.exponentialSearch(myArr, 112));
    }
}
