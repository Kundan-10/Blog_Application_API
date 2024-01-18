package kundan.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kundan.blog.models.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
