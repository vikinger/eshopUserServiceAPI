package de.eshop.userserviceAPI;

import java.util.List;

public interface UserManager {
    
//    public void registerUser(String username, String name, String lastname, String password, Role role);
    public void registerUser(User user);
    
    public User getUserByUsername(String username);
    
    public boolean deleteUserById(int id);
    
    public Role getRoleByLevel(int level);
    
    public boolean doesUserAlreadyExist(String username);
    
    public List<User> getAllUsers();
}
