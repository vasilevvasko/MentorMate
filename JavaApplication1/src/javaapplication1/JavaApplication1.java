// NOTE:
// Code will be optimized and comented in the following days
// Run with input 50 Lube :D


package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner( System.in );
      int size;
      
      size = scanner.nextInt();
      
      int arrX = size + 1;
      int arrY = size * 10;
      int right;
      
      int points[] = {0, size * 2,size * 5, size * 7};

      
      char[][] arr = new char[arrX][arrY];
      
      for (int i = 0; i < arrX; i++) {
          for (int j = 0; j < arrY; j++) {
              arr[i][j] = '-';
          }
      }
      
      for (int k = 0; k < 4; k++) {
      right = points[k];
      for (int i = size; i >= 0; i--) {
          arr[i][right] = '*'; // 3 0, 2 1, 1 2, 0 3
          for (int j = right; j < right + size; j++) {
              arr[i][j] = '*';
          }
          right++;
      }
      
      right = points[k] + size;
      for (int i = 0; i <= size; i++) {
          arr[i][right] = '*';
          for (int j = right; j < right + size; j++) {
              arr[i][j] = '*';
          }
          right++;
      }
      
    }
      for (int i = 0; i < arrX; i++) {
          for (int j = 0; j < arrY; j++) {
              System.out.print(arr[i][j]);
          }
          System.out.println();
      }
      
    }
}
