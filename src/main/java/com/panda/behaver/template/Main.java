package com.panda.behaver.template;

public class Main {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(null);
        Object query = template.queryForObject("select * from user", "a", "b");

        System.out.println(query);
    }
}
