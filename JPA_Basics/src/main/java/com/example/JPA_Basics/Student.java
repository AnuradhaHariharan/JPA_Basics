package com.example.JPA_Basics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter// by default getters and setters will be public
@Setter
@Entity //tells Jpa this is a model class
public class Student {
    String name;
    String age;
    @Id
    int rollNo;
}

