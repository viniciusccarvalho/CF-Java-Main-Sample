package io.pivotal.console;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Vinicius Carvalho
 */
public class Main {
	public static void main(String[] args) {
		int port = Integer.parseInt(System.getenv("PORT"));
		try {
			final ServerSocket serverSocket = new ServerSocket(port);
			new Thread(() -> {
				try {
					serverSocket.accept();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		while(true){
			System.out.println("Echo . . .");
			try {
				Thread.sleep(1000l);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
