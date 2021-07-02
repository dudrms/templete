package com.comm.templete.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.comm.templete.vo.User;

@Mapper
public interface UserMapper {
	public List<User> listUser();
}