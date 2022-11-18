package uia.com.inventarios;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;


    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SolicitudSalidaMaterial.class, name = "SSM")
    })

    public class InfoInventarioUIA {

        private int id;
        private String name;
        private String descripcion;
        private String cantidad;
        private String partida;
        private String subpartida;
        private String categoria;
        private List<InfoInventarioUIA> items = new ArrayList<InfoInventarioUIA>();
        private String estatus = "sinEstatus";

        public InfoInventarioUIA(int id, String name, String descripcion, String cantidad, String partida, String subpartida, String categoria) {
            this.id = id;
            this.name = name;
            this.descripcion = descripcion;
            this.cantidad = cantidad;
            this.partida = partida;
            this.subpartida = subpartida;
            this.categoria = categoria;
        }

        public InfoInventarioUIA() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCantidad() {
            return cantidad;
        }

        public void setCantidad(String cantidad) {
            this.cantidad = cantidad;
        }

        public String getPartida() {
            return partida;
        }

        public void setPartida(String partida) {
            this.partida = partida;
        }

        public String getSubpartida() {
            return subpartida;
        }

        public void setSubpartida(String subpartida) {
            this.subpartida = subpartida;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public List<InfoInventarioUIA> getItems() {
            return items;
        }

        public void setItems(List<InfoInventarioUIA> items) {
            this.items = items;
        }
    }
