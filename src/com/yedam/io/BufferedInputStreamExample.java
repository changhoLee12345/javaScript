package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/yedam/io/ttt.pdf");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("src/com/yedam/io/copy.pdf");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int readByte;
		while ((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		bos.flush();bos.close();fos.flush();fos.close();
		bis.close();fis.close();
		System.out.println("end");
	}
}
