package com.gcichina.utils;

import com.gcichina.bean.RouteStationData;
import com.gcichina.bean.TimeFragmentData;
import com.gcichina.bean.LimitConditionData;
import com.gcichina.bean.test1;

import java.sql.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.ResourceBundle;

import static com.gcichina.constant.message.*;


public class dbUtils {
    private String driver;
    private String url;
    private String user ;
    private String password ;
    private String batchsize ;
    private String database ;
    private String table;

    //读取resources/config目录下的application.properties
    private final static  ResourceBundle pro = ResourceBundle.getBundle(PROPERTIES_URL);
    public static Connection connection = null;

    public dbUtils() {
        driver=pro.getString(DRIVER);
        url=pro.getString(URL);
        user=pro.getString(USER);
        password=pro.getString(PASSWORD);
        batchsize=pro.getString(BATCH_SIZE);
        try {
            Properties properties = new Properties();
//            properties.setProperty(USER,user);
//            properties.setProperty(PASSWORD,password);
            properties.setProperty(BATCH_SIZE,batchsize);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, properties);

            if (!connection.isClosed()) {
                System.out.println("Open DB Connection success ! ");
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    // 时段数据集
    public  HashMap<Integer, TimeFragmentData> readFragmentData() {
        HashMap<Integer, TimeFragmentData> RowData = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(pro.getString(TIME_FRAGMENT_DATA_SQL));
            RowData = new HashMap<Integer, TimeFragmentData>();
            int index = 1;
            while (resultSet.next()) {
              String route_code = resultSet.getString(ROUTE_CODE);
              String begin_fragment = resultSet.getString(BEGIN_FRAGMENT);
              String end_fragment = resultSet.getString(END_FRAGMENT);
              String time_fragment = resultSet.getString(TIME_FRAGMENT);
              String time_fragment_triplog_number = resultSet.getString(TIME_FRAGMENT_AVG_TRIPLOG_NUMBER);
              String time_fragment_avg_triplog_time = resultSet.getString(TIME_FRAGMENT_AVG_TRIPLOG_TIME);
              String avg_interval_time = resultSet.getString(AVG_INTERVAL_TIME);
              String time_fragment_consumer_sum = resultSet.getString(TIME_FRAGMENT_CONSUMER_SUM);
              String time_fragment_consumer_max = resultSet.getString(TIME_FRAGMENT_CONSUMER_MAX);
              String capacity = resultSet.getString(CAPACITY);
              String consumer_percentage_max = resultSet.getString(CONSUMER_PERCENTAGE_MAX);
              String week_day = resultSet.getString(WEEK_DAY);
              String weekday_name = resultSet.getString(WEEKDAY_NAME);
              String pdate = resultSet.getString(PDATE);
                TimeFragmentData timeFragmentData = new TimeFragmentData(route_code,begin_fragment,end_fragment,
                        time_fragment,time_fragment_triplog_number,time_fragment_avg_triplog_time,avg_interval_time,time_fragment_consumer_sum,
                        time_fragment_consumer_max,capacity,consumer_percentage_max,week_day,weekday_name,pdate);
                RowData.put(index++, timeFragmentData);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RowData;
    }
    // 约束条件数据
    public  HashMap<Integer, LimitConditionData> readConditionData() {
        HashMap<Integer, LimitConditionData> RowData = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(pro.getString(LIMIT_CONDITION_SQL));
            RowData = new HashMap<Integer, LimitConditionData>();
            int index = 1;
            while (resultSet.next()) {
                LimitConditionData limitConditionData = new LimitConditionData(
                        resultSet.getString(ROUTE_NAME),
                        resultSet.getString(DIRECTION_NAME),
                        resultSet.getString(BEGIN_STATION_NAME),
                        resultSet.getString(END_STATION_NAME),
                        resultSet.getString(BUS_RECOVER_STATION_NAME),
                        resultSet.getString(BEGIN_BUS_INIT_NUMBER),
                        resultSet.getString(DAY_BEGIN_TIME),
                        resultSet.getString(DAY_END_TIME),
                        resultSet.getString(DAY_LATEST_TIME),
                        resultSet.getString(TRIP_INTERVAL_TIME),
                        resultSet.getString(DRIVE_WORK_TIME),
                        resultSet.getString(DRIVE_RUN_TIME),
                        resultSet.getString(DRIVE_REST_TIME),
                        resultSet.getString(DRIVE_TRIP_REST_TIME),
                        resultSet.getString(DRIVE_EAT_STATION_NAME),
                        resultSet.getString(DRIVE_REST_STATION_NAME),
                        resultSet.getString(BUS_CHARGE_STATION_NAME),
                        resultSet.getString(BUS_STOP_TIME),
                        resultSet.getString(TRIP_RUN_NUMBER),
                        resultSet.getString(TRIP_TYPE),
                        resultSet.getString(ACTIVITY_TYPE),
                        resultSet.getString(WEEK_DAY_FLAG)
                        );
                RowData.put(index++, limitConditionData);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RowData;
    }
    // 线路站点信息
    public  HashMap<Integer, RouteStationData> readRouteStationData() {
        HashMap<Integer, RouteStationData> RowData = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(pro.getString(ROUTE_STATION_SQL));
            RowData = new HashMap<Integer, RouteStationData>();
            int index = 1;
            while (resultSet.next()) {
                RouteStationData routeStationData = new RouteStationData(
                        resultSet.getString(STATION_ID) ,
                        resultSet.getString(STATION_ORDER) ,
                        resultSet.getString(ROUTE_CODE) ,
                        resultSet.getString(ROUTE_NAME) ,
                        resultSet.getString(STATION_NAME) ,
                        resultSet.getString(DIRECTION_NAME));
                RowData.put(index++, routeStationData);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RowData;
    }

    // 测试
    public  HashMap<Integer, test1> readtest() {
        HashMap<Integer, test1> RowData = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(pro.getString(TEST1_SQL));
            RowData = new HashMap<Integer, test1>();
            int index = 1;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                test1 test1 = new test1(id, name, age);
                RowData.put(index++, test1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RowData;
    }

}
