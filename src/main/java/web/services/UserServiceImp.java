package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   UserDAO userDAO;

   @Transactional
   @Override
   public void add(User user) {
      userDAO.saveUser(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDAO.getAllUsers();
   }

//   @Transactional
//   @Override
//   public User getUserByModelAndSeries(String model, int series) {
//      return userDao.getUserByModelAndSeries(model, series);
//   }

}
