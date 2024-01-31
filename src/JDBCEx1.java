import java.sql.*;



public class JDBCEx1 {

	static final String URL="jdbc:mysql://localhost:3306/sakila";
	static final String USER="root";
	static final String PWD="root";
	static final String SELECT_QUERY="select * from actor;";
	
	
	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection(URL,USER,PWD)){
			
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(SELECT_QUERY);
			
			while(set.next()){
				
				int id= set.getInt("actor_id");
				System.out.println(id);
				
			}
			
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}

	}

}
