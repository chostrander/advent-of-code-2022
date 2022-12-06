import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Day1 {
    
    public static void main(String [] args) {
        System.out.println("Defining file..");
        
        DataFile dataFile = new DataFile();
        File file = dataFile.getFile();

        System.out.println("Does file exists?");
        if (file.exists() ) {
            System.out.println("exists!!");
        } else {
            System.out.println("cannot file file");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            int elfCount = 1;
            Map<Integer, Integer> elfCountMap = new HashMap<>();
            int currentTotal = 0;

            while (line != null) {
                
                if (line.length() == 0) {
                    System.out.println("found new elf");
                    currentTotal = 0;
                    ++elfCount;
                } else {
                    currentTotal += Integer.valueOf(line);
                    System.out.println("line: "+line+ " total : "+ currentTotal + " elf: "+elfCount);
                }
                
                if (elfCount > 5) {
                    break;
                }
                line = reader.readLine();

            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
