package com.Project.baseball.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;
import com.Project.baseball.model.service.BaseballPlayerService;
import com.Project.baseball.model.service.BaseballPlayerServiceImpl;

public class BaseballPlayerView {

	private BufferedReader br = null;
	private BaseballPlayerService service = null;
	
	public BaseballPlayerView() {

		try {
			service = new BaseballPlayerServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayMenu() {
		int input = 0;
		do {
		System.out.println("\n====== Baseball Player List =======");
		System.out.println("1. 야구선수 조회하기");
		System.out.println("2. 신인선수 등록하기");
		System.out.println("3. 프로필 수정하기");
		System.out.println("4. 팀별 정렬하기");
		System.out.println("5. 선수 이름 검색하기");
		System.out.println("6. 데뷔연도별 정렬하기");
		System.out.println("7. 은퇴선수 삭제하기");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("Select Menu >>");
		
		
		try {
			input = Integer.parseInt(br.readLine());
			System.out.println();
			switch(input) {
			case 1: selectPlayer();break;
			case 2: addNewPlayer();break;
			case 3: updatePlayer();break;
			case 4: sortTeam();break;
			case 5: break;
			case 6: break;
			case 7: deletePlayer();break;
			case 0: System.out.println("선수 조회 프로그램을 종료합니다.");break;
			default :System.out.println("[오류] : 메뉴에 작성된 번호를 입력해주세요.");
			
			
		}
			
			
			
		}catch(NumberFormatException e) {
			
			System.out.println("====숫자만 입력해주세요====");
			input = -1;
			
		}catch(Exception e) {
			
			System.out.println("===예외 발생===");
			e.printStackTrace();
			input = -1;
			
		}
			
		/////////
		
		
			

		}	while(input != 0);
	}

	public void selectPlayer() {
		System.out.println("\n=========[1. 야구 선수 조회하기]=======");
	
		Set<BaseballPlayer> playerList = service.selectPlayer();
		for(BaseballPlayer list : playerList) {
			System.out.println(list);
		}
			System.out.println("-----------------------------------");
			System.out.printf("* 총 등록된 선수 : %d * \n",playerList.size()+1);
			System.out.println("-----------------------------------");
	
	
	}
	
	public void addNewPlayer() throws Exception{
		System.out.println("\n=========[2. 신인 선수 등록하기]=======");
		
		System.out.print("이름 : ");
		String name = br.readLine();
		
		System.out.print("팀 : ");
		String team = br.readLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("포지션 : ");
		String position = br.readLine();
		
		System.out.print("데뷔연도 : ");
		int debutYear = Integer.parseInt(br.readLine());
		
		String newName = service.addNewPlayer(name,team,age,position,debutYear);
		
		if(newName!=null ) {
			System.out.printf("%s선수 입단을 축하드립니다.",newName);
			
		}else {
			System.out.println("선수등록을 실패하였습니다");
		}
	}
	
	
	public void updatePlayer() throws Exception {
		System.out.println("\n=========[3. 프로필 수정하기]=======");

		System.out.print("수정할 선수 이름 입력 : ");
		String fixName = br.readLine();
		
		
		Set<BaseballPlayer> playerList = service.selectPlayer();
		for(BaseballPlayer player : playerList) {
			if(fixName.equals(player.getName())) {
				System.out.print("새로운 팀 입력 : ");
				String team = br.readLine();
				
				System.out.print("새로운 포지션 입력 : ");
				String position = br.readLine();
				
				boolean result = service.updatePlayer(fixName,team,position);
				if(result) {
					System.out.printf("%s선수의 프로필 수정이 완료되었습니다. ",player.getName());
					break;
				}else {
					System.out.println("프로필 수정 실패");
					break;
				}
			}
		}
		
		
		
	}


	public void sortTeam() throws Exception{
		System.out.println("\n=========[4. 팀별 정렬하기]=======");
		
		List<BaseballPlayer> playerList = service.sortTeam();
		Comparator<BaseballPlayer> teamComparator = Comparator.comparing(BaseballPlayer::getTeam);
		Collections.sort(playerList, teamComparator);
		for(BaseballPlayer player : playerList) {
			System.out.println(player);
		}
	}
	

	public void deletePlayer() throws Exception{
		System.out.println("\n=========[7. 은퇴 선수 삭제하기]=======");
		
		System.out.print("삭제할 선수의 이름을 입력해주세요. : ");
		String rname = br.readLine();
		
		Set<BaseballPlayer> playerList = service.selectPlayer();
		for(BaseballPlayer player : playerList) {
			if(rname.equals(player.getName())) {
				int num = service.deletePlayer(num);
			}
		}
		
		
		
		
	}

	
	

}
