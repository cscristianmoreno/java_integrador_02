package repositorio.cuentas;

import java.sql.ResultSet;
<<<<<<< HEAD
import java.sql.SQLException;

public interface CuentasRepositorio<T> {

    public void crearCuenta(T cuenta) throws SQLException;

    public void eliminarCuenta(int id) throws SQLException;

    public void aumentarDinero(int id, int monto) throws SQLException;

    public void retirarDinero(int id, int monto) throws SQLException;

    public ResultSet obtenerTodasLasCuentas() throws SQLException;

    public ResultSet obtenerPorDni(String dni) throws SQLException;

    public void crearTransaccion(int cuentaOrigen, int cuentaDestino, String tipo, int saldo, int monto) throws SQLException;

    public ResultSet obtenerTodasLasTransacciones() throws SQLException;
=======

import excepciones.Excepciones;

public interface CuentasRepositorio<T> {

    public void crearCuenta(T cuenta) throws Excepciones;

    public void eliminarCuenta(int id) throws Excepciones;

    public void aumentarDinero(int id, int monto) throws Excepciones;

    public void retirarDinero(int id, int monto) throws Excepciones;

    public ResultSet obtenerTodasLasCuentas() throws Excepciones;

    public ResultSet obtenerPorDni(String dni) throws Excepciones;

    public void crearTransaccion(int cuentaOrigen, int cuentaDestino, String tipo, int saldo, int monto) throws Excepciones;

    public ResultSet obtenerTodasLasTransacciones() throws Excepciones;
>>>>>>> cristian-moreno
}
