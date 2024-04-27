package com.example.springapi.service;

import com.example.springapi.api.model.Comment;
import com.example.springapi.api.model.Post;
import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    // Dummy list to store comments (replace with database interaction)
    private List<Comment> comments = new ArrayList<>();

    // Dummy list to store posts (replace with actual post retrieval)
    private List<Post> posts = new ArrayList<>();

    public String createComment(int postID, int userID, String commentBody) {
        // Check if the post exists
        Post post = getPost(postID);
        if (post == null) {
            return "Post does not exist";
        }

        // Create a new comment
        Comment comment = new Comment();
        comment.setCommentID(comments.size() + 1); // Generate unique comment ID
        comment.setCommentBody(commentBody);
        // Dummy user creation (replace with actual user retrieval)
        User user = new User();
        user.setUserID(userID);
        user.setName("John Doe"); // Replace with actual user details
        comment.setCommentCreator(user);

        comments.add(comment); // Add comment to the list
        return "Comment created successfully";
    }

    public Comment getComment(int commentID) {
        // Find comment by ID
        for (Comment comment : comments) {
            if (comment.getCommentID() == commentID) {
                return comment;
            }
        }
        return null; // Comment not found
    }

    public String editComment(int commentID, String newCommentBody) {
        // Find comment by ID
        for (Comment comment : comments) {
            if (comment.getCommentID() == commentID) {
                // Update comment body
                comment.setCommentBody(newCommentBody);
                return "Comment edited successfully";
            }
        }
        return "Comment does not exist";
    }

    public String deleteComment(int commentID) {
        // Find comment by ID
        for (Comment comment : comments) {
            if (comment.getCommentID() == commentID) {
                comments.remove(comment);
                return "Comment deleted";
            }
        }
        return "Comment does not exist";
    }

    // Dummy method to retrieve a post (replace with actual post retrieval)
    private Post getPost(int postID) {
        for (Post post : posts) {
            if (post.getPostID() == postID) {
                return post;
            }
        }
        return null;
    }
}
