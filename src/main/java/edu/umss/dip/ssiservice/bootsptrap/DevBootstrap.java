/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.bootsptrap;

import edu.umss.dip.ssiservice.model.*;
import edu.umss.dip.ssiservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AccidenteOcurridoRepository accidenteOcurridoRepository;
    @Autowired
    private AccidenteRepository accidenteRepository;
    @Autowired
    private ActividadEjecutadaRepository actividadEjecutadaRepository;
    @Autowired
    private ActividadPlanificadaRepository actividadPlanificadaRepository;
    @Autowired
    private ActividadRepository actividadRepository;
    @Autowired
    private EjecucionRepository ejecucionRepository;
    @Autowired
    private NormaSeguridadRepository normaSeguridadRepository;
    @Autowired
    private NormaSeguridadItemRepository normaSeguridadItemRepository;
    @Autowired
    private PlanificacionRepository planificacionRepository;
    @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public DevBootstrap(
            AccidenteOcurridoRepository accidenteOcurridoRepository,
            AccidenteRepository accidenteRepository,
            ActividadEjecutadaRepository actividadEjecutadaRepository,
            ActividadPlanificadaRepository actividadPlanificadaRepository,
            ActividadRepository actividadRepository,
            EjecucionRepository ejecucionRepository,
            NormaSeguridadRepository normaSeguridadRepository,
            NormaSeguridadItemRepository normaSeguridadItemRepository,
            PlanificacionRepository planificacionRepository,
            ProyectoRepository proyectoRepository,
            TrabajadorRepository trabajadorRepository
    ) {
        this.actividadRepository = actividadRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Accidente accidente1 = new Accidente();
        accidente1.setNombre("Caida de altura media");
        accidente1.setDescripcion("El empleado se cae de una altura mayor a 10mts");
        accidente1.setSeveridad(Severidad.Alta);
        accidente1.setTipo(AccidenteTipo.AccidenteDePersonal);

        Accidente accidente2 = new Accidente();
        accidente2.setNombre("Caida de gran altura");
        accidente2.setDescripcion("El empleado se cae de una altura mayor a 100mts");
        accidente2.setSeveridad(Severidad.Critica);
        accidente2.setTipo(AccidenteTipo.Fatalidad);

        Accidente accidente3 = new Accidente();
        accidente3.setNombre("Intoxicacion");
        accidente3.setDescripcion("El empleado se intoxica con los quimicos de pintura");
        accidente3.setSeveridad(Severidad.Media);
        accidente3.setTipo(AccidenteTipo.AccidenteDePersonal);

        Accidente accidente4 = new Accidente();
        accidente4.setNombre("Resbalon en piso mojado");
        accidente4.setDescripcion("El empleado se resbala debido a malas condiciones del piso");
        accidente4.setSeveridad(Severidad.Baja);
        accidente4.setTipo(AccidenteTipo.Incidente);

        NormaSeguridad normaSeguridad1 = new NormaSeguridad();
        normaSeguridad1.setTitulo("Norma pintura");
        normaSeguridad1.setDescripcion("Norma de seguridad para pintura de pared");
        NormaSeguridadItem normaSeguridadItem1 = new NormaSeguridadItem();
        normaSeguridadItem1.setNombre("Uso de guantes");
        normaSeguridadItem1.setNormaSeguridad(normaSeguridad1);
        NormaSeguridadItem normaSeguridadItem2 = new NormaSeguridadItem();
        normaSeguridadItem2.setNombre("Uso de respirador");
        normaSeguridadItem2.setNormaSeguridad(normaSeguridad1);

        NormaSeguridad normaSeguridad2 = new NormaSeguridad();
        normaSeguridad2.setTitulo("Norma construccion balcones");
        normaSeguridad2.setDescripcion("Norma de seguridad para la construccion de balcones");
        NormaSeguridadItem normaSeguridadItem21 = new NormaSeguridadItem();
        normaSeguridadItem21.setNombre("Uso de casco");
        normaSeguridadItem21.setNormaSeguridad(normaSeguridad2);
        NormaSeguridadItem normaSeguridadItem22 = new NormaSeguridadItem();
        normaSeguridadItem22.setNombre("Uso de arnez");
        normaSeguridadItem22.setNormaSeguridad(normaSeguridad2);

        NormaSeguridad normaSeguridad3 = new NormaSeguridad();
        normaSeguridad3.setTitulo("Norma cementado pared");
        normaSeguridad3.setDescripcion("Norma de seguridad para el cementado de pareded");
        NormaSeguridadItem normaSeguridadItem31 = new NormaSeguridadItem();
        normaSeguridadItem31.setNombre("Uso de arnez");
        normaSeguridadItem31.setNormaSeguridad(normaSeguridad3);

        Actividad actividad1 = new Actividad();
        actividad1.setNombre("Pintura de pared");
        actividad1.setNormaSeguridad(normaSeguridad1);
        actividad1.setAccidentes(new ArrayList<Accidente>() {{
            add(accidente3); add(accidente4);
        }});

        Actividad actividad2 = new Actividad();
        actividad2.setNombre("Construccion balcones");
        actividad2.setNormaSeguridad(normaSeguridad2);
        actividad2.setAccidentes(new ArrayList<Accidente>() {{
            add(accidente1);
        }});

        Actividad actividad3 = new Actividad();
        actividad3.setNombre("Cementado de pared");
        actividad3.setNormaSeguridad(normaSeguridad3);
        actividad2.setAccidentes(new ArrayList<Accidente>() {{
            add(accidente2);
        }});

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Construccion vivienda social");
        proyecto.setDescripcion("Construccion vivienda social para personas que viven en la calle");

        Planificacion planificacion = new Planificacion();
        planificacion.setProyecto(proyecto);

        ActividadPlanificada actividadPlanificada1 = new ActividadPlanificada();
        actividadPlanificada1.setPlanificacion(planificacion);
        actividadPlanificada1.setActividad(actividad1);

        ActividadPlanificada actividadPlanificada2 = new ActividadPlanificada();
        actividadPlanificada2.setPlanificacion(planificacion);
        actividadPlanificada2.setActividad(actividad2);

        ActividadPlanificada actividadPlanificada3 = new ActividadPlanificada();
        actividadPlanificada3.setPlanificacion(planificacion);
        actividadPlanificada3.setActividad(actividad3);

        Ejecucion ejecucion = new Ejecucion();
        ejecucion.setPlanificacion(planificacion);

        ActividadEjecutada actividadEjecutada1 = new ActividadEjecutada();
        actividadEjecutada1.setActividadPlanificada(actividadPlanificada1);
        actividadEjecutada1.setEjecucion(ejecucion);

        ActividadEjecutada actividadEjecutada2 = new ActividadEjecutada();
        actividadEjecutada2.setActividadPlanificada(actividadPlanificada2);
        actividadEjecutada2.setEjecucion(ejecucion);

        ActividadEjecutada actividadEjecutada3 = new ActividadEjecutada();
        actividadEjecutada3.setActividadPlanificada(actividadPlanificada3);
        actividadEjecutada3.setEjecucion(ejecucion);

        this.accidenteRepository.save(accidente1);
        this.accidenteRepository.save(accidente2);
        this.accidenteRepository.save(accidente3);
        this.accidenteRepository.save(accidente4);

        this.normaSeguridadRepository.save(normaSeguridad1);
        this.normaSeguridadRepository.save(normaSeguridad2);
        this.normaSeguridadRepository.save(normaSeguridad3);

        this.normaSeguridadItemRepository.save(normaSeguridadItem1);
        this.normaSeguridadItemRepository.save(normaSeguridadItem2);
        this.normaSeguridadItemRepository.save(normaSeguridadItem21);
        this.normaSeguridadItemRepository.save(normaSeguridadItem22);
        this.normaSeguridadItemRepository.save(normaSeguridadItem31);

        this.actividadRepository.save(actividad1);
        this.actividadRepository.save(actividad2);
        this.actividadRepository.save(actividad3);

        this.proyectoRepository.save(proyecto);
        this.planificacionRepository.save(planificacion);
        this.actividadPlanificadaRepository.save(actividadPlanificada1);
        this.actividadPlanificadaRepository.save(actividadPlanificada2);
        this.actividadPlanificadaRepository.save(actividadPlanificada3);

        this.ejecucionRepository.save(ejecucion);
        this.actividadEjecutadaRepository.save(actividadEjecutada1);
        this.actividadEjecutadaRepository.save(actividadEjecutada2);
        this.actividadEjecutadaRepository.save(actividadEjecutada3);
    }
}

