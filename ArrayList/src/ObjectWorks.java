import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectWorks {
    String studentName;
    int age;
    String qualification;

    public ObjectWorks(String studentName, int age, String qualification) {
        this.studentName = studentName;
        this.age = age;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "ObjectWorks{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                '}';
    }

    public static void main(String[] args){
        ObjectWorks o1 = new ObjectWorks("santhosh",21,"btech");
        ObjectWorks o2 = new ObjectWorks("Sai charan",22,"btech");
        System.out.println(o1);
        List<Object> list = new ArrayList<>();
        list.add(o1);


    }
}
