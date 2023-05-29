// Flipping an Image
package Arrays;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {
                            {1, 1, 0},
                            {1, 0, 1},
                            {0, 0, 0}
                        };
        image = flipImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(image[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] flipImage(int[][] image) {
        int len = image.length;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < (len + 1) / 2; ++j) {
                int temp = image[i][j];
                image[i][j] = image[i][len - j - 1] ^ 1;
                image[i][len - j - 1] = temp ^ 1;
            }
        }
        return image;
    }
}
