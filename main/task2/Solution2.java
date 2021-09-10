package main.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Solution2 {
	public static void main(String[] args) {
		File fileBegin = new File("C:/Users/Hippo/Desktop/test");
		File fileCor = new File("C:/Users/Hippo/Desktop/test2");
		try {
			accordance(fileBegin, fileCor);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void accordance(File fileBegin, File fileCor) throws FileNotFoundException {
		Scanner scanner = new Scanner(fileBegin);
		float x0 = 0;
		float y0 = 0;
		float radius = 0;
		while (scanner.hasNext()) {
			x0 = scanner.nextFloat();
			y0 = scanner.nextFloat();
			radius = scanner.nextFloat();
		}
		scanner.close();
		Scanner scanner2 = new Scanner(fileCor);
		while (scanner2.hasNext()) {
			float x = scanner2.nextFloat();
			float y = scanner2.nextFloat();
			float h = (float) sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0));
			if (h > radius) {
				System.out.println(2);
			} else if (h == radius) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
		scanner2.close();
	}
}
