package com.xiaofeng.house.biz.mapper;

import com.xiaofeng.house.common.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

	public List<User> selectUsers();
	public int insert(User account);
	public int delete(String email);
	public int update(User updateUser);

	public List<User> selectUsersByQuery(User user);
}
