package spring_blog.demo.Service;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_blog.demo.Model.Post;
import spring_blog.demo.Repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> viewAll (){
        return postRepository.findAll();
    }

}
