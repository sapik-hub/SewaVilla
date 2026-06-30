module com.example.sewavilla {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens ProjekAstra to javafx.fxml;
    exports ProjekAstra;
}