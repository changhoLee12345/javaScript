package com.yedam.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList("홍길동", "김유신", "하준원", "홍성우");
//		==> name.txt 
		FileOutputStream fr = new FileOutputStream("src/com/yedam/io/name.txt");
		for (String b : list) {
			fr.write(b.getBytes());
		}
		fr.flush();
		fr.close();
	}
}
