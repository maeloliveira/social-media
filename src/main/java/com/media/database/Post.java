package com.media.database;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_text")
    private String text;

    @Column(name = "date_time")
    private Integer dateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
