package com.Project.baseball.model.service;

import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dao.BaseballPlayerDAO;
import com.Project.baseball.model.dao.BaseballPlayerDAOImpl;
import com.Project.baseball.model.dto.BaseballPlayer;

public class BaseballPlayerServiceImpl implements BaseballPlayerService{

	private BaseballPlayerDAO dao = null;
	
	public BaseballPlayerServiceImpl() throws Exception{
		dao = new BaseballPlayerDAOImpl();
		
	}

	@Override
	public Set<BaseballPlayer> selectPlayer() {

		Set<BaseballPlayer> playerList = dao.selectPlayer();
		
		
		return playerList;
	}
	
	
	@Override
	public String addNewPlayer(String name, String team, int age, String position, int debutYear) throws Exception {
		BaseballPlayer player = new BaseballPlayer(name,team,age,position,debutYear);
		
		String newName = dao.addNewPlayer(player);
		
		return newName;
	}
	
	
	@Override
	public boolean updatePlayer(String fixName,String team, String position) throws Exception {

		return dao.updatePlayer(fixName,team,position);
	}
	
	@Override
	public List<BaseballPlayer> sortTeam() {
		List<BaseballPlayer> playerList = dao.sortTeam();
		return playerList;
	}
	
	@Override
	public int deletePlayer(String rname) throws Exception {
		String dName = dao.deletePlayer(rname);
		if(dName != null) return 1;
		else return -1;
	}
	
	@Override
	public BaseballPlayer searchPlayer(String name) throws Exception {
		BaseballPlayer player = dao.searchPlayer(name);
		return player;
	}
	
	@Override
	public List<BaseballPlayer> debutYearSort() {
		List<BaseballPlayer> playerList = dao.debutYearSort();
		return playerList;
	}
	
	@Override
	public int debutFirst(String name2) throws Exception {
		List<BaseballPlayer> playerList = dao.debutfirst();
		int year = 0;
		
		for(BaseballPlayer player : playerList) {
			if(name2.equals(player.getName())) {
				year = player.getDebutYear();
			}
		}
		return year;
	}
	
}
