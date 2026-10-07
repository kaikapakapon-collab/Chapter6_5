module se233.Chapter6_5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens se233.Chapter6_5 to javafx.fxml;
    exports se233.Chapter6_5;
}