package sample01_inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStreamApp2 {
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * InputStream과 OutputStream
		 * 	- InputStream과 OutputStream은 바이너리 데이터를 읽고 쓰는 Stream이다.// reader나 writer는 할 수 없다고?  
		 * 	- binary data는 그림, 영상, 압축파일, 워드파일, 아래 한글 파일 등이다.
		 * 	- InputStream과 OutputStream은 binary data를 읽어서 분석하는 용도로 사용하기보다는 
		 * 	  binary data 그 자체를 전송(여기에 있는 것을 읽어서 저기에 출력하는 것)하는 것이 목적이다. 
		 * - 예시(binary data를 전송하는 대부분의 작업)
		 * 		1. 파일을 읽어서 다른 곳에 복사하기
		 * 		2. 사용자가 업로드한 파일을 서버에 특정 폴더에 저장하기
		 * 		3. 사용자가 다운로드를 요청한 파일을 읽어서 브라우저로 내려보내기
		 * 
		 * 
		 */
		
		// 원본파일을 읽어서 백업 파일을 생성하기 
		String src = "src/sample01_inputstream/sample.jpg";
		String dest = "src/sample01_inputstream/sample_backup.jpg";
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest); // 기록할 때는 뭐라고...? 없어도 상관 없다고? 
		
		long startTime = System.currentTimeMillis();
		
		// 1byte씩 읽고 기록하기
//		int value = 0;
//		while ((value = in.read()) != -1) {
//			out.write(value);
//		}
//		
		
		// byte[] 배열을 이용해서 읽고 기록하기
		byte[] buf = new byte[1024*8];
		int length = 0;
		while (( length = in.read(buf)) != -1) {
			out.write(buf, 0, length);
		}
		
		
		in.close();
		out.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("소요시간 -> " + (endTime - startTime) + "밀리초");
		
		
	}

}
