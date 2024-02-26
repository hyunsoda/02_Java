package com.Project.baseball.model.dao;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public class BaseballPlayerDAOImpl implements BaseballPlayerDAO{

	private final String FILE_PATH = "";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private Set<BaseballPlayer> playerList = null;
	
	public BaseballPlayerDAOImpl() {
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			try {
				
				
			}finally {
				
			}
		}
		
		
	}
	
	@Override
	public void saveFile() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
