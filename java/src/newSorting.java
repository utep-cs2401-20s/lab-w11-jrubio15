public class newSorting {
    public static void main(String [] args) {

    }
    public static void newSorting(int[] x, int s){
        if(s <= 0){
            s = 1;
        }

        if(x.length <= s){
            quickSort(x, 0, x.length - 1);
        }
        else{
            int mid = x.length/2;
            int[] leftX = new int[mid];
            int[] rightX = new int[mid];
            for(int i = 0; i < leftX.length; i++) {
                leftX[i] = x[i];
            }
            for(int i = 0; i < rightX.length; i++) {
                rightX[i] = x[mid++];
            }
            newSorting(leftX, s);
            newSorting(rightX, s);
            merge(x,leftX,rightX);
        }
    }
    public static int split(int arr[], int beg, int end) {
        int pivot = arr[end];
        int i = beg-1;
        for (int j = beg; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
    static void merge(int[] X, int[] leftX, int[] rightX){
        int left = 0;
        int right = 0;
        for(int i = 0; i < X.length; i++){
            if(left < leftX.length && right < rightX.length){
                if(leftX[left] <= rightX[right]){
                    X[i] = leftX[left];
                    left++;
                }
                else{
                    X[i] = rightX[right];
                    right++;
                }
            }
            else if(left < leftX.length){
                X[i] = leftX[left];
                left++;
            }
            else if (right < rightX.length){
                X[i] = rightX[right];
                right++;
            }
        }
    }
    static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = split(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
}