package tools;
import java.io.Serializable;

public class Tool implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private int weight;
	private float width;
	public Tool(int id, String title, int weight, float width) {
		super();
		this.id = id;
		this.title = title;
		this.weight = weight;
		this.width = width;
	}
	
	
	
	public Tool() {
		super();
	}

	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "{ \"id\": " + id + ", \"title\": \"" + title + "\", \"weight\": " + weight + ", \"width\": \"" + width + "\"}";
	}
}
