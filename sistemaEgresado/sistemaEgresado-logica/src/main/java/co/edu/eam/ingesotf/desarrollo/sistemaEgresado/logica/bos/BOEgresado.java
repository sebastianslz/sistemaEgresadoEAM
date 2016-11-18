package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOEgresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOEgresado;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.Excepcion.ExcepcionNegocio;

public class BOEgresado {

    IDAOEgresado daoEgresado;

    public BOEgresado() {
        daoEgresado = new DAOEgresado();
    }

    /**
     * Busca un egresado
     *
     * @param codigo del egresado que se va buscar
     * @return un egresado de lo contrario nulll
     * @throws Exception
     */
    public Egresado buscar(int codigo) throws Exception {
        return daoEgresado.buscar(codigo);
    }

    /**
     * Logica de registrar un egresado
     *
     * @param egresado el cual se va registrar
     * @throws Exception
     */
    public void crearEgresado(Egresado egresado, InformacionAcademica infor) throws Exception {
        Egresado egresadoo = daoEgresado.buscar(egresado.getCodigoEgresado());
        if (egresadoo != null) {
            throw new ExcepcionNegocio("El egresado ya existe");
        } else {
            daoEgresado.crear(egresado, infor);
        }
    }
}
