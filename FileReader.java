import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args){
        int count = 0;
        String toFind = "brycked";
        File myfile = new File("/Users/caleb/Desktop/script.txt");
        try{
            Scanner myreader = new Scanner(myfile);
            while(myreader.hasNextLine()){
                String line = myreader.nextLine().toLowerCase();
                if(line.contains(toFind)){
                    int lindex = line.indexOf(toFind);
                    if(!Character.isLetterOrDigit(line.charAt(lindex - 1)) && !Character.isLetterOrDigit(line.charAt(lindex+toFind.length()))){
                        System.out.println("line with alphabet "+line);
                        count++;
                    }
                    System.out.println("----CURRENT LINE TO COUNT--- \n"+line);
                    System.out.println("the index of apple is " + lindex);
                }

            }
            myreader.close();
            System.out.println(count);

        } catch(FileNotFoundException e){
            System.out.println("Some error has occured " + e);
        }

    }
}
