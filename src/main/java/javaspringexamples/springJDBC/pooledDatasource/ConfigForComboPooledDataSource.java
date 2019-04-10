package javaspringexamples.springJDBC.pooledDatasource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Configuration
public class ConfigForComboPooledDataSource {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("org.h2.Driver");
		dataSource.setJdbcUrl("jdbc:h2:tcp://localhost/~/javaspringexamples");
		dataSource.setUser("sa");
		dataSource.setPassword("");
		return dataSource;
	}
}
