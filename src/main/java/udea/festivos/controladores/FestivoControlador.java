package udea.festivos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udea.festivos.entidades.dtos.FestivoDto;
import udea.festivos.interfaces.IFestivoServicio;

import java.util.Date;
import java.util.List;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.echeverriv@udea.edu.co
 * @version Id: <b>festivos</b> 16/11/2023, 9:45 a. m.
 **/
@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

    @Autowired
    private IFestivoServicio servicio;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/verificar/{año}/{mes}/{dia}", method = RequestMethod.GET)
    public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        if (servicio.esFechaValida(String.valueOf(año) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia))) {
            Date fecha = new Date(año - 1900, mes - 1, dia);
            return servicio.esFestivo(fecha) ? "Es Festivo" : "No es festivo";
        } else {
            return "Fecha No valida";
        }

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/obtener/{año}", method = RequestMethod.GET)
    public List<FestivoDto> obtener(@PathVariable int año) {
        return servicio.obtenerFestivos(año);
    }
}
