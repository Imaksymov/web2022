package tools;
import java.util.ArrayList;
import java.util.List;
public class Mock {
	private List<Tool> toolList = new ArrayList<>();
	
	
	public Mock () {		
		this.toolList.add(new Tool(1, "Tool 1",0,3.2f));
		this.toolList.add(new Tool(2, "Tool 2",2,3.3f));
		this.toolList.add(new Tool(3, "Tool 3",3, 3.4f));
	}

	public List<Tool> getToolList() {
		return toolList;
	}

	public void setUserList(List<Tool> toolList) {
		this.toolList = toolList;
	}
	
	
	
}
