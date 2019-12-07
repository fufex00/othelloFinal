package Logic;

/**
 *
 * @author steveespinoza
 */
public class PieceNodes extends javax.swing.JButton {

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

    public PieceNodes getNorth() {
        return north;
    }

    public void setNorth(PieceNodes north) {
        this.north = north;
    }

    public PieceNodes getSouth() {
        return south;
    }

    public void setSouth(PieceNodes south) {
        this.south = south;
    }

    public PieceNodes getEast() {
        return east;
    }

    public void setEast(PieceNodes east) {
        this.east = east;
    }

    public PieceNodes getWest() {
        return west;
    }

    public void setWest(PieceNodes west) {
        this.west = west;
    }

    public PieceNodes getNorthwest() {
        return northwest;
    }

    public void setNorthwest(PieceNodes northwest) {
        this.northwest = northwest;
    }

    public PieceNodes getNortheast() {
        return northeast;
    }

    public void setNortheast(PieceNodes northest) {
        this.northeast = northest;
    }

    public PieceNodes getSoutheast() {
        return southeast;
    }

    public void setSoutheast(PieceNodes southest) {
        this.southeast = southest;
    }

    public PieceNodes getSouthwest() {
        return southwest;
    }

    public void setSouthwest(PieceNodes southwest) {
        this.southwest = southwest;
    }

    /**
     * @return the nodeColor
     */
    public String getNodeColor() {
        return nodeColor;
    }

    /**
     * @param nodeColor the nodeColor to set
     */
    public void setNodeColor(String nodeColor) {
        this.nodeColor = nodeColor;
    }

}
