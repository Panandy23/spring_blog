package spring_blog.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_blog.demo.Model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
