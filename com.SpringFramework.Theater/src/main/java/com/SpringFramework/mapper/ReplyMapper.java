package com.SpringFramework.mapper;

import java.util.List;

import com.SpringFramework.domain.ReplyVO;

public interface ReplyMapper {
	public void insertReply(ReplyVO reply);
	public List<ReplyVO> selectReplies(int movie_id);
	public List<ReplyVO> showReplies(String user_id);
}
