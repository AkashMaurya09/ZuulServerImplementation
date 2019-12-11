package com.javatechie.spring.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<topic> topics = Arrays.asList(
			new topic("spring", "Spring framework", "Spring framework description"),
			new topic("java", "core Java", "Spring  description"),
			new topic("javascript", "Script framework", " framework description")
			);
	
	public List<topic> getAllTopics() {
		return topics;
	}
	
	public topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(topic topic) {
		topics.add(topic);
		
	}
			

}
