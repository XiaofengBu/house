package com.xiaofeng.house.mapper;

import com.xiaofeng.house.common.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

	public List<User> selectUsers();

}
