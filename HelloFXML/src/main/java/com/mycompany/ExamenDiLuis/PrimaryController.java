package com.mycompany.ExamenDiLuis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {
    @FXML
    public Button btnAdd;
    public TextField Nombre;
    public ComboBox Sexo;
    public Spinner Edad;
    public Spinner Peso;
    public Spinner Altura;
    public ComboBox Actividad;
    public TableColumn cNombre;
    public TableColumn cSexo;
    public TableColumn cEdad;
    public TableColumn cPeso;
    public TableColumn cAltura;
    public TableColumn cActividad;
    public TableColumn cGer;
    public TableColumn cGET;
    @FXML
    private TableView Tabla;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Sexo.getItems().addAll("Hombre", "Mujer");
        Actividad.getItems().addAll("Muy ligera", "Ligera", "Moderada", "Intensa");

        cNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        cActividad.setCellValueFactory(new PropertyValueFactory<>("actividad"));
        cAltura.setCellValueFactory(new PropertyValueFactory<>("altura"));
        cEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        cSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        cPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        cGer.setCellValueFactory(new PropertyValueFactory<>("ger"));
        cGET.setCellValueFactory(new PropertyValueFactory<>("get"));

        btnAdd.onMouseClickedProperty().set(event -> {
            Persona persona = new Persona(Nombre.getText(),
                    Sexo.getValue().toString(),
                    (Integer) Edad.getValue(),
                    (Double) Peso.getValue(),
                    (Integer) Altura.getValue(),
                    Actividad.getValue().toString());
            fillTable(persona);

            Nombre.clear();
            Sexo.setValue(null);
            Edad.getValueFactory().setValue(1);
            Altura.getValueFactory().setValue(160);
            Peso.getValueFactory().setValue(50.0);


            System.out.println(persona);
        }
        );

    }
    public void fillTable(Persona persona){
        Tabla.getItems().add(persona);
    }


    }



