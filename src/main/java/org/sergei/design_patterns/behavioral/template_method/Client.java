package org.sergei.design_patterns.behavioral.template_method;

import org.sergei.design_patterns.behavioral.template_method.exporter.DataExporter;
import org.sergei.design_patterns.behavioral.template_method.exporter.ExcelDataExporter;
import org.sergei.design_patterns.behavioral.template_method.exporter.PdfDataExporter;

/**
 * Created by Sergei on 10.09.2015.
 */
public class Client {
    public static void main(String[] args) {
        DataExporter excelExporter = new ExcelDataExporter();
        excelExporter.export();

        DataExporter pdfExporter = new PdfDataExporter();
        pdfExporter.export();
    }
}
