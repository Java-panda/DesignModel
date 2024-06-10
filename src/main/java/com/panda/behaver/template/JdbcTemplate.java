package com.panda.behaver.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

class JdbcTemplate extends AbstractTemplate {

    private final DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection createConnection(){
        System.out.println("建立连接");
        return null;
    };

    public String parseSql(String sql,String ... params){
        System.out.println("parseSql jdbc实现");
        return null;
    };
    public Object query(String sql){
        System.out.println("query jdbc实现");
        return "jdbc 查询返回值";
    };
    public void close(){
        System.out.println("关闭资源");
    };
}
