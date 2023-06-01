package com.mariangel.administracion_tarea.Model;

import com.mariangel.administracion_tarea.Model.Empresa;
import com.mariangel.administracion_tarea.Model.Itinerario;
import com.mariangel.administracion_tarea.Model.Reserva;
import com.mariangel.administracion_tarea.Model.TipoTour;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-01T00:17:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Tour.class)
public class Tour_ { 

    public static volatile SingularAttribute<Tour, String> trsNombre;
    public static volatile SingularAttribute<Tour, String> trsCodigotour;
    public static volatile SingularAttribute<Tour, Integer> trsCostotour;
    public static volatile SingularAttribute<Tour, Short> trsHorallegada;
    public static volatile SingularAttribute<Tour, Short> trsHorasalida;
    public static volatile CollectionAttribute<Tour, Itinerario> itinerarioCollection;
    public static volatile SingularAttribute<Tour, TipoTour> trsTipotourcodigo;
    public static volatile CollectionAttribute<Tour, Reserva> reservaCollection;
    public static volatile SingularAttribute<Tour, Date> trsFechasalida;
    public static volatile SingularAttribute<Tour, Integer> trsCantidadclientes;
    public static volatile SingularAttribute<Tour, Empresa> trsEmpresacedjur;
    public static volatile SingularAttribute<Tour, Date> trsFechallegada;

}