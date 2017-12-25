package Lesson04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOMain {

	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/ADMIN/eclipse-workspace/MyProjecct");
		
		try {
			Files.walkFileTree(path, new MyVisitor());
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(path);
	}

}
