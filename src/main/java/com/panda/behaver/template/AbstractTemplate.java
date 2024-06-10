package com.panda.behaver.template;

import javax.sql.DataSource;
import java.sql.Connection;

abstract class AbstractTemplate {
    public final Object queryForObject(String sql,String ... params){
        Connection connection = createConnection();
        String parsedSql = parseSql(sql, params);
        Object queryObject = query(parsedSql);
        close();
        return queryObject;
    }
    abstract Connection createConnection();

    abstract String parseSql(String sql,String ... params);
    abstract Object query(String sql);
    abstract void close();
}
