import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Cách này đọc được dữ liệu dưới dạng Unicode

public class ReadFileWithScanner {
    public static void main(String[] args) {

        File text = new File("data.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(text);
            // đọc file theo dòng
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không có file");
        }
    }
}
