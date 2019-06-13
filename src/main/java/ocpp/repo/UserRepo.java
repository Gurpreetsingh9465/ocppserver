package ocpp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ocpp.model.User;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
	
}
