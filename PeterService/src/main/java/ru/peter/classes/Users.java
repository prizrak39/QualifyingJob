package ru.peter.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prizrak on 26.03.2016.
 */
public class Users {

    private String name;
    private Integer point;
    private Integer maxPoint = 0;
    private Integer minPoint = 0;
    private List<String> listResult;

    public Users() {
        listResult = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public Integer getMinPoint() {
        return minPoint;
    }
}
