package blog.services;

import blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostServicesStubImpl implements PostServices {

	// Creating temporary data for testing without the database
	private List<Post> posts=new ArrayList<Post>()
	{{
		add(new Post(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>", null));
		add(new Post(2L, "Second Post", "<p>Not interesting post</p>", null));
		add(new Post(3L, "Post Number 3", "<p>Just posting</p>", null));
		add(new Post(4L, "Fourth Post", "<p>Another interesting post</p>", null));
	}};

	@Override
	public List<Post> findAll() {
		return this.posts;
	}

	@Override
	public Post create(Post post) {
		return null;
	}
}

