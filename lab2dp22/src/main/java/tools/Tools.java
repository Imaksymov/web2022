package tools;

import java.io.Serializable;

public class Tools implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private int weight;
	private float width;
	
	public Tools(String title, int weight, float width) {
		super();
		this.title = title;
		this.weight = weight;
		this.width = width;
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

	public void setAge(int weight) {
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
		return "{\"title\": \""+title+"\", \"weight\": "+weight+", \"width\":"+width+"}";
	}
	
}
