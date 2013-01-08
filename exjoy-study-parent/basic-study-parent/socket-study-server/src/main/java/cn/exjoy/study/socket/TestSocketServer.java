package cn.exjoy.study.socket;

import java.net.ServerSocket;

public class TestSocketServer {

	private static final int PORT = 9999;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(PORT);
			
			while(true){
				new SocketThread(server.accept()).start();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
