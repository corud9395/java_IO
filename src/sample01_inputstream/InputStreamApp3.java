package sample01_inputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamApp3 {
	
	public static void main(String[] args) throws IOException {
		
		String path = "https://ticketimage.interpark.com/Play/image/large/23/23003674_p.gif";
		String dest = "src/sample01_inputstream/suyoung.gif";
		
		URL url = new URL(path); 
		InputStream in = url.openStream(); // url = 자원의 위치에 파이프 연결(읽어오려고) -> 그래서 InputStream 
		FileOutputStream out = new FileOutputStream(dest);
		
		byte[] buf = new byte[1024];
		int length = 0;
		while((length = in.read(buf)) != -1) {
			out.write(buf,0, length);
		}
		
		out.close();
		
		// url만 알면 다 가져올 수 있다. 
		// intputstream, outputstream로 원격으로 내가 url만 알면 다 가져올 수 있다. 
		// 코딩은 path,dest의 값만 다를 뿐 나머지는 똑같기 때문에 util로 있다. 
		
	}

}
