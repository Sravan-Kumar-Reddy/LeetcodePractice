package leet.code.Problems.Arrays.medium;

public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int[][] response = new int[n][n];
        int counter = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int rows = n;
        int cols = n;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                response[top][i] = counter++;
//                counter++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                response[i][right] = counter++;
//                counter++;
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--) {
                    response[bottom][i] = counter++;
//                    counter++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    response[i][left] = counter++;
//                    counter++;
                }
                left++;
            }
        }

        return response;
    }

    public static void main(String[] args) {
        SpiralMatrix2 matrix2 = new SpiralMatrix2();
        matrix2.generateMatrix(3);
    }
}
