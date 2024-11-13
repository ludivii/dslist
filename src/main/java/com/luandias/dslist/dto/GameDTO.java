package com.luandias.dslist.dto;

import com.luandias.dslist.entities.Game;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	public GameDTO() {

	}

	public GameDTO(Game obj) {
		id = obj.getId();
		title = obj.getTitle();
		year = obj.getyear();
		genre = obj.getGenre();
		platforms = obj.getPlatforms();
		score = obj.getScore();
		imgUrl = obj.getImgUrl();
		shortDescription = obj.getShortDescription();
		longDescription = obj.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

}
