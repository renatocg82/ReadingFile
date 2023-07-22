package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AppReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		File file = new File("C:\\temp\\in.txt");
		Scanner scFile = null;

		try {
			scFile = new Scanner(file);
			while (scFile.hasNextLine()) {
				System.out.println(scFile.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		finally {
			if (scFile != null) {
				scFile.close(); // fechando recurso no bloco finally;
			}

		}
		sc.close();
		scString.close();

	}

}
