package javaspringexamples.springJDBC.pooledDatasource;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Configuration
public class ConfigForBasicDataSource {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/javaspringexamples");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
}
