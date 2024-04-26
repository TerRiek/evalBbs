package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {

	public List<EvalBbsDto> getList();
	public void writeDto(@Param("title") String title, @Param("content") String content, @Param("writer") String writer, @Param("regdate") String regdate);
}
