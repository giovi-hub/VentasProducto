module com.example.ventasproducto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ventasproducto to javafx.fxml;
    exports com.example.ventasproducto;
}