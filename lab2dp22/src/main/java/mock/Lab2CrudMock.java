package mock;

import crud.Lab2CrudInterface;
import tools.Tools;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Tools readTools() {
		// TODO Auto-generated method stub
		return new Tools("Mock1",40,3.2f);
	}

	@Override
	public void updateTools(Tools tools) {
		// TODO Auto-generated method stub

	}

}
