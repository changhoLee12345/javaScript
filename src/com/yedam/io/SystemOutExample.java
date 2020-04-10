package com.yedam.io;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOutExample {
	public static void main(String[] args) throws IOException {
		PrintStream ps = System.out;
		String text = "한글은달리처리해야합니다.";
		byte[] cbuf = text.getBytes();
		ps.write(cbuf);
		ps.flush();
	}
}
