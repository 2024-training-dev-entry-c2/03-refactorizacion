package alojamientos;

public class Hotel extends Alojamiento implements IDiaDeSol{

    private DiaDeSolData diaDeSol;
    private Boolean servicioHabitacion;

    @Override
    public Double calcularPrecioBase() {
        return 0.0;
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public Boolean estaDisponible() {
        return true;
    }

    @Override
    public Boolean tieneDiaDeSol() {
        return true;
    }

    @Override
    public void mostrarInfoDiaDeSol() {

    }

    @Override
    public double calcularPrecioBaseDiaSol() {
        return 0;
    }

    public DiaDeSolData getDiaDeSol() {
        return diaDeSol;
    }

    public void setDiaDeSol(DiaDeSolData diaDeSol) {
        this.diaDeSol = diaDeSol;
    }

    public Boolean getServicioHabitacion() {
        return servicioHabitacion;
    }

    public void setServicioHabitacion(Boolean servicioHabitacion) {
        this.servicioHabitacion = servicioHabitacion;
    }
}