package cn.exjoy.study.socket;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

@SuppressWarnings("unused")
public class SocketThread extends Thread {

	private Socket socket;

	private InputStream is;

	private OutputStream os;

	private PrintStream ps;

	private DataInputStream ds;

	public SocketThread(Socket s) {
		socket = s;
	}

	@Override
	public void run() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ps = new PrintStream(os);
			ds = new DataInputStream(is);


		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
