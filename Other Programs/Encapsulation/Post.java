class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void likePost(Post post) {
        post.incrementLikes();
        System.out.println(username + " liked the post with ID: " + post.getPostId());
    }

    public void commentOnPost(Post post, String comment) {
        post.incrementComments();
        System.out.println(username + " commented on the post with ID: " + post.getPostId() + "\nComment: " + comment);
    }
}

class Post {
    private int postId;
    private int likesCount;
    private int commentsCount;

    public Post(int postId, int likesCount, int commentsCount) {
        this.postId = postId;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
    }

    public int getPostId() {
        return postId;
    }

    public void displayLikes() {
        System.out.println("Number of likes: " + likesCount);
    }

    public void displayComments() {
        System.out.println("Number of comments: " + commentsCount);
    }

    public void incrementLikes() {
        likesCount++;
    }

    public void incrementComments() {
        commentsCount++;
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating objects of User and Post classes
        User user = new User("exampleUser", "password123");
        Post post = new Post(1, 20, 10);

        // Demonstrating the use of methods
        System.out.println("Username: " + user.getUsername());
        post.displayLikes();
        post.displayComments();

        // User likes and comments on the post
        user.likePost(post);
        user.commentOnPost(post, "Great post!");

        // Display updated likes and comments
        post.displayLikes();
        post.displayComments();
    }
}
