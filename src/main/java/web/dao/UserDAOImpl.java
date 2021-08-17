package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    EntityManager entityManager;

    public UserDAOImpl() {
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

   @Transactional
   @Override
   public void saveUser(User user) {
      entityManager.persist(user);
    }


}
