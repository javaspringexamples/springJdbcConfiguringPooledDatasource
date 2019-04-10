package javaspringexamples.springJDBC.pooledDatasource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) throws SQLException {
		// Instatiating for BasicDataSource
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ConfigForBasicDataSource.class);
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);

		Connection connection = dataSource.getConnection();
		System.out.println(connection.isClosed());
		connection.close();
		System.out.println(connection.isClosed());

		// Instatiating for ComboPooledDatasource
		applicationContext = new AnnotationConfigApplicationContext(ConfigForComboPooledDataSource.class);
		dataSource = applicationContext.getBean("dataSource", DataSource.class);

		connection = dataSource.getConnection();
		System.out.println(connection.isClosed());
		connection.close();
		System.out.println(connection.isClosed());
	}

}
