package spring_blog.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import spring_blog.demo.Model.Enums.CategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @Type(type = "text")
    private String content;

    @Enumerated
    private CategoryEnum category;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "post")
    List<Comment> comment = new ArrayList<>();


    public Post(String title, String content, CategoryEnum category, User user) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
    }
}
