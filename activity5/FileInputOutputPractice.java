package activity5;

import java.io.*;
import java.util.*;

public class FileInputOutputPractice {

	public static void main(String[] args) {
		
		String file1 = "activity5_input1.txt";
		String file2 = "activity5_input2.txt";
		String file3 = "activity5_output.txt";
		
		Scanner inputStream1 = null;
		Scanner inputStream2 = null;
		PrintWriter outputStream = null;
		String Line;
		
		try {
			inputStream1 = new Scanner(new File(file1));
			inputStream1 = new Scanner(new File(file2));
			outputStream = new PrintWriter(file3);
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		while(inputStream1.hasNextLine());{
			Line = inputStream1.nextLine();
			outputStream.println(Line);
		}
		
		outputStream.println();
		
		while(inputStream2.hasNextLine()) {
			Line = inputStream2.nextLine();
			outputStream.println(Line);
		}
		
		inputStream1.close();
		inputStream2.close();
		outputStream.close();
		System.out.println("Lines were written to " + file3);
	}

}
