package com.nikesh.scheduler.model;

import java.sql.*;

/**
 * Performs the actions of the database query for checking the username and
 * password authority.
 *
 * @author Nikesh Maharjan
 */
public class LoginModel {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String username, password;
    private String dbHost, dbUser, dbPass;

    /**
     * No arg constructor.
     */
    public LoginModel() {
        this("", "");
    }

    /**
     * Constructor with username and password as an arguments.
     */
    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;

        initDatabase();
    }

    /**
     * Mutator method to set the username.
     *
     * @param username Username supplied from the view.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Mutator method to set the password.
     *
     * @param password Password supplied from the view.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthorized() {
        boolean flag = false;

        String query = "SELECT * FROM login_info  WHERE username='" + this.username + "' && password='" + this.password + "'";
        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                flag = true;
                break;
            }

        } catch (SQLException ex) {
            //Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in isAuthorized method.");
            System.exit(1);
        }

        return flag;
    }

    private void initDatabase() {
        dbHost = "jdbc:mysql://localhost:3306/scheduler";
        dbUser = "root";
        dbPass = "n1k35h";

        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(dbHost, dbUser, dbPass);
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in initDatabase()");
            System.exit(1);
        }
    }

    /*public static void main(String[] args) {
     LoginModel model = new LoginModel("nikesh", "maharjan123");
     System.out.println(model.isAuthorized());
     }*/
}
