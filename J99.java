import java.util.ArrayList;
import java.util.List;


class Course{

    private final String title;
    private final  List<String> topic = new ArrayList<>();

    Course(String title){
        this.title = title;
    }

    String getTitle(){
        return title;
    }

    void addTopic(String topics){
        topic.add(topics);
    }

    List<String> getTopicUnsafe(){
        return topic;
    }

    List<String> getTopicSafe(){
        return new ArrayList<>(topic);
    }

}

public class J99 {
    public static void main(String[] args) {
        Course c1 = new Course("JAVA");
        
        c1.addTopic("OOP");
        c1.addTopic("DSA");

        c1.getTopicUnsafe().add("HAcked");
        System.out.println("Unsafe: " + c1.getTopicUnsafe());


        Course c2 = new Course("Spring");
        
        c2.addTopic("Boot");
        c2.getTopicSafe().add("Hacked");
        System.out.println("Safe: " + c2.getTopicSafe());
    }
}
//Output:
//Unsafe: [OOP, DSA, HAcked]
//Safe: [Boot]