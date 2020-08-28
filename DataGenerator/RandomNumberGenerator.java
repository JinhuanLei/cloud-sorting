import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        try {
            rng.writeDataToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeDataToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("tempfile.txt", true), 8192 * 4);
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < 1000; x++){
            sb.append("");
            writer.append(sb.toString());
        }
        writer.close();
    }
}
