package TemplateMethod;

public class TestTemplateMethod {

    public static void main(String[] args) {
        DataProcessor dataProcessor = new ExcelFile();
        dataProcessor.readProcessAndSave();

        dataProcessor = new TextFile();
        dataProcessor.readProcessAndSave();
    }
}
