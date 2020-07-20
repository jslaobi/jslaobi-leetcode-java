class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        String direction = "right";

        /*
         * [1, 2, 3, 4], [5, 6, 7, 8], [9,10,11,12]
         */
        while (left <= right && top <= bottom) {
            if (direction == "right") {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                direction = "down";
            } else if (direction == "down") {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                direction = "left";
            } else if (direction == "left") {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                direction = "top";
            } else if (direction == "top") {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                direction = "right";
            }
        }
        return result;
    }
}