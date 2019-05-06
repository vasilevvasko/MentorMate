// NOTE:
// Code will be optimized and comented in the following days
// Run with input 50 Lube :D


package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
      // Create instance of scaner and get the next integer
      Scanner scanner = new Scanner( System.in );
      int size = scanner.nextInt();

      // Create instance of class LogoPrinter and call the printLogo method
      LogoPrinter logoPrinter = new LogoPrinter(size);
      logoPrinter.printLogo();
    }
}