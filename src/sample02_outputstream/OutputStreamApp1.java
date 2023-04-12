package sample02_outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamApp1 {  //얘는 text전용이 아니다 // 문자열 String 기록하는 메소드가 없다. // 하지만 filewriter는 문자열 기록할 수 있는 메소드가 있다. 

	public static void main(String[] args)throws IOException {
		FileOutputStream out 
		 = new FileOutputStream("src/sample02_outputstream/sample.txt");
	
//	out.write(65);    	// 영문자A
//	out.write(66);    	// 영문자B
//	out.write(67);		// 영문자C
//	out.write('a');		// 영문자a
//	out.write('b');		// 영문자b
//	out.write('c');		// 영문자c
//	out.write('d');		// 영문자d
//	out.write('가');		// 글자가 제대로 기록되지 않는다. // WHY? 얘네는 1byte씩 기록한다. 
//	out.write('나');		// 글자가 제대로 기록되지 않는다. 
//	out.write('다');		// 글자가 제대로 기록되지 않는다. 
//	
		
	String text = "안녕하세요. 반갑습니다.";
	byte[] bytes = text.getBytes(); 
	out.write(bytes); // 싹 다 보내버려서 출력된다..훔냐 
	
	out.close(); 
	}
}
