package DiegoZelaya_20240181.DiegoZelaya_20240181.Controller;

import DiegoZelaya_20240181.DiegoZelaya_20240181.Models.DTO.DTOProvedor;
import DiegoZelaya_20240181.DiegoZelaya_20240181.Service.ServiceProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class ControllerProveedor {

    @Autowired
    private ServiceProveedor service;

    @GetMapping("/ObtenerProveedor")
    public List<DTOProvedor> datosUsuarios(){
        return service.getAllusers();
    }
}
