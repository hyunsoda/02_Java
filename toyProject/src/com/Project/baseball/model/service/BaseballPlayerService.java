package com.Project.baseball.model.service;

import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;

public interface BaseballPlayerService {

	public abstract Set<BaseballPlayer> selectPlayer();
}
