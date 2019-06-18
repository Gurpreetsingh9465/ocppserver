package ocpp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ocpp.model.ChargeBox;


@Repository
public interface ChargeBoxRepo extends CrudRepository<ChargeBox,Integer> {

}
