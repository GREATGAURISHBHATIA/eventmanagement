import java.sql.*;
	class DB{
		Statement s = null;
		Connection c = null;
	void addData(String eventtype, String eventName, String date, String time, String location, String venue, String capacity){		
		try {	
			String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; // jdbc driver
            String url = "jdbc:mysql://localhost:3306/events"; // mysql url
            String user = "root"; // mysql username
            String pass = "tiger"; // mysql passcode
            Class.forName(mysqlJDBCDriver);
            c = DriverManager.getConnection(url, user,pass);
			Statement s=c.createStatement(); // jdbc driver// mysql passcode
			String query  = String.format("Insert into event values('%s','%s','%s','%s','%s','%s','%s');", eventtype,eventName,date,time,location,venue,capacity);
			s.executeUpdate(query);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	void printData(){
		try {	
			String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; // jdbc driver
            String url = "jdbc:mysql://localhost:3306/events"; // mysql url
            String user = "root"; // mysql username
            String pass = "tiger"; // mysql passcode
            Class.forName(mysqlJDBCDriver);
            c = DriverManager.getConnection(url, user,pass);
			Statement s=c.createStatement(); // jdbc driver// mysql passcode
			String query  = String.format("select * from event;");
			ResultSet res = s.executeQuery(query);
			System.out.print("|");
			int i = 1;
			while (res.next()) {
				System.out.print(Integer.toString(i)+"|");
				System.out.print(res.getString(1)+"|");
				System.out.print(res.getString(2)+"|");
				System.out.print(res.getString(3)+"|");
				System.out.print(res.getString(4)+"|");
				System.out.print(res.getString(5)+"|");
				System.out.print(res.getString(6)+"|");
				System.out.print(res.getString(7)+"|\n");
				i+=1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}