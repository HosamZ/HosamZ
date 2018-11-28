package week4Java.ex10;
import week4Java.ex7.Topic;
import week4Java.ex9.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TopicReader {

    private FileReader reader = new FileReader();

    public List<Topic> getTopics(String filePath)
    {
        List<Topic> topics = new ArrayList<>();
        List<String> lines = reader.asLines(filePath);
        for (String line : lines) {
            Topic topic = new Topic(line);
            topics.add(topic);

        }
        return topics;
    }

}
