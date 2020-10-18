package com.github.piug.algorithm.sort.streaming.huluvu424242;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SimpleWordSortTest {

    @Test
    @DisplayName("Wird statt einem Array null übergeben, wird eine IllegalArgumentException geworfen.")
    public void sortNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            new SimpleWordSort(null);
        });
    }

    @Test
    @DisplayName("Leeres Array wird korrekt verarbeitet.")
    public void sortEmptyArray() {
        // prepare
        final String[] words = new String[0];
        final SimpleWordSort simpleWordSort = new SimpleWordSort(words);

        // duration
        final String[] sortedWords = simpleWordSort.sort();

        // Es wurde nicht null zurück gegeben
        assertNotNull(sortedWords);
        // Es wurde nicht auf dem Original Array sortiert
        assertNotSame(words, sortedWords);
    }


    @Test
    @DisplayName("Einfache Wortliste sortieren")
    public void sortSimpleWortlist() {
        // prepare
        final String[] words = {"Berta","Charlie","Anna","Bravo" };
        final SimpleWordSort simpleWordSort = new SimpleWordSort(words);

        // duration
        final String[] sortedWords = simpleWordSort.sort();

        // Es wurde nicht null zurück gegeben
        assertNotNull(sortedWords);
        // Es wurde nicht auf dem Original Array sortiert
        assertNotSame(words, sortedWords);
        // Erwartete Sortierung
        final String[] expectedWords = {"Anna","Berta","Bravo","Charlie"};
        assertArrayEquals(expectedWords,sortedWords);
    }

}