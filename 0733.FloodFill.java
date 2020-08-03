class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        int oldColor = image[sr][sc];
        dfs(image, newColor, oldColor, sr, sc);
        return image;
    }
    
    public void dfs(int[][] image, int newColor, int oldColor, int sr, int sc){
            if(sr<0 || sr>=image.length || sc<0 || sc >= image[0].length || image[sr][sc] != oldColor){
                return;
            }
            image[sr][sc] = newColor;
            dfs(image,newColor,oldColor,sr-1,sc);
            dfs(image,newColor,oldColor,sr+1,sc);
            dfs(image,newColor,oldColor,sr,sc-1);
            dfs(image,newColor,oldColor,sr,sc+1);
        }
}