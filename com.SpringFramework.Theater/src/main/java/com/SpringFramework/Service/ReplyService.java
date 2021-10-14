package com.SpringFramework.Service;

import java.util.List;

import com.SpringFramework.domain.ReplyVO;

public interface ReplyService {
	public void insertReply(ReplyVO reply);
	public List<ReplyVO> selectReplies(int movie_id);
	public List<ReplyVO> showReplies(String user_id);
}
