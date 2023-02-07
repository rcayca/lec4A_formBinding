package ca.sheridancollege.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Song {
    private Long id;
    private String title;
    private String artist;
    private String genre;
    private final String[] genres = {"Spoken Word", "Electronic", "Classical", "Country"};

}
