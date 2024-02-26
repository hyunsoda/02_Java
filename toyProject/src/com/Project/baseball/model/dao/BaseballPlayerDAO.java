package com.Project.baseball.model.dao;

import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public interface BaseballPlayerDAO {

	void saveFile() throws Exception;
	
	public abstract Set<BaseballPlayer> selectPlayer();

	String addNewPlayer(BaseballPlayer player) throws Exception;

	boolean updatePlayer(String fixName,String team, String position ) throws Exception;

	List<BaseballPlayer> sortTeam();

	BaseballPlayer deletePlayer(int num) throws Exception;
}
