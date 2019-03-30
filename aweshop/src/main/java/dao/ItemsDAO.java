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
	
	public void addItem(Item item) throws SQLException {
		item=new Item();
		connectdb=new ConnectDb();
		dbCon = connectdb.connectDatabase();
		query="insert into items(ItemName,Quantity) values('"+item.getItemName()+"',"+item.getQuantity()+");";
		stmt = dbCon.prepareStatement(query);
		rs = stmt.executeQuery(query);
		
	}
	
	public void updateItem(Item item) throws SQLException {
		item=new Item();
		connectdb=new ConnectDb();
		dbCon = connectdb.connectDatabase();
		query="update items set ItemName='"+item.getItemName()+"',Quantity="+item.getQuantity()+" where personid="+item.getId();
		stmt = dbCon.prepareStatement(query);
		rs = stmt.executeQuery(query);
		
	}
	
	public void deleteItem(Item item) throws SQLException {
		item=new Item();
		connectdb=new ConnectDb();
		dbCon = connectdb.connectDatabase();
		query="delete from items where personid="+item.getId();
		stmt = dbCon.prepareStatement(query);
		rs = stmt.executeQuery(query);
		
	}

}
