package sistema.captura.conexao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {

    private JdbcTemplate conexaoMySql;

    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jarIndividual");
        dataSource.setUsername("root");
        dataSource.setPassword("rabello");

        conexaoMySql = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoMySql() {
        return conexaoMySql;
    }
}
