public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){

        if ( arr.length == 0){

            return -1;
        }

        var max = arr[0];
        var maxIndex = 0;

        for (int i = 0; i < arr.length; i++){

            if ( arr[i] > max ){

                maxIndex = i;
                max = arr[i];
            }
       }

        return max;
    }
}
