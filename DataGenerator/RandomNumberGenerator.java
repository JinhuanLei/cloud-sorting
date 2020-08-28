import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        try {
            rng.writeDataToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int generateNum() {
        Random rand = new Random();
        return rand.nextInt(Integer.MAX_VALUE);
    }

    private void writeDataToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("dataset1.txt", true), 8192 * 4);
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < 50000000; x++){
            sb.append(generateNum());
            sb.append(" ");
        }
        writer.append(sb.toString());

        writer.close();
    }
}
