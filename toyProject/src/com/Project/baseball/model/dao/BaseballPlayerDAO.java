package com.Project.baseball.model.dao;

import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public interface BaseballPlayerDAO {

	void saveFile() throws Exception;
	
	public abstract Set<BaseballPlayer> selectPlayer();
}
