package jvmspec.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTest {
    public static void fileVisitor() throws IOException {
        SimpleFileVisitor<Path> myFileVisitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("I'm about to visit the " + dir + " directory");
                FileVisitResult res = FileVisitResult.CONTINUE;
                if ("end".equals(dir.getFileName()))
                    res = FileVisitResult.TERMINATE;

                return res;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("I'm visiting file " + file + " which has size " + attrs.size());
                return FileVisitResult.CONTINUE;
            }
        };
        Path headDir = Paths.get("E:\\Downloads");
        Path path = Files.walkFileTree(headDir, myFileVisitor);
    }

    public static void watchService() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        File file = new File("E:\\Downloads");
        Path path = file.toPath();
        WatchKey register = path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
        while (true) {
            WatchKey take = watchService.take();
            for (WatchEvent<?> event : take.pollEvents()) {
                System.out.println(
                        "An event was found after file creation of kind " + event.kind()
                                + ". The event occurred on file " + event.context() + ".");
            }
            take.reset();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
//        FileTest.fileVisitor();
        FileTest.watchService();
    }
}
