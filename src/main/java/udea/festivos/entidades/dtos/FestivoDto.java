package udea.festivos.entidades.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.echeverriv@udea.edu.co
 * @version Id: <b>festivos</b> 16/11/2023, 9:45 a. m.
 **/
public class FestivoDto {

    private String festivo;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha;

    public FestivoDto() {
    }

    public FestivoDto(String festivo, Date fecha) {
        this.festivo = festivo;
        this.fecha = fecha;
    }

    public String getFestivo() {
        return festivo;
    }

    public void setFestivo(String festivo) {
        this.festivo = festivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
