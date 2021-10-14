module com.mycompany.week7_picture_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week7_picture_app to javafx.fxml;
    exports com.mycompany.week7_picture_app;
}
