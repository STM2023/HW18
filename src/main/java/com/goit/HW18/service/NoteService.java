package com.goit.HW18.service;

import com.goit.HW18.data.Note;
import com.goit.HW18.data.NoteRepository;
//import com.goit.HW18.users.User;
//import com.goit.HW18.users.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private static final int MAX_TITLE_LENGTH = 100;
    private static final int MAX_CONTENT_LENGTH = 1000;


    private final NoteRepository noteRepository;



    public List<Note> getNotes(){
        //        log.info("---listAll");
        return noteRepository.findAll();
    }
    public Note create(Note note) {

        return noteRepository.save(note);
    }

        public void deleteById(long id)   {

        Note entity= noteRepository.getById(id);
        noteRepository.delete(entity);

    }
    public Note save( Note note) {

        return noteRepository.save(note);
    }
    public    Note getById(long id)  throws Exception {

        return noteRepository.getById(id);
    }

}


