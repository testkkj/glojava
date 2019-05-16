package example.chap19_05_02;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelReadExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		for (int i = 0; i < 10; i++) {
			Path path = Paths.get("C:/Temp/file" + i + ".txt");
			Files.createDirectories(path.getParent());

			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path,
					EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE), executorService);

			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode("¾È³çÇÏ¼¼¿ä");

			class Attachment {
				Path path;
				AsynchronousFileChannel fileChannel;
			}
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;

			CompletionHandler<Integer, Attachment> completionHandler = new CompletionHandler<Integer, Attachment>() {

				@Override
				public void completed(Integer result, Attachment attachment) {
					System.out.println(attachment.path.getFileName() + ":" + result + "byte written: "
							+ Thread.currentThread().getName());
					try {
						attachment.fileChannel.close();
					} catch (Exception e) {

					}

				}

				@Override
				public void failed(Throwable exc, Attachment attachment) {
					exc.printStackTrace();
					try {
						attachment.fileChannel.close();
					} catch (Exception e) {

					}

				}

			};
			fileChannel.write(byteBuffer, 0, attachment, completionHandler);
		}
		Thread.sleep(1000);
		executorService.shutdown();

	}

}
