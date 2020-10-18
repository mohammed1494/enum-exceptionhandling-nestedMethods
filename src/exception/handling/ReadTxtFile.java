package exception.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile {
    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\Mohammed Ali\\IdeaProjects\\Project61015\\testAD.txt";
        FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader(fileLocation);
        br = new BufferedReader(fr);
        String data = "";
        while ((data= br.readLine()) != null){
            System.out.println(data);
        }


    }
}
