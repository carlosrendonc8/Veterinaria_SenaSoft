package veterinariaSenaSoftbackend.WebApi.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import veterinariaSenaSoftbackend.WebApi.InterfazVeterianriaWebApi;
import veterinariaSenaSoftbackend.commons.Endpoints.InterfaceEndpointsVeterinaria;
import veterinariaSenaSoftbackend.commons.Entity.CitasVeterinariaEntity;
import veterinariaSenaSoftbackend.service.implement.VeterinariaService;


@RestController
@RequestMapping (InterfaceEndpointsVeterinaria.URL_BASE_VETERINARIA)
public class VeterinariaWebApi implements InterfazVeterianriaWebApi {

    private final VeterinariaService veterinariaService;

    public VeterinariaWebApi(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

    @Override
    public ResponseEntity<?> crearCitasVeterinaria(CitasVeterinariaEntity citasVeterinariaEntity) {
        System.out.println("Pruebas Datos" + citasVeterinariaEntity.getNombreAnimal());
        CitasVeterinariaEntity citaCreada = this.veterinariaService.crearCita(citasVeterinariaEntity);
        return ResponseEntity.ok().body(citaCreada);

    }
}
