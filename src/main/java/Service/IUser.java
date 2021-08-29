package Service;

import Model.User;

public interface IUser {
    public User getUser(String username, String password);
    public int insertUser(User user);
}
