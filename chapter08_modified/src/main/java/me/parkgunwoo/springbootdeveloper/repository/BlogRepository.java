package me.parkgunwoo.springbootdeveloper.repository;

import me.parkgunwoo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}