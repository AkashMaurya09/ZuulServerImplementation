package com.javatechie.spring.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	
	@RequestMapping("/topic")
	public List<topic> getAllTopics() {
		return topicService.getAllTopics();	
	}
	
	@RequestMapping("/topic/{id}")
	public topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public void addTopic(@RequestBody topic topic) {
		topicService.addTopic(topic);
	}
}
