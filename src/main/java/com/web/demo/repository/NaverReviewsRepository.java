package com.web.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.web.demo.entity.NaverReviews;
import com.web.demo.entity.Post;

public interface NaverReviewsRepository extends JpaRepository<NaverReviews, Long>{
	// 페이징(Page, Pageable) 형태의 리뷰 데이터를 가져오는 메소드 선언
	// findAll() => 모든 데이터를 다가져온다
	// 아래처럼 선언하면 => 특정 위치에서 특정 개수만큼 페이징하여 필요한것만 가져온다
	Page<NaverReviews> findAll(Pageable pageable);
}








