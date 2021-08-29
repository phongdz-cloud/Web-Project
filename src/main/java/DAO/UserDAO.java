package DAO;

import Context.DbContext;
import Model.User;
import Service.IUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO implements IUser {

    @Override
    public User getUser(String username,String password) {
        DbContext context = new DbContext();
        try (Connection conn = context.getConnection()) {
            String query = "SELECT * FROM account WHERE user=? AND pass =?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
                return new User(username, password);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }
}
