package es.carlosgs.biblioteca;

public class Multa {
    private Socio sancionado;

    private Integer sancion;

    public Integer getSancion() {
        return sancion;
    }

    public void setSancion(Integer sancion) {
        this.sancion = sancion;
    }

    public void calcularSancion() {
        Integer calculo = 0;
        // Recorrer los prestamos del socio y comprobar si en alguno ha vencido la fecha
        // por cada día

        setSancion(calculo);
    }
}
