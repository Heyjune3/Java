package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static final String IP = "10.100.205.231";
	public static final int PORT = 5001;
	
	// 연결된 서버의 정보를 저장하는 socket
	Socket server;
	
	// 서버로 출력할 스트림
	PrintWriter pw;
	
	// 서버에서 입력받을 스트림
	BufferedReader br;
	
	// console에서 출력할 메세지를 입력받을 스트림
	BufferedReader reader;
	
	// console 에서 입력받는 반복문 탈출 용 flag
	boolean isRun = true;
	
	public ChatClient() {
		try {
			connect();
		} catch (Exception e) {
			System.out.println("서버와 연결이 종료되었습니다.");
			stopClient();
		}
	}
	
	// 서버와 연결
	public void connect() throws Exception{
		System.out.println("*******  클라이언트 *******");
		System.out.println("연결요청 : "+IP+":"+PORT);
		server = new Socket(IP,PORT);
		String serverIP = server.getInetAddress().getHostAddress();
		System.out.println("연결 성공 : " + serverIP);
		
		// 입출력 스트림 초기화
		
		// 1. console에서 문자열 입력받을 스트림
		InputStream is = System.in;
		InputStreamReader reader = new InputStreamReader(is);
		this.reader = new BufferedReader(reader);
		
		// 2. server에서 출력된 내용을 읽어들일 입력 스트림
		InputStream sis = server.getInputStream();
		InputStreamReader sisr = new InputStreamReader(sis);
		this.br = new BufferedReader(sisr);
		
		// 3. server에 메세지를 출력할 스트림
		OutputStream os = server.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		this.pw = new PrintWriter(osw,true);
		
		// 서버에서 전달된 데이터를 수신 대기 및 처리
		receive();
		
		System.out.println("사용할 이름(아이디)를 입력해 주세요.");
		while(true) {
			String sendData;
			// console에서 사용자가 서버에 전달할 메세지를 입력받음
			sendData = this.reader.readLine();
			// 입력받은 메세지를 서버에 출력
			pw.println(sendData);		
		}
		
	}
	
	// 메세지 수신
	public void receive() {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					String receiveData;
					try {
						if((receiveData = br.readLine()) != null) {
							System.out.println(receiveData);
						}
					} catch (IOException e) {
						System.out.println("서버 통신 오류 : " + e.getMessage());
						stopClient();
						break;
					}
				} // end while
				System.out.println("스레드 종료");
			} // end run
		}); // end Thread
		t.start();
	}
	
	// server와 연결 종료및 자원 해제
	public void stopClient() {
		if(server != null && !server.isClosed()){
			try {
				server.close();
				System.out.println("client 종료");
			} catch (IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}

}










