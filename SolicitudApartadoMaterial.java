package uia.com.inventarios;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SolicitudApartadoMaterial extends InfoInventarioUIA { //SE CREA ESTA NUEVA CLASE PARA "APARTAR" EL MATERIAL QUE FUE SOLICITADO

    public SolicitudApartadoMaterial(InfoInventarioUIA sm) throws IOException {
        super();
    }

    public SolicitudApartadoMaterial(int id, String name, String categoria, String cantidad, String idPartida, String idSubpartida, String idCategoria)
    {
        super(id, name, categoria, cantidad, idPartida, idSubpartida, idCategoria);
    }

    public void serializa() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("solicitudApartadoMaterial-1.json"), this);
    }
}
