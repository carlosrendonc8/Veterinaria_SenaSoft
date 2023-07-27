package veterinariaSenaSoftbackend.WebApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import veterinariaSenaSoftbackend.commons.Endpoints.InterfaceEndpointsVeterinaria;
import veterinariaSenaSoftbackend.commons.Entity.CitasVeterinariaEntity;

public interface InterfazVeterianriaWebApi
{
    @PostMapping(InterfaceEndpointsVeterinaria.CITAS_POR_REALIZAR)
    public ResponseEntity<?> crearCitasVeterinaria(@RequestBody CitasVeterinariaEntity citasVeterinariaEntity);
}
