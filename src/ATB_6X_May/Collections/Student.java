package ATB_6X_May.Collections;


import java.util.Comparator;

class  SortByIDAsc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getStudid(), o2.getStudid());
    }
}

class SortByIDDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getStudid(), o1.getStudid());
    }
}

class SortByNameAsc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}


public class Student implements Comparable<Student>{
    private Integer studid;
    private String name;

    public Student(Integer studid, String name) {
        this.studid = studid;
        this.name = name;
    }

    public Integer getStudid() {
        return studid;
    }

    public void setStudid(Integer studid) {
        this.studid = studid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{studid = "+this.studid+" | "+"name = "+this.name+"}";
    }

    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.studid,o.studid);
//    }

    public int compareTo(Student o) {
        return CharSequence.compare(this.name,o.name);
    }

}
