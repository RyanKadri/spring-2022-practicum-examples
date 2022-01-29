package org.example;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        var doc = Jsoup.connect("https://rk0.xyz/courses/cis1052-fall-2021").get();
        var tableCells = doc.select(".MuiTable-root tr td:nth-child(2)");
        var listOfCells = new ArrayList<>(tableCells);
        System.out.format("There are %d classes:\n", listOfCells.size());
        for(var cell: listOfCells) {
            System.out.println(cell.text());
        }
    }
}
