class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // Edge case: no need to fill
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {

        // Boundary check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) {
            return;
        }

        // Stop if color doesn't match
        if (image[r][c] != originalColor) {
            return;
        }

        // Fill the pixel
        image[r][c] = newColor;

        // Visit neighbors (4 directions)
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r, c + 1, originalColor, newColor); // right
        dfs(image, r, c - 1, originalColor, newColor); // left
    }
}
  