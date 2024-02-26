package com.Project.baseball.model.service;

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
}
