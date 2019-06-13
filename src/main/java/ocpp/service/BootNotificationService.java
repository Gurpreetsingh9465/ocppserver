package ocpp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocpp.model.User;
import ocpp.repo.UserRepo;

@Service
public class BootNotificationService {
	@Autowired
	private UserRepo userRepo;
	public User bootDevice(String id) {
		List<User> users = (List<User>) userRepo.findAll();
		System.out.println(users.toString());
		return users.get(0);
	}
	
}
