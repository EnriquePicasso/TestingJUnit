package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar una lista de tareas.
 */
public class GestorDeTareasDiego {

    private List<Tarea> tareas;

    /**
     * Constructor de la clase GestorDeTareasDiego.
     */
    public GestorDeTareasDiego() {
        this.tareas = new ArrayList<>();
    }

    /**
     * Método para agregar una nueva tarea.
     * 
     * @param descripcion Descripción de la nueva tarea.
     */
    public void agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
    }

    /**
     * Método para eliminar una tarea por su índice.
     * 
     * @param indice Índice de la tarea a eliminar.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Método para actualizar la descripción de una tarea.
     * 
     * @param indice Índice de la tarea a actualizar.
     * @param nuevaDescripcion Nueva descripción de la tarea.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public void actualizarTarea(int indice, String nuevaDescripcion) {
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tarea = tareas.get(indice);
            tarea.setDescripcion(nuevaDescripcion);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Método para marcar una tarea como completada.
     * 
     * @param indice Índice de la tarea a completar.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tarea = tareas.get(indice);
            tarea.setCompletada(true);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Método para obtener la lista de tareas pendientes.
     * 
     * @return Lista de tareas pendientes.
     */
    public List<Tarea> obtenerTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }

    /**
     * Clase interna para representar una tarea.
     */
    private class Tarea {
        private String descripcion;
        private boolean completada;

        /**
         * Constructor de la clase Tarea.
         * 
         * @param descripcion Descripción de la tarea.
         */
        public Tarea(String descripcion) {
            this.descripcion = descripcion;
            this.completada = false;
        }

        /**
         * Método para obtener la descripción de la tarea.
         * 
         * @return Descripción de la tarea.
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Método para establecer la descripción de la tarea.
         * 
         * @param descripcion Nueva descripción de la tarea.
         */
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        /**
         * Método para verificar si la tarea está completada.
         * 
         * @return true si la tarea está completada, false en caso contrario.
         */
        public boolean isCompletada() {
            return completada;
        }

        /**
         * Método para marcar la tarea como completada.
         * 
         * @param completada Estado de la tarea (true si está completada, false en caso contrario).
         */
        public void setCompletada(boolean completada) {
            this.completada = completada;
        }
    }
}

