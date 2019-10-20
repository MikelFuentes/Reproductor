package pr01;

import java.io.File;

import javax.swing.JFileChooser;

public class Choser {

	public static void main(String[] args) {
		File dirActual = new File(System.getProperty("user.dir"));
		System.out.println(dirActual);

	}

}
