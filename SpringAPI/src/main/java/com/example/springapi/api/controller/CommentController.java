package com.example.springapi.api.controller;

import com.example.springapi.api.model.Comment;
import com.example.springapi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public String createComment(@RequestParam int postID,
                                @RequestParam int userID,
                                @RequestParam String commentBody) {
        return commentService.createComment(postID, userID, commentBody);
    }

    @GetMapping
    public Comment getComment(@RequestParam int commentID) {
        return commentService.getComment(commentID);
    }

    @PatchMapping
    public String editComment(@RequestParam int commentID,
                              @RequestParam String newCommentBody) {
        return commentService.editComment(commentID, newCommentBody);
    }

    @DeleteMapping
    public String deleteComment(@RequestParam int commentID) {
        return commentService.deleteComment(commentID);
    }
}
