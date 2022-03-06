module com.example.vutbr.cz.oop.complexcaltulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencsv;


    opens com.example.vutbr.cz.oop.complexcalculator to javafx.fxml;
    exports com.example.vutbr.cz.oop.complexcalculator;
    exports com.example.vutbr.cz.oop.complexcalculator.ProgramRun;
    opens com.example.vutbr.cz.oop.complexcalculator.ProgramRun to javafx.fxml;
}