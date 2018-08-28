package service;

import api.UserService;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<User>();
    }

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public void removeUserById(Long userId)
    {
        for(int i = 0; i < users.size(); i++)
        {
            //wyciągnienie ntego(intego) user z listy
            User userFromList = users.get(i);
            //jeseli id usera z listy jest rowne podanemu userID do usuniecia
            if(userFromList.getId() == userId)
            {
                //to usun tego usera z pod itego indexu
                users.remove(i);
                //i przerwij petle w koncu user juz zostal usuniety
                break;
            }
        }
    }
}
