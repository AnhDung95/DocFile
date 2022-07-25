import java.io.BufferedReader;
import java.io.FileReader;

//được sử dụng để đọc dữ liệu từ file. Nó trả về dữ liệu theo định dạng byte (char)
//duoc luu tru trong bo nho dem => doc nhanh hon.

public class BufferedReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
