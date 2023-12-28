package gm.rh.servicio;

import gm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoById(Integer id);

    public Empleado guradarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
