public interface Subject {
    void agregarObservador(Observer o);
    void eliminarObservador(Observer o);
    void notificarObservadores(String mensaje);
}
