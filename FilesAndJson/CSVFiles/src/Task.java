import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("/Users/genolewis/Advanced OOP Concepts/resources/iris.data");
    }

    public Database readCSV(String filename) {
        String contents = "";

        try (InputStream in = new FileInputStream(filename)) {

            byte[] buffer = new byte[1024];
            int lengthRead;

            while ( (lengthRead = in.read(buffer)) != -1) {
                String temp = new String(buffer, 0, lengthRead);
                contents = contents + temp;
            }
        }
            catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
            return new Database( contents );

        }
    }



