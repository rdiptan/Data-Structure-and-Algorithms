package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week_8to11.FileHandler;

class FileTest {

	@Test
	void test() {
		FileHandler myfile = new FileHandler();
		String fileName= "testfile.txt";
		String[] data= {"diptan","regmi","cs19b"};
		
		//a file must be created if doesn't exist and data should be written in that file
		String message=myfile.CreateOrAdd(fileName,data);
		assertEquals("Success (Added).",message);	}

}
