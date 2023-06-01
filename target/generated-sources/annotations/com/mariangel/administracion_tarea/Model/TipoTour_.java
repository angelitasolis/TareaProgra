package com.mariangel.administracion_tarea.Model;

import com.mariangel.administracion_tarea.Model.Tour;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-01T00:17:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TipoTour.class)
public class TipoTour_ { 

    public static volatile SingularAttribute<TipoTour, String> ttPais;
    public static volatile SingularAttribute<TipoTour, Integer> ttCodigo;
    public static volatile SingularAttribute<TipoTour, String> ttTipo;
    public static volatile CollectionAttribute<TipoTour, Tour> tourCollection;
    public static volatile SingularAttribute<TipoTour, String> ttNombretour;

}