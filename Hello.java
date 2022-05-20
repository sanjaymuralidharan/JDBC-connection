package jdbc_connection;

import java.sql.Connection;

public class Hello {

    public static void main(String[] args)
    {
        database db=new database();
        Connection connection=db.connect_to_database("jdbc_connection","postgres","Muralidharan*123");
        db.createTable(connection,"employee");
        //db.insertTable(connection,"sanjay","123abc colony","");
        //db.updateName(connection,"employee","","");
        //db.searchByName(connection,"employee","");
        //db.deleteRowByName(connection,"employee","");
        //db.deleteRowById(connection,"employee",4);
        //db.readData(connection,"employee");
        //db.deleteTable(connection,"employee");
    }
}
