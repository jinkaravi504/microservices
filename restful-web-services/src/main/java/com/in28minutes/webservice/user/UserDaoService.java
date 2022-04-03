package com.in28minutes.webservice.user;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();

	private static Long usersCount = 3L;

	static {
		users.add(new User(1L, "Adam", 30));
		users.add(new User(2L, "Eve", 31));
		users.add(new User(3L, "Jack", 32));
	}

	public List<User> findAll() {
		return users;
	}

	public User findUser(Long id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

	

}
