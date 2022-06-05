package crud;

import tools.Tools;
import fileIO.FileIO;
import fileIO.FileIOInterface;
public class FileCrud implements Lab2CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Tools readTools() {
		
		return (Tools) fio.loadFromFile();
	}

	@Override
	public void updateTools(Tools tools) {
		fio.saveToFile(tools);

	}

}
