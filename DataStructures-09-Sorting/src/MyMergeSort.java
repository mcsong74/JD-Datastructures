public class MyMergeSort {
    public static void mergeSort(int[] array){
        if(array.length<2) return; //termination criteria
        int mid=array.length/2; //calculate middle value

        int [] leftArray=new int[mid]; //creating new array for left part
        for(int i=0; i<mid; i++){
            leftArray[i]=array[i];
        }

        int [] rightArray=new int[array.length-mid];
        for(int i=mid; i<array.length; i++){
            rightArray[i-mid]=array[i];
        }

        mergeSort(leftArray); // call merge sort recursively for left
        mergeSort(rightArray); // call merge sort recursively for right

        mergeArray(leftArray, rightArray, array);

    }

    private static void mergeArray(int[] left, int[] right, int[] result){
        int leftIndex=0, rightIndex=0, resultIndex=0;
        while(leftIndex<left.length && rightIndex < right.length){
            if(left[leftIndex]<=right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
                //resultIndex++; leftIndex++;
            }else{
                result[resultIndex++]=right[rightIndex++];
                //resultindex++; rightIndex++;
            }
        }
        while(leftIndex<left.length) {
            result[resultIndex++]=left[leftIndex++];
        }
        while (rightIndex<right.length) {
            result[resultIndex++]=right[rightIndex++];
        }
    }

}
