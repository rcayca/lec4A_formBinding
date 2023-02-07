package ca.sheridancollege.controllers;

import ca.sheridancollege.models.SongStorage;
import ca.sheridancollege.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {

        Song song = new Song();
        model.addAttribute("newSong", song);
        return "index";
    }

    @PostMapping("/addSong")
    public String addSong(@ModelAttribute Song song, Model model) {
        System.out.println(song);
        SongStorage.songList.add(song);
        model.addAttribute("songList", SongStorage.songList);
        return "songscollection";
    }
}
