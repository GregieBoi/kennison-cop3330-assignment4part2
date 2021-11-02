module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires org.junit.jupiter.api;

    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}