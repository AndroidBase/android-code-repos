package xyz.anduo.chat.dao;

import java.util.ArrayList;

import xyz.anduo.chat.common.bean.User;

public interface UserDao {
	// 注册成功返回用户id
	public int register(User u);

	public ArrayList<User> login(User u);

	public ArrayList<User> refresh(int id);

	public void logout(int id);
}
