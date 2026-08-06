class Solution {
        int m,n,startcolor;
    void DFS(int[][] image,int row, int col, int color){
        if(row>=m || col>=n || row<0 || col<0) return;
        if(image[row][col]!=startcolor) return;
        if(image[row][col] == startcolor){
            image[row][col] = color;
        }
        
        DFS(image, row+1, col, color);
        DFS(image, row-1, col, color);
        DFS(image, row, col-1, color);
        DFS(image, row, col+1, color);
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        startcolor = image[sr][sc];
        m = image.length;
        n = image[0].length;
        if (startcolor == color)
        return image;
        DFS(image, sr, sc, color);
        return image;
    }
}