package com.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingservice.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {

	public List<Rating> getRatingByUserId(String userId);
	
	public List<Rating> getRatingByHotelId(String hotelId);
}
