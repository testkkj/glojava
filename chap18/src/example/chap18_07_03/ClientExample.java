package example.chap18_07_03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("192.168.0.170", 5001));
			System.out.println("[연결성공]");
		} catch (Exception e) {

		}
		if (!socket.isConnected()) {
			try {
				socket.close();
			} catch (IOException e1) {

			}
		}

	}

}
