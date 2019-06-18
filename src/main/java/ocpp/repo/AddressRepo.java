package ocpp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ocpp.model.Address;


@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {

}
