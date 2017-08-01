package org.opentutorials.javatutorials.ch19.sec05.exam01_asynchronous_filechanner;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Nekisse_lee on 2017. 8. 1..
 */
public class AsynchronusFileChannelReadExample {
    public static void main(String[] args) throws IOException {
        //스레드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("Temp/file" + i + ".txt");
            //비동기 파일 생성

            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path,
                    EnumSet.of(StandardOpenOption.READ),
                    executorService
            );

            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int) fileChannel.size());

            //첨부객체 생성
            class Attachment{
                Path path;
                AsynchronousFileChannel fileChannel;
                ByteBuffer byteBuffer;
            }

            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;
            attachment.byteBuffer = byteBuffer;

            //CompletionHandler 객체 생성
            CompletionHandler<Integer, Attachment> completionHandler =
                    new CompletionHandler<Integer, Attachment>() {
                        @Override
                        public void completed(Integer result, Attachment attachment) {
                            attachment.byteBuffer.flip();

                            Charset charset = Charset.defaultCharset();
                            String data = charset.decode(attachment.byteBuffer).toString();
                            System.out.println(attachment.path.getFileName() + " : " + data + " : " + Thread.currentThread().getName());

                            try {
                                fileChannel.close();
                            } catch (IOException e) {}
                        };

                        @Override
                        public void failed(Throwable exc, Attachment attachment) {
                            exc.printStackTrace();
                            try {
                                fileChannel.close();
                            } catch (IOException e) {}
                        };
                    };

            //파일 읽기

            fileChannel.read(byteBuffer,0,attachment,completionHandler);
        }
        //스레드풀 종료
        executorService.shutdown();


    }
}
