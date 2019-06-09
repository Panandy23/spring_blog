package spring_blog.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_blog.demo.Model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
