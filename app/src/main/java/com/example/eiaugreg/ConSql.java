package com.example.eiaugreg;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConSql {
    Connection con;

    @SuppressLint("NewApi")
    public Connection conclass() {
        String host = "192.168.1.9", port = "64546", dbname = "nrej", username = "taher", password = "123456789";
        StrictMode.ThreadPolicy a = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);
        String ConnectURL = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL = "jdbc:jtds:sqlserver://" + host + ":" + port + ";databasename=" + dbname + ";user=" + username + ";" + "password=" + password + ";";
            con = DriverManager.getConnection(ConnectURL);

        } catch (Exception e) {
            Log.e("Error is ", e.getMessage());
        }
        return con;
//     @SuppressLint("NewApi")
//    String ip = "192.168.1.2";
//    String classs = "net.sourceforge.jtds.jdbc.Driver";
//    String db = "ALPHA_ONE";
//    String un = "taher";
//    String port = "64546";
//    String password = "123456789";
//
//    public Connection CONN() {
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//        Connection conn = null;
//        String ConnURL = null;
//        try {
//            Class.forName(classs);
//            ConnURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";databasename=" + db + ";user=" + u + ";"+"password=" + password + ";";
//            //ConnURL = "jdbc:jtds:sqlserver://" + ip + ";"+port + ";databaseName=" + db + ";user=" + un + ";password=" + password + ";";
//            conn = DriverManager.getConnection(ConnURL);
//        } catch (   SQLException se) {
//            Log.e("ERROR", se.getMessage());
//        } catch (ClassNotFoundException e) {
//            Log.e("ERROR", e.getMessage());
//        } catch (Exception e) {
//            Log.e("ERROR", e.getMessage());
//        }
//        return conn;
//    }
    }
}
