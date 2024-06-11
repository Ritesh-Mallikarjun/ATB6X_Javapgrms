package ATB_6X_May.Collections;

import java.util.Comparator;

class SortByTIDAsc implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o1.getTeachId(), o2.getTeachId());
    }
}

class SortByTIDDesc implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o2.getTeachId(),o1.getTeachId());
    }
}

class SortByTNamsASC implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getTeacherName().compareTo(o2.getTeacherName());
    }
}

class SortByTNameDesc implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o2.getTeacherName().compareTo(o1.getTeacherName());
    }
}

public class Teacher implements Comparable<Teacher> {
    String teacherName;
    Integer teachId;

    public Teacher(String teacherName, Integer teachId) {
        this.teacherName = teacherName;
        this.teachId = teachId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    @Override
    public String toString() {
        return "{TeacherID: "+teachId+" - "+"TeacherName: "+teacherName+"}";
    }

    @Override
//    public int compareTo(Teacher o) {
//        return Integer.compare(this.teachId,o.teachId);
//    }

    public int compareTo(Teacher o){
        return  CharSequence.compare(this.teacherName,o.teacherName);
    }
}

