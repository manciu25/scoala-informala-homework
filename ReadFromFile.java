package com.java8.HW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class that reads from a file using stream
 */
public class ReadFromFile {

    public static List<Person> readingUsingStream(String fileName) throws IOException {

        List<Person> listPerson;

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            listPerson = stream.map(s -> s.split(","))
                    .collect(Collectors.mapping(p -> new Person(p[0], p[1], p[2]), Collectors.toList()));
        }
        return listPerson;
    }
}
