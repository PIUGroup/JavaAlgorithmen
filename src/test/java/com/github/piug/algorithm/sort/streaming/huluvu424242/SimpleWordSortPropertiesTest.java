package com.github.piug.algorithm.sort.streaming.huluvu424242;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import net.jqwik.api.ForAll;
import net.jqwik.api.Label;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import org.junit.jupiter.api.Assertions;


class SimpleWordSortPropertiesTest {


    @Property
    @Label("Die sortierte Liste enthält noch alle Wörter (auch doppelte) der Unsortierten.")
    @Tag("pbt")
    public void containsSameElements(@ForAll String[] initialArray) {

        final SimpleWordSort sortAlgorithm = new SimpleWordSort(initialArray);
        final String[] sortedArray = sortAlgorithm.sort();

        // Prüfe, dass die Arrays gleich lang sind (Doppelte weiter mit drin)
        Assertions.assertEquals(sortedArray.length, initialArray.length);
        // Prüfe, dass das die Sortierung auf einer Kopie erfolgte
        Assertions.assertNotSame(initialArray, sortedArray);
        // Prüfe, dass alle Elemente noch enthalten sind
        final Set<String> allElements = Arrays.stream(initialArray).collect(Collectors.toSet());
        Arrays.stream(sortedArray).forEach((element) -> {
            Assertions.assertTrue(allElements.contains(element));
        });

    }


    static class StringWrapper {
        public String value = "";
    }

    @Property
    @Label("Die sortierte Wortliste ist lexikographisch aufsteigend sortiert aber nicht strikt.")
    @Tag("pbt")
    public void aufsteigendSortiert(@ForAll String[] initialArray) {

        final SimpleWordSort sortAlgorithm = new SimpleWordSort(initialArray);
        final String[] sortedArray = sortAlgorithm.sort();

        final StringWrapper vorgaenger = new StringWrapper();
        Arrays.stream(sortedArray).forEach((element) -> {
            Assertions.assertTrue(vorgaenger.value.compareTo(element) < 1);
            vorgaenger.value = element;
        });

    }

}