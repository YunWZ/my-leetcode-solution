package jvmspec;

import sun.nio.ch.SelectionKeyImpl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SelectorTest {
    public static void main(String[] args) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put("sfasdfassfs".getBytes());
        byteBuffer.flip();
        System.out.println(byteBuffer.array());
    }
}
