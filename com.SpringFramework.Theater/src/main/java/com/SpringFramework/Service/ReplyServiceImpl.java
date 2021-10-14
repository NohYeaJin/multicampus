package com.SpringFramework.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFramework.domain.ReplyVO;
import com.SpringFramework.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyMapper mapper;
	
	@Override
	public void insertReply(ReplyVO reply) {
		mapper.insertReply(reply);
		
	}

	@Override
	public List<ReplyVO> selectReplies(int movie_id) {
		return mapper.selectReplies(movie_id);
	}

	@Override
	public List<ReplyVO> showReplies(String user_id) {
		return mapper.showReplies(user_id);
	}

}
