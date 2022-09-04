/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fileread;

/**
 *
 * @author ANUJ
 */
import java.io.FileReader;
import java.io.BufferedReader;
public class FileRead 
{
 public static void main(String[] args) 
 {
  char array[] = new char[1000];
  System.out.println("Working Directory = " + System.getProperty("user.dir"));
  try
  {
   FileReader file = new FileReader("C:\\Users\\ANUJ\\Documents\\test.txt");
   BufferedReader test = new BufferedReader(file);
   test.read(array);
   System.out.println("Data in the file: ");
   System.out.println(array);
   test.close();
  }
  catch(Exception e)
  {
   e.getStackTrace();  
  }
 }111111111111111111111111111111111111111111111111111111111111111
}

