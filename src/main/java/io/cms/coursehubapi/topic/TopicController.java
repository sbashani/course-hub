package io.cms.coursehubapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;
    @RequestMapping("topics")
    public List<Topic> getTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/topics")
    public void createTopic(@RequestBody Topic topic){
        topicService.createTopic(topic);
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id) { return topicService.getTopic(id); }

    @RequestMapping(method = RequestMethod.PUT, path = "topics")
    public void updateTopic(@RequestBody Topic topic) { topicService.updateTopic(topic); }

    @RequestMapping(method = RequestMethod.DELETE, path = "topics/{id}")
    public void updateTopic(@PathVariable String id) { topicService.deleteTopic(id); }

}
