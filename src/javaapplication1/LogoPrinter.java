package javaapplication1;



public class LogoPrinter {
    
    // Constructer, takes the size of the logo
    // Sets values to X,Y and size variables
    LogoPrinter(int size) {
        this.size = size;
    setX();
    setY();
    setPoints();
    }
    
    // Private variables
    private int size;
    private int x;
    private int y;
    private int points[];  // These are a points from where the methods will draw a "reversed V" essentially drawing two Ms
    private int right = 0; // Integer variable used for keeping track of Y wariable as it continuously increases (movers right) on the 2D array.
    
    
    //Getters and setters
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    
    public int getX() {return x;}
    public void setX() {this.x = this.size + 1;} //The 2D vertical length is always equal to the size increased by 1
    
    public int getY() {return y;}
    public void setY() {this.y = this.size * 10;} //The 2D vertical length is always equal to the size multiplied by 10
    
    public int getRight() {return right;}
    public void setRight(int size) {this.right = size;}
    
    public void setPoints() {
        points = new int[]{0, size * 2, size * 5, size * 7}; // The "reversed Vs" always start from these points
    }
    
    // A simple method which fill the 2D array with "-"
    private void fillArray(int x, int y, char [][] array) {
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < y; j++) {
              array[i][j] = '-';
          }
      }
    }
    
    // A method which traveles diagonally upwards on the 2D array 
    // The method starts from a certain point, and fills the next horizontal n (wherer n = size) spaces with *
    // Once the n verticle spaces are filed the method moves to the next diagonal space above it and does the same
    // The method stops when it reahes the top of the 2D array
    private void drawUpward(int [] points, int k, int size, char [][] arr) {
         setRight(points[k]);
      for (int i = size; i >= 0; i--) {
          arr[i][getRight()] = '*';
          for (int j = getRight(); j < getRight() + size; j++) {
              arr[i][j] = '*';
          }
         setRight(getRight() + 1);
      }
    }
    
    // A method which traveles diagonally downwards on the 2D array 
    // The method starts from a certain point, and fills the next horizontal n (wherer n = size) spaces with *
    // Once the n verticle spaces are filed the method moves to the next diagonal space below it and does the same
    // The method stops when it reahes the top of the 2D array
    private void drawDownward(int [] points, int k, int size, char [][] arr) {
       setRight(points[k] + size);
      for (int i = 0; i <= size; i++) {
          arr[i][getRight()] = '*';
          for (int j = getRight(); j < getRight() + size; j++) {
              arr[i][j] = '*';
          }
         setRight(getRight() + 1);
      }
    }
    
    // A method which outputs the 2D array
    private void displayArray(int x, int y, char [][] array) {
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < y; j++) {
              System.out.print(array[i][j]);
          }
          System.out.println();
      }
    }
    
    // A public method which combines the previous 
    public void printLogo() {
        char[][] arr = new char[this.x][this.y];
      fillArray(this.x, this.y, arr);
      // this loop iterats through the 4 points and draws upwards and downwards for each of them and displays the logo at the end
      for (int k = 0; k < 4; k++) {
        drawUpward(points, k, size, arr);
        drawDownward(points ,k, size, arr); 
    }
      displayArray(this.x, this.y, arr);
    }
}
