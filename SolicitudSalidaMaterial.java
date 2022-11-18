package uia.com.inventarios;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SolicitudSalidaMaterial extends InfoInventarioUIA {


    public SolicitudSalidaMaterial(InfoInventarioUIA sm) throws IOException {
        super();
    }

    public SolicitudSalidaMaterial(int id, String name, String categoria, String cantidad, String idPartida, String idSubpartida, String idCategoria)
    {
        super(id, name, categoria, cantidad, idPartida, idSubpartida, idCategoria);
    }

    public void serializa() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("solicitudSalidaMaterial-1.json"), this);
    }
}