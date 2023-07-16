package com.gcichina.bean;

public class RouteStationData {
    private String station_id ;
    private String station_order ;
    private String route_code ;
    private String route_name ;
    private String station_name ;
    private String direction ;

    public RouteStationData(String station_id, String station_order, String route_code, String route_name, String station_name, String direction) {
        this.station_id = station_id;
        this.station_order = station_order;
        this.route_code = route_code;
        this.route_name = route_name;
        this.station_name = station_name;
        this.direction = direction;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getStation_order() {
        return station_order;
    }

    public void setStation_order(String station_order) {
        this.station_order = station_order;
    }

    public String getRoute_code() {
        return route_code;
    }

    public void setRoute_code(String route_code) {
        this.route_code = route_code;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "RouteStationData{" +
                "station_id='" + station_id + '\'' +
                ", station_order='" + station_order + '\'' +
                ", route_code='" + route_code + '\'' +
                ", route_name='" + route_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
