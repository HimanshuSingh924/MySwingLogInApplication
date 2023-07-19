/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Himanshu Singh
 */
public class DataBaseClass {
    
    private static Connection conn = null;
    private static Statement st = null;
    private static ResultSet rs = null;
    private static String query = null;
    private static PreparedStatement ps;
    
    public static final Connection getConnection(String wsname, String psd) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:"+wsname+"/"+psd+"@localhost:1521:XE","system","system");
        
        return conn;
    }
    
    public  final ResultSet getResultSet(Connection conn, String query) throws Exception
    {
        st = conn.createStatement();
	rs = st.executeQuery(query);

        return rs;
    }
    
    public static String getInsertQuery() throws Exception
    {
        String query = "insert into golu.STUDENT_RECORD values(?,?,?,?,?,?)";
		
	return query;
    }
    
    public static String getSelectQuery() throws Exception
    {
        String query = "select * from GOLU.STUDENT_RECORD where ID = ? and PSD = ?";
        
        return query;
    }

    public static void closeStatOfInsertQuery(Connection conn) throws Exception
    {
        st.close();
        conn.close();
    }
    
    public static final void closeStatOfSelectQuery(Connection conn, ResultSet rs) throws Exception
    {
	rs.close();
        st.close();
	conn.close();
    }  
}
