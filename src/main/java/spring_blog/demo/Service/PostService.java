package spring_blog.demo.Service;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_blog.demo.Model.Comment;
import spring_blog.demo.Model.Enums.CategoryEnum;
import spring_blog.demo.Model.Post;
import spring_blog.demo.Model.User;
import spring_blog.demo.Repository.CommentRepository;
import spring_blog.demo.Repository.PostRepository;
import spring_blog.demo.Repository.UserRepository;

import java.util.List;

@Service
public class PostService {

    PostRepository postRepository;
    CommentRepository commentRepository;
    UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, CommentRepository commentRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
    }

    public List<Post> viewAll (){
        return postRepository.findAll();
    }

    public Post getPostById (Long post_id){
        if(postRepository.findById(post_id).isPresent()) {
            return postRepository.getOne(post_id);
        }
        return new Post();
    }


}
