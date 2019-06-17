
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocpp.essential.IdTagInfo;
import ocpp.essential.Status.Authorization;
import ocpp.model.User;
import ocpp.repo.UserRepo;

@Service
public class AuthorizeService {
	
	@Autowired
	private IdTagInfo idTagInfo;
	private UserRepo userRepo;
	public Authorization authorizeUser(String idTag) {
		/*check in database for user*/
		List<User> users = (List<User>) userRepo.findAll();
		System.out.println(users.toString());
		return idTagInfo;.getStatus();
		
	}
}
