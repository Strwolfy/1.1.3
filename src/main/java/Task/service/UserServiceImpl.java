package Task.service;

import Task.dao.UserDaoJDBCImpl;
import Task.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService  {

    private UserDaoJDBCImpl daoJDBC = new UserDaoJDBCImpl();

    public void createUsersTable() {
        daoJDBC.createUsersTable();
    }

    public void dropUsersTable() {
        daoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        daoJDBC.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        daoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return daoJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
        daoJDBC.cleanUsersTable();
    }
}