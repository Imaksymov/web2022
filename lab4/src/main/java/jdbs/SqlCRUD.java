package jdbs;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlets.LabCRUDInterface;
import tools.Tool;

public class SqlCRUD implements LabCRUDInterface<Tool> {

Connection connection;
	
	
	public SqlCRUD() {
		
		this.connection = new Connect().getCon();
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Tool t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO tool1 (\"title\",weight,width) " + "VALUES (?,?,?)")) {
			st.setString(1, t.getTitle());
			st.setInt(2, t.getWeight());
			st.setFloat(3, t.getWidth());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Tool> read() {
		List<Tool> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); 
				ResultSet rs = st.executeQuery("SELECT * FROM tool1;");) {
			while (rs.next()) {
				list.add(new Tool(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, Tool t) {
		try (PreparedStatement st = connection
				.prepareStatement("UPDATE tool1 " + "SET \"title\"=?, \"weight\"=?, \"width\"=? WHERE id=?;")) {
			st.setString(1, t.getTitle());
			st.setInt(2, t.getWeight());
			st.setFloat(3, t.getWidth());
			st.setInt(4, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("DELETE FROM tool1 WHERE id=?;")) {
			st.setInt(1, id);			
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
