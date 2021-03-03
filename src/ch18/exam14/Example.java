package ch18.exam14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) {

      String filePath ="C:/YewonProjects/java/src/ch18/exam14/data.txt";
      InputStream is;
      try {
         is = new FileInputStream(filePath);
         Scanner scanner  = new Scanner(is);
         int count=1;
         while(true) {
            try {
               String data= scanner.nextLine();
               System.out.println(count + ": "+data);
               count++;
            }catch(NoSuchElementException e) {
               break;
            }
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }


   }

}