package com.goit.HW18.controller;

import com.goit.HW18.data.Note;
import com.goit.HW18.service.NoteResponse;
import com.goit.HW18.service.NoteService;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notes")
public class NoteController {
    private final NoteService noteService;

    @GetMapping("/getNotes")
    public List<Note> findAll() {

        return noteService.getNotes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note create(@RequestBody Note note) {

        return noteService.create(note);
    }
    @PatchMapping
    public Note update( @RequestBody Note  note) {

        return noteService.save(note);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            noteService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception ex) {

            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public Optional<Note> findById(@PathVariable Long id) throws Exception {

        return noteService.getById(id);
    }


}
