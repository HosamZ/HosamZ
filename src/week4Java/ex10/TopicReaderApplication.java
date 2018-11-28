package week4Java.ex10;
import week4Java.ex7.Topic;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {
    public static void main(String[] args) {
        TopicReader reader = new TopicReader();
        List<Topic> topicList = reader.getTopics("week4Java/ex10/topics");
        for (Topic topic : topicList) {
            System.out.println("Topic list: "+topic);
        }
        Set<Topic> topicSet = new HashSet<>(topicList);
        for (Topic topic : topicSet) {
            System.out.println("Topic set: "+topic);
        }
    }
}
