package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import entity.Item;

@RepositoryRestResource
public interface RatesRepository extends CrudRepository<Item ,Long>{
	
}
