package com.yedam.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) {
		Path path = Paths.get("src/com/yedam/stream/list.txt");
		Stream<String> strStream;
		try {
			strStream = Files.lines(path, Charset.defaultCharset());
			strStream.forEach(s -> System.out.println(s.toString()));
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
