package com.company.practice16.src.main.java.ru.mirea.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "university_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20, unique = true)
    private String groupName;
    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private List<Student> students;
}
