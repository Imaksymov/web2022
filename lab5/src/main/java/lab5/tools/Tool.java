package lab5.tools;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table; 

@Entity
@Table(name = "tool")
public class Tool implements Serializable{
	
	@Id
	@GeneratedValue
	int id;
	private String title;
	private int  weight;
	private float width;
	
	
	public Tool(int id, String title, int  weight, float width) {
		super();
		this.id = id;
		this.title = title;
		this.weight = weight;
		this.width = width;
	}

	public Tool() {
		super();// TODO Auto-generated constructor stub
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

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"title\": \""+title+"\", \"weight\": "+ weight+", \"width\": \"" + width + "\"}";
	}
}