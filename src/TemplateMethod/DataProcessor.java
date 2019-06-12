package TemplateMethod;

public abstract class DataProcessor {

    public void readProcessAndSave() {
        readData();
        processData();
        saveData();
    }

    public abstract void readData();

    public abstract void processData();

    public void saveData() {
        System.out.println("Save data to database");
    }
}
