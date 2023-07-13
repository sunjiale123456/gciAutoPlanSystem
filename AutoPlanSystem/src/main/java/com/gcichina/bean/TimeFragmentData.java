package com.gcichina.bean;

public class TimeFragmentData {
    private String route_code;
    private String begin_fragment;
    private String end_fragment ;
    private String time_fragment;
    private String time_fragment_triplog_number;
    private String time_fragment_avg_triplog_time;
    private String avg_interval_time;
    private String time_fragment_consumer_sum;
    private String time_fragment_consumer_max;
    private String capacity;
    private String consumer_percentage_max;
    private String week_day;
    private String weekday_name;
    private String pdate;

    public TimeFragmentData(String route_code,String begin_fragment, String end_fragment, String time_fragment, String time_fragment_triplog_number, String time_fragment_avg_triplog_time, String avg_interval_time, String consumer_percentage_max, String time_fragment_consumer_max, String capacity, String time_fragment_consumer_sum, String week_day, String weekday_name, String pdate) {
        this.route_code = route_code;
        this.begin_fragment=begin_fragment;
        this.end_fragment = end_fragment;
        this.time_fragment = time_fragment;
        this.time_fragment_triplog_number = time_fragment_triplog_number;
        this.time_fragment_avg_triplog_time = time_fragment_avg_triplog_time;
        this.avg_interval_time = avg_interval_time;
        this.consumer_percentage_max = consumer_percentage_max;
        this.time_fragment_consumer_max = time_fragment_consumer_max;
        this.capacity = capacity;
        this.time_fragment_consumer_sum = time_fragment_consumer_sum;
        this.week_day = week_day;
        this.weekday_name = weekday_name;
        this.pdate = pdate;
    }

    public String getRoute_code() {
        return route_code;
    }

    public void setRoute_code(String route_code) {
        this.route_code = route_code;
    }

    public String getEnd_fragment() {
        return end_fragment;
    }

    public void setEnd_fragment(String end_fragment) {
        this.end_fragment = end_fragment;
    }

    public String getTime_fragment() {
        return time_fragment;
    }

    public void setTime_fragment(String time_fragment) {
        this.time_fragment = time_fragment;
    }

    public String getTime_fragment_triplog_number() {
        return time_fragment_triplog_number;
    }

    public void setTime_fragment_triplog_number(String time_fragment_triplog_number) {
        this.time_fragment_triplog_number = time_fragment_triplog_number;
    }

    public String getTime_fragment_avg_triplog_time() {
        return time_fragment_avg_triplog_time;
    }

    public void setTime_fragment_avg_triplog_time(String time_fragment_avg_triplog_time) {
        this.time_fragment_avg_triplog_time = time_fragment_avg_triplog_time;
    }

    public String getAvg_interval_time() {
        return avg_interval_time;
    }

    public void setAvg_interval_time(String avg_interval_time) {
        this.avg_interval_time = avg_interval_time;
    }

    public String getconsumer_percentage_max() {
        return consumer_percentage_max;
    }

    public void setconsumer_percentage_max(String consumer_percentage_max) {
        this.consumer_percentage_max = consumer_percentage_max;
    }

    public String getTime_fragment_consumer_max() {
        return time_fragment_consumer_max;
    }

    public void setTime_fragment_consumer_max(String time_fragment_consumer_max) {
        this.time_fragment_consumer_max = time_fragment_consumer_max;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String gettime_fragment_consumer_sum() {
        return time_fragment_consumer_sum;
    }

    public void settime_fragment_consumer_sum(String time_fragment_consumer_sum) {
        this.time_fragment_consumer_sum = time_fragment_consumer_sum;
    }

    public String getWeek_day() {
        return week_day;
    }

    public void setWeek_day(String week_day) {
        this.week_day = week_day;
    }

    public String getWeekday_name() {
        return weekday_name;
    }

    public void setWeekday_name(String weekday_name) {
        this.weekday_name = weekday_name;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public String getBegin_fragment() {
        return begin_fragment;
    }

    public void setBegin_fragment(String begin_fragment) {
        this.begin_fragment = begin_fragment;
    }

    @Override
    public String toString() {
        return "TimeFragmentData{" +
                "route_code='" + route_code + '\'' +
                ", begin_fragment='" + begin_fragment + '\'' +
                ", end_fragment='" + end_fragment + '\'' +
                ", time_fragment='" + time_fragment + '\'' +
                ", time_fragment_triplog_number='" + time_fragment_triplog_number + '\'' +
                ", time_fragment_avg_triplog_time='" + time_fragment_avg_triplog_time + '\'' +
                ", avg_interval_time='" + avg_interval_time + '\'' +
                ", consumer_percentage_max='" + consumer_percentage_max + '\'' +
                ", time_fragment_consumer_max='" + time_fragment_consumer_max + '\'' +
                ", capacity='" + capacity + '\'' +
                ", time_fragment_consumer_sum='" + time_fragment_consumer_sum + '\'' +
                ", week_day='" + week_day + '\'' +
                ", weekday_name='" + weekday_name + '\'' +
                ", pdate='" + pdate + '\'' +
                '}';
    }
}
