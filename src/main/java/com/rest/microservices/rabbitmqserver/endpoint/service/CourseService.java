package com.rest.microservices.rabbitmqserver.endpoint.service;

import com.rest.microservices.rabbitmqserver.endpoint.sender.CourseSender;
import com.rest.microservices.rabbitmqserver.model.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseSender courseSender;

    public void save(Course course) {
        courseSender.insertSend(course);
    }
}