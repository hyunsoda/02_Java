package com.Project.baseball.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public class BaseballPlayerDAOImpl implements BaseballPlayerDAO{

	private final String FILE_PATH = "/io_test/BaseballPlayer.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private Set<BaseballPlayer> playerList = null;
	
	public BaseballPlayerDAOImpl() throws Exception{
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				playerList = (Set<BaseballPlayer>)ois.readObject();
			}finally {
				if(ois != null)ois.close();
			}
		}else {
			File directory = new File("/io_test");
			if(!directory.exists()) directory.mkdir();
			
			playerList = new HashSet<BaseballPlayer>();
			playerList.add(new BaseballPlayer("양의지","두산",36,"포수",2006));
			playerList.add(new BaseballPlayer("김주원","NC",21,"유격수",2021));
			playerList.add(new BaseballPlayer("최승용", "두산",22,"투수",2021));
			playerList.add(new BaseballPlayer("류현진","한화",36,"투수",2006));
			playerList.add(new BaseballPlayer("문동주","한화",20,"투수",2022));
			playerList.add(new BaseballPlayer("박건우","NC",33,"우익수",2009));
			playerList.add(new BaseballPlayer("정수빈","두산",33,"중견수",2009));
			playerList.add(new BaseballPlayer("김택연","두산",18,"투수",2009));
			playerList.add(new BaseballPlayer("윤동희","롯데",20,"우익수",2022));
			playerList.add(new BaseballPlayer("노시환","한화",23,"내야수",2019));
			playerList.add(new BaseballPlayer("양석환","두산",23,"내야수",2014));
			playerList.add(new BaseballPlayer("김도영","KIA",20,"내야수",2022));
			playerList.add(new BaseballPlayer("임찬규","LG",31,"투수",2010));
			playerList.add(new BaseballPlayer("박동원","LG",33,"포수",2009));
			
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(playerList);
		}finally {
			if(oos!= null) oos.close();
		}
		System.out.println("**playerList.dat 파일 생성 완료**");
		}		
		
	}
	
	@Override
	public void saveFile() throws Exception {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(playerList); 
			
		}finally {
			oos.close();
		}
	}

	@Override
	public Set<BaseballPlayer> selectPlayer() {
		
		return playerList;
	}
	
	@Override
	public String addNewPlayer(BaseballPlayer player) throws Exception {

		if(playerList.add(player)) {
			saveFile();
			return player.getName();
		}
		return "선수 등록을 실패하였습니다";
	}

	@Override
	public boolean updatePlayer(String fixName,String team, String position) throws Exception {
		for(BaseballPlayer player : playerList) {
			if(player.getName().equals(fixName)) {
				player.setTeam(team);
				player.setPosition(position);
				saveFile();
				return true;
			}
		}
		
		return false;
	}
	
	
	@Override
	public List<BaseballPlayer> sortTeam() {
		List<BaseballPlayer> plist = new ArrayList<BaseballPlayer>();
	for(BaseballPlayer player : playerList) {
		plist.add(new BaseballPlayer(player.getName(),player.getTeam(),player.getAge(),player.getPosition(),player.getDebutYear()));
	}
		return plist;
	}
	
	@Override
	public String deletePlayer(String rname) throws Exception {
		for(BaseballPlayer player : playerList) {
			if(player.getName().equals(rname)) {
			playerList.remove(player);
			saveFile();
			return rname;
		}
		}
		
		return null;
	}
	
	
	
	@Override
	public BaseballPlayer searchPlayer(String name) {
		for(BaseballPlayer player : playerList) {
			if(name.equals(player.getName())) {
				return player;
			}
		}
		return null;
	}
	
	@Override
	public List<BaseballPlayer> debutYearSort() {
		List<BaseballPlayer> player = new ArrayList<BaseballPlayer>();
		for(BaseballPlayer bp : playerList) {
			player.add(bp);
		}
		
		return player;
	}
	
	@Override
	public Set<BaseballPlayer> debutfirst() throws Exception {
		
		return playerList;
//		List<BaseballPlayer> player = new ArrayList<BaseballPlayer>();
//		for(BaseballPlayer bp : playerList) {
//			player.add(bp);
//		}
//			return player;
		}
}



