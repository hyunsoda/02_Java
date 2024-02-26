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
	public int deletePlayer(int num) throws Exception {
		BaseballPlayer player = dao.deletePlayer(num);
		if(player == null)return -1;
		return 1;
	}
	
	
	
}
