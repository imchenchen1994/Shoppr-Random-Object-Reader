import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import Evaluator.Evaluator;



public class main {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        
        //Initialize the evaluator
        Evaluator evaluator = new Evaluator();
        BufferedReader br;
        
        String alphanumeric = "alphanumeric";
        String alphabetical = "alphabetical strings";
        String realNumber =  "real numbers";
        String integer = "integer";

        int realNumberCount = 0;
        int alphanumericsCount = 0;
        int alphabeticalCount = 0;
        int integerCount = 0;
        
        try {
            br = new BufferedReader(new FileReader("output"));
            Scanner sc = new Scanner(br);
            //seperate each token with comma
            sc.useDelimiter(", ");

            while (sc.hasNext()) {
              String line = sc.next();
              switch(evaluator.evaluate(line.trim())){
              case 1  : integerCount++;
                        System.out.println(line.trim() + " - " + integer);
                          break;
              case 2  :  alphabeticalCount++;
                         System.out.println(line.trim() + " - " + alphabetical);
                          break;
              case 3  :  alphanumericsCount++;
                          System.out.println(line.trim() + " - " + alphanumeric);
                          break;
              case 4  : realNumberCount++;
                          System.out.println(line.trim() + " - " + realNumber);
                          break;
              }

            }
            

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }      
        System.out.println("Total " + integerCount + " integers read");
        System.out.println("Total " + alphabeticalCount + " alphabetical read");
        System.out.println("Total " + alphanumericsCount + " alphanumerics read");
        System.out.println("Total " + realNumberCount + " real number read");
       
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time used: " + totalTime + " ms");
        
    }
}
