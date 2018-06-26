package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoteTest {
    private Note note = new Note();
    private String text= "";
    private String textSummary;

    @Test
    public void ShouldByNoteClassExists(){
        assertNotNull(note);
    }

    @Test
    public void ShouldByReturnBlankGetSummary() {
        text = note.getSummary();
        assertEquals("", text);
    }

    @Test
    public void ShouldByReturnValueGetSummary(){
        text = "Hello World";

        note.setContent(text);

        textSummary = note.getSummary();

        assertEquals(text, textSummary);
    }

    @Test
    public void ShouldBySummaryLengthOrEqualsMinorFiveteen(){
        text = "Hello World......";

        note.setContent(text);

        textSummary = note.getSummary();

        assertEquals(15, textSummary.length());
    }

    @Test
    public void ShouldByNoteClone(){
        Note note = new Note();


    }

}