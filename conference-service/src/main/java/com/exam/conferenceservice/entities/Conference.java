package com.exam.conferenceservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Conference {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String type; // academic or commercial
        private Date date;
        private Integer duration;
        private Integer registeredCount;
        private Double score;

        @OneToMany(cascade = CascadeType.ALL)
        List<Review> reviews = new ArrayList<>();
        public List<Review> getReviews() {
                return reviews;
        }
        public void setReviews(List<Review> reviews) {
                this.reviews = reviews;
        }
}
