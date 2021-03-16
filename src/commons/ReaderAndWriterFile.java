package commons;

import models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterFile {
    public void writer(Object object, String path) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data = object.toString();
            File file = new File(path);
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List Reader(String path) {
        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;
        String[] temp;
        List<String[]> listData = new ArrayList<>();
        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
                while ((line = br.readLine()) != null) {
                    temp = line.split(", ");
                    listData.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listData;
    }
}
