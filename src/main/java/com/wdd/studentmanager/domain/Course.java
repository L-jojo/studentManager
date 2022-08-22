package com.wdd.studentmanager.domain;

/**
 * @Classname Course
 * @Description None
 * @Date 2019/6/29 20:06
 * @Created by WDD
 */
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String course_Date;
    private int selected_Num;//已选人数
    private int max_Num = 50;//课程最大选课人数
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseDate() {
        return course_Date;
    }

    public void setCourseDate(String courseDate) {
        this.course_Date = courseDate;
    }

    public int getSelectedNum() {
        return selected_Num;
    }

    public void setSelectedNum(int selectedNum) {
        this.selected_Num = selectedNum;
    }

    public int getMaxNum() {
        return max_Num;
    }

    public void setMaxNum(int maxNum) {
        this.max_Num = maxNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                ", courseDate='" + course_Date + '\'' +
                ", selectedNum=" + selected_Num +
                ", maxNum=" + max_Num +
                ", info='" + info + '\'' +
                '}';
    }
}
