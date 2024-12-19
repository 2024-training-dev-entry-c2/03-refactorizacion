package habitaciones;

public class Habitacion {

    String tipo;
    String descripcion;
    Double precioPorNoche;
    Integer HabitacionesDisponibles;
    Integer capacidad;


    public Habitacion(String tipo, String descripcion, Integer capacidad, Integer habitacionesDisponibles, Double precioPorNoche) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.capacidad = capacidad; //numero de personas
        HabitacionesDisponibles = habitacionesDisponibles;
        this.precioPorNoche = precioPorNoche; //en pesos colombianos
    }


    public void mostrarDetalles(){
        System.out.println("=== Habitación " + this.tipo + " ===");
        System.out.println("Características: " + this.descripcion);
        System.out.println("capacidad: " + this.capacidad+"personas");
        System.out.println("Precio: $" + this.precioPorNoche);
        System.out.println("--------------------------------");
    }

    public boolean estaDisponible(){
        return  true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(Double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public Integer getHabitacionesDisponibles() {
        return HabitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(Integer habitacionesDisponibles) {
        HabitacionesDisponibles = habitacionesDisponibles;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}