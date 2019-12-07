package Logic;

/**
 *
 * @author steveespinoza
 */
public class PieceNodes extends javax.swing.JButton {

    /**
     * Método para un color del nodo 
     */
    private String nodeColor;

    /**
     * Pointers for each node
     */
    private PieceNodes north;
    private PieceNodes south;
    private PieceNodes east;
    private PieceNodes west;
    private PieceNodes northwest;
    private PieceNodes northeast;
    private PieceNodes southeast;
    private PieceNodes southwest;

    PieceNodes aux;

    /**
     * método que asigna las direcciones de las piezas del tablero
     */
    public PieceNodes() {
        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
        this.northwest = null;
        this.northeast = null;
        this.southeast = null;
        this.southwest = null;
        this.nodeColor="n";
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección norte de la ficha
     */
    public PieceNodes getNorth() {
        return north;
    }

    /**
     * asigna la dirección de la ficha al norte
     * @param north la dirección norte
     */
    public void setNorth(PieceNodes north) {
        this.north = north;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección sur de la ficha
     */
    public PieceNodes getSouth() {
        return south;
    }

    /**
     * asigna la dirección de la ficha al sur 
     * @param south la direción sur
     */
    public void setSouth(PieceNodes south) {
        this.south = south;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección este de la ficha
     */
    public PieceNodes getEast() {
        return east;
    }

    /**
     * asigna la dirección de la ficha al este
     * @param east la dirección este
     */
    public void setEast(PieceNodes east) {
        this.east = east;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección oeste de la ficha
     */
    public PieceNodes getWest() {
        return west;
    }

    /**
     * asigna la dirección de la ficha al oste
     * @param west la dirección oeste
     */
    public void setWest(PieceNodes west) {
        this.west = west;
    }

    /**
     * método que obtiene la direción de la ficha
     * @return la dirección noroeste de la ficha
     */
    public PieceNodes getNorthwest() {
        return northwest;
    }

    /**
     * asigna la dirección de la ficha al noroeste
     * @param northwest la dirección noroeste
     */
    public void setNorthwest(PieceNodes northwest) {
        this.northwest = northwest;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección noreste de la ficha
     */
    public PieceNodes getNortheast() {
        return northeast;
    }

    /**
     * asigna la dirección de la ficha al noreste
     * @param northest la dirección noreste
     */
    public void setNortheast(PieceNodes northest) {
        this.northeast = northest;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección sureste de la ficha
     */
    public PieceNodes getSoutheast() {
        return southeast;
    }

    /**
     * asigna la dirección de la ficha al sureste 
     * @param southest la dirección sureste
     */
    public void setSoutheast(PieceNodes southest) {
        this.southeast = southest;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección suroeste de la ficha
     */
    public PieceNodes getSouthwest() {
        return southwest;
    }

    /**
     * asigna la dirección de la ficha al suroeste
     * @param southwest la dirección suroeste
     */
    public void setSouthwest(PieceNodes southwest) {
        this.southwest = southwest;
    }

    /**
     * @return the nodeColor Obtiene el color del nodo a ser cambiado
     */
    public String getNodeColor() {
        return nodeColor;
    }

    /**
     * @param nodeColor Color cambia el color del nodo
     */
    public void setNodeColor(String nodeColor) {
        this.nodeColor = nodeColor;
    }
}
