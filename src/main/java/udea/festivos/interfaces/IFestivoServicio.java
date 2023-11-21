package udea.festivos.interfaces;

import udea.festivos.entidades.dtos.FestivoDto;

import java.util.Date;
import java.util.List;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.echeverriv@udea.edu.co
 * @version Id: <b>festivos</b> 16/11/2023, 9:45 a. m.
 **/
public interface IFestivoServicio {

    public boolean esFestivo(Date Fecha);

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFechaValida(String strFecha);
}
