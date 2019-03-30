package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemsDAO {
	Connection dbCon = null;
	Statement stmt = null;
	ResultSet rs = null;
	String query = null;
	ArrayList<Item> itemsList = null;
	ConnectDb connectdb = null;
	Item item=null;

	public ArrayList<Item> returnAllItems() throws SQLException {
		item=new Item();
		itemsList = new ArrayList<Item>();
		connectdb=new ConnectDb();
		dbCon = connectdb.connectDatabase();
		query="select * from items";
		stmt = dbCon.prepareStatement(query);
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			item.setId(rs.getInt(1)); 
			item.setItemName(rs.getString(2));
			item.setQuantity(rs.getInt(3));
			itemsList.add(item);
		}

		return itemsList;
	}

}
