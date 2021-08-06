package com.alvinmuniz.blog.repository;

import com.alvinmuniz.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    @Query(value = "select * from posts p1 where p1.user_id = :userId"
    , nativeQuery = true)
    List<Post> findAllByUserId(@Param("userId") Long userId);
}
