package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class appTest {
    @Test
    void shouldReturnI(){
        assertEquals("I", App.convert1ToI(1));
    }
    @Test
    void shouldReturnII(){
        assertEquals("I", App.convert1ToI(2));
    }
}
