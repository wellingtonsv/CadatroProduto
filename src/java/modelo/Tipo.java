package modelo;

public enum Tipo {

    MOSTRUARIO("MO"),
    ESTOQUE("ES");
    
    private String id;

    Tipo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
