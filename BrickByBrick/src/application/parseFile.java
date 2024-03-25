import java.io.*;

public class parseFile {
    public void readCategory(String filename) {
        String file = filename;
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                // Print for debugging
                for (String index : row) {
                    System.out.printf("%-5s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeCategory(String filename, String category) {
        try {
            //Append to existing file
            FileWriter writer = new FileWriter(filename, true);
            writer.write(category + ",");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
