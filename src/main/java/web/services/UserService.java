package web.services;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    //User getUserByModelAndSeries(String model, int series);
}
