package com.pdf;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

import java.util.List;

public class SplittingPDF {
    public static void main(String[] args) throws IOException {

        //Loading an existing PDF document
        File file = new File("C:\\Users\\FATCA_CRS_23 April 2023.pdf");
        PDDocument doc = PDDocument.load(file);

        //Instantiating Splitter class
        Splitter splitter = new Splitter();
        splitter.setSplitAtPage(4);//takes after 4th page or may be uses index 0

        //splitting the pages of a PDF document
        List<PDDocument> Pages = splitter.split(doc);

        Pages.get(0).save("C:\\Users\\FATCA_CRS_23 April 2023_till_4.pdf");
        Pages.get(0).save("C:\\Users\\FATCA_CRS_23 April 2023_after_4.pdf");

        System.out.println("PDF splitted");
    }
}