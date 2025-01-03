package ma.oumaimaezafa.crudwithcasandra.repository;

import ma.oumaimaezafa.crudwithcasandra.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CassandraRepository<Product,String> {
}
