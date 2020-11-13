package blog.services;

import blog.models.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface PostServices {
	List<Post> findAll();
	Post create(Post post);

}
