package com.gcichina.trigger;


import com.gcichina.bean.test1;

import java.sql.*;
import java.util.*;

public class wew {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:clickhouse://192.168.163.101:8123";
//        Class.forName("ru.yandex.clickhouse.ClickHouseDriver");
        Properties properties = new Properties();
        properties.setProperty("driver", "ru.yandex.clickhouse.ClickHouseDriver");
        properties.setProperty("database","lzj");
        properties.setProperty("batchsize","10000");
        Connection connection = DriverManager.getConnection(url, properties);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from test1");

        HashMap<Integer, test1> RowData = new HashMap<Integer, test1>();
        int index = 1;
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
            test1 test1 = new test1(id, name, age);
            RowData.put(index++, test1);
        }

        for (test1 temp : RowData.values()) {
            System.out.println(temp);
        }

    }
}
