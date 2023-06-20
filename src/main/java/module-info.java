module com.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    
    opens com.project.inventory to javafx.fxml;
    exports com.project.inventory;
}
