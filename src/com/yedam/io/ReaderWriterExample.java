package com.yedam.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriterExample {
	public static void main(String[] args) throws IOException {
		String path = "src/com/yedam/io/BufferedInputStreamExample.java";
		File fileReader = new File(path);
		FileReader fr = new FileReader(fileReader);
		int readChar;
		char[] cbuf = new char[100];
		while ((readChar = fr.read(cbuf)) != -1) {
			String text = new String(cbuf, 0, readChar);
			// String <- char[] : 'a', 'b', 'c' -> "abc"
			System.out.print(text);
		}
		fr.close();
	}
}
