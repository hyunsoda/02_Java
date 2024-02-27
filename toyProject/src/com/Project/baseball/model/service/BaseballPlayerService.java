package com.Project.baseball.model.service;

import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public interface BaseballPlayerService {

	public abstract Set<BaseballPlayer> selectPlayer();

	public abstract String addNewPlayer(String name, String team, int age, String position, int debutYear) throws Exception;

	public abstract boolean updatePlayer(String fixName,String team, String position ) throws Exception;

	public abstract List<BaseballPlayer> sortTeam();

	public abstract int deletePlayer(String rname) throws Exception;

	public abstract BaseballPlayer searchPlayer(String name) throws Exception;

	public abstract List<BaseballPlayer> debutYearSort();

	public abstract int debutFirst(String name2) throws Exception;


}
