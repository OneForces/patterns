package com.company.practice16.src.main.java.ru.mirea.dto;

import org.springframework.stereotype.Component;
import com.company.practice16.src.main.java.ru.mirea.models.Group;
import com.company.practice16.src.main.java.ru.mirea.models.Student;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DtoConverter {
    public List<StudentResponse> toStudentResponseList(List<Student> students) {
        return students.stream().map(student -> {
            StudentResponse response = new StudentResponse();
            response.setId(student.getId());
            response.setFirstName(student.getFirstName());
            response.setLastName(student.getLastName());
            response.setMiddleName(student.getMiddleName());
            return response;
        }).collect(Collectors.toList());
    }

    public GroupResponse toGroupResponse(Group group) {
        GroupResponse response = new GroupResponse();
        response.setId(group.getId());
        response.setGroupName(group.getGroupName());
        response.setStudents(toStudentResponseList(group.getStudents()));
        return response;
    }

    public List<GroupResponse> toGroupResponseList(List<Group> groups) {
        return groups.stream()
                .map(this::toGroupResponse)
                .collect(Collectors.toList());
    }
}
