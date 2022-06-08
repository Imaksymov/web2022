package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import tools.Tool;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Tool toolParse(HttpServletRequest request) {
		Tool tool = new Tool();
		JsonElement jsonElement = bodyParse(request);
		tool.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		tool.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		tool.setWeight(jsonElement.getAsJsonObject().get("weight").getAsInt());
		tool.setWidth(jsonElement.getAsJsonObject().get("width").getAsFloat());
		return tool;
	}
	
	public static int getNextId(List<Tool> list) {
		int maxId = 0;
		
		Iterator<Tool> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByToolId(int id,List<Tool> list) {
		int listId = id;
		
		Iterator<Tool> iterator = list.iterator();
		while(iterator.hasNext()) {
			Tool temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}