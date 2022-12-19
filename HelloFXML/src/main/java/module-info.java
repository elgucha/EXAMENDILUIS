module com.mycompany.hellofxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ExamenDiLuis to javafx.fxml;
    exports com.mycompany.ExamenDiLuis;
}
