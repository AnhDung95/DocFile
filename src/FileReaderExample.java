import java.io.FileReader;
//được sử dụng để đọc dữ liệu từ file. Nó trả về dữ liệu theo định dạng byte
//khong luu tru trong bo nho dem => cham hon

public class FileReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("data.txt");
        int i;
        while ((i = fr.read()) != -1) {
//        được sử dụng để trả về một ký tự trong mẫu ASCII. Nó trả về -1 vào cuối tập tin.
            System.out.print((char) i);
        }
        fr.close();
    }
}
