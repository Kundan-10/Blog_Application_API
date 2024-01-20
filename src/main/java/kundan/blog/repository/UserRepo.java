package kundan.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kundan.blog.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
