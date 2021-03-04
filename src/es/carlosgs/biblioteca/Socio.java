package es.carlosgs.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private Integer numero;
    private String nombre;
    private String direccion;
    private String telefono;

    // "Los lectores pueden tener un máximo de 3 libros en préstamo."
    private List<Prestamo> prestamos = new ArrayList<>(3);
    private Multa sancion;

}
