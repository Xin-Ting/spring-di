package org.example.domain;

import java.util.List;
import java.util.Map;

/**
 * @author 85217
 */
public class Teacher {
    private List<String> hobby;
    private List<Student> students;
    private Map<String, Student> maps;
    private Map<String, List<Student>> mapps;

    public void show() {
        //展示上面所有的属性
        System.out.println(hobby);
        System.out.println(students);
        System.out.println(maps);
        System.out.println(mapps);
    }

    public Teacher(List<String> hobby, List<Student> students, Map<String, Student> maps, Map<String, List<Student>> mapps) {
        this.hobby = hobby;
        this.students = students;
        this.maps = maps;
        this.mapps = mapps;
    }
}
