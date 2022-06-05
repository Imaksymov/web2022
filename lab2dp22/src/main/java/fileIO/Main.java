package fileIO;

import tools.Tools;

public class Main {

	public static void main(String[] args) {
		Tools tools = new Tools("Mock1",40,3.2f);
		
		FileIOInterface fio = new FileIO();
		fio.saveToFile(tools);
		System.out.println((Tools) fio.loadFromFile());
	}

}
