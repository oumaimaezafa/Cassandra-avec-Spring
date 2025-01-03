package ma.oumaimaezafa.crudwithcasandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "ma.oumaimaezafa.crudwithcasandra.repository")
public class CrudWithCasandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWithCasandraApplication.class, args);
	}

}
