package javatutorials.ch19.sec04.exam01_file_read_write;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Nekisse_lee on 2017. 8. 1..
 */
public class FileChannerReadExample {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("Temp/file.txt");

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocate(100);

        Charset charset = Charset.defaultCharset();

        String data = "";
        int byteCount;

        while (true){
            byteCount = fileChannel.read(byteBuffer);
            if (byteCount == -1 )break;
            byteBuffer.flip();

            data += charset.decode(byteBuffer).toString();
            byteBuffer.clear();
        }

        fileChannel.close();
        System.out.println("file.txt: " + data);

    }
}