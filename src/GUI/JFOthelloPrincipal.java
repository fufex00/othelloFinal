package GUI;

import Logic.PieceNodes;
import Logic.Players;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class JFOthelloPrincipal extends javax.swing.JFrame implements ActionListener {

    ArrayList<PieceNodes> pieceList = new ArrayList<>();

    public ArrayList<Players> playersList = new ArrayList<>();
//    public int blackPieces = 0;

    public JFOthelloPrincipal() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        for (int i = 0; i < 64; i++) {
            PieceNodes piece = new PieceNodes();
            piece.addActionListener(this);
            int row = (i / 8) % 2;
            if (row == 0) {
                piece.setBackground(i % 2 == 0 ? Color.CYAN.darker().darker() : Color.CYAN.darker().darker());
            } else {
                piece.setBackground(i % 2 == 0 ? Color.CYAN.darker().darker() : Color.CYAN.darker().darker());
            }
            jPanelGameBoard.add(piece);
            pieceList.add(piece);
        }

        iniciateNodes();
        iniciateBoard();
        blackPieces();
        whitePieces();
        checkwinner();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGameBoard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        Jugador = new javax.swing.JLabel();
        lblPlayerOne = new javax.swing.JLabel();
        lblPlayertwo = new javax.swing.JLabel();
        lblBlackPieces = new javax.swing.JLabel();
        lblWhitePieces = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGame = new javax.swing.JMenu();
        jMenuItemRestart = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGameBoard.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(jPanelGameBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 710, 510));

        label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label.setText("Juega: ");

        Jugador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        lblPlayerOne.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblPlayerOne.setText("P1");

        lblPlayertwo.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblPlayertwo.setText("P2");

        lblBlackPieces.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblBlackPieces.setText("Negras");

        lblWhitePieces.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblWhitePieces.setText("Blancas");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Piezas negras:");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Piezas blancas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayertwo)
                    .addComponent(lblPlayerOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWhitePieces)
                    .addComponent(lblBlackPieces))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBlackPieces)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWhitePieces)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPlayerOne)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayertwo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 720, 60));

        jMenuGame.setText("Juego");

        jMenuItemRestart.setText("Reiniciar");
        jMenuItemRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestartActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemRestart);

        jMenuItemExit.setText("Salir");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemExit);

        jMenuBar1.add(jMenuGame);

        jMenuHelp.setText("Ayuda");

        jMenuItemInfo.setText("Informacion");
        jMenuItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemInfo);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        Login window = new Login();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoActionPerformed
        Help hlp = new Help(this, true);
        hlp.setVisible(true);

    }//GEN-LAST:event_jMenuItemInfoActionPerformed

    private void jMenuItemRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestartActionPerformed
        this.dispose();
        JFOthelloPrincipal neww = new JFOthelloPrincipal();
        neww.setVisible(true);
        iniciateBoard();
    }//GEN-LAST:event_jMenuItemRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFOthelloPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGame;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemInfo;
    private javax.swing.JMenuItem jMenuItemRestart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGameBoard;
    private javax.swing.JLabel label;
    public javax.swing.JLabel lblBlackPieces;
    public javax.swing.JLabel lblPlayerOne;
    public javax.swing.JLabel lblPlayertwo;
    public javax.swing.JLabel lblWhitePieces;
    // End of variables declaration//GEN-END:variables
    public String turn = "b";
    public int blackPieces = 0;
    public int whitePieces = 0;
    ArrayList<Integer> avalible = new ArrayList<>();
    ArrayList<Integer> used = new ArrayList<>();
    String colorIcon = "/Images/dark.png";

    private void middleNodeCreation(int i, int nextR, int previousR) {
        pieceList.get(i).setNorth(pieceList.get(previousR));
        pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
        pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
        pieceList.get(i).setWest(pieceList.get(i - 1));
        pieceList.get(i).setEast(pieceList.get(i + 1));
        pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
        pieceList.get(i).setSouth(pieceList.get(nextR));
        pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
    }

    public final void iniciateBoard() {
        for (PieceNodes piece : pieceList) {
            piece.setEnabled(false);
        }

        pieceList.get(27).setEnabled(true);
        pieceList.get(27).setNodeColor("w");
        pieceList.get(27).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light.png")));
        pieceList.get(28).setEnabled(true);
        pieceList.get(28).setNodeColor("b");
        pieceList.get(28).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dark.png")));
        pieceList.get(35).setEnabled(true);
        pieceList.get(35).setNodeColor("b");
        pieceList.get(35).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dark.png")));
        pieceList.get(36).setEnabled(true);
        pieceList.get(36).setNodeColor("w");
        pieceList.get(36).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light.png")));
        Jugador.setText("Negras");
        used.add(27);
        used.add(28);
        used.add(35);
        used.add(36);
        checkLegalMoves();

    }

    private void iniciateNodes() {

        int nextR = 9;
        int previousR = 1;
        // caso del primer nodo, esquina izquierda superior
        pieceList.get(0).setSouth(pieceList.get(8));
        pieceList.get(0).setSoutheast(pieceList.get(9));
        pieceList.get(0).setEast(pieceList.get(1));

        for (int i = 1; i < pieceList.size() - 1; i++) {

            if (i < 7) { //primera fila
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                nextR++;

            }
            if (i == 7) {
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
            }
            if (i > 8 && i < 15) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 16 && i < 23) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 24 && i < 31) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 32 && i < 39) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 40 && i < 47) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 48 && i < 55) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i == 15 || i == 23 || i == 31 || i == 39 || i == 47) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
                previousR++;
            }
            if (i == 55) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                previousR++;
            }
            if (i > 56) { //ultima fila
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                previousR++;

            }

            if (i == 8) {
                pieceList.get(i).setNorth(pieceList.get(0));
                pieceList.get(i).setNortheast(pieceList.get(1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
            }
            if (i == 16 || i == 24 || i == 32 || i == 40 || i == 48) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
                previousR++;

            }
            if (i == 56) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                previousR++;
            }
        }
        pieceList.get(63).setNorth(pieceList.get(55));
        pieceList.get(63).setNorthwest(pieceList.get(54));
        pieceList.get(63).setWest(pieceList.get(62));
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < pieceList.size(); i++) {
            if (e.getSource() == pieceList.get(i)) {
                System.out.println(pieceList.get(i).getNodeColor());
                if (checkUsed(i)) {
                    pieceList.get(i).setNodeColor(turn);
                    flipPieces(i);
                    blackPieces();
                    whitePieces();
                    checkwinner();
                }
            }
        }
    }

    private void checkLegalMoves() {

        for (int i = 0; i < pieceList.size(); i++) {
            if (pieceList.get(i).isEnabled() && pieceList.get(i).getNodeColor().equals(turn)) {
                checkAvalibleMovements(i);
            }
        }
        //avalible.clear();
    }

    private void checkWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getWest() != null) {
            if (!aux.getWest().getNodeColor().equals("n")) {

                while (aux.getWest() != null && !aux.getNodeColor().equals("n") && !aux.getWest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getWest();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getEast() != null) {
            if (!aux.getEast().getNodeColor().equals("n")) {

                while (aux.getEast() != null && !aux.getNodeColor().equals("n") && !aux.getEast()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getEast();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorth(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNorth() != null) {
            if ((!aux.getNorth().getNodeColor().equals("n")) && (!aux.getNorth().getNodeColor().equals(turn))) {
                while (aux.getNorth() != null && !aux.getNodeColor().equals("n") && !aux.getNorth()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNorth();

                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkSouth(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSouth() != null) {
            if ((!aux.getSouth().getNodeColor().equals("n"))) {

                while (aux.getSouth() != null && !aux.getNodeColor().equals("n") && !aux.getSouth()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getSouth();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorthWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNorthwest() != null) {
            if (!aux.getNorthwest().getNodeColor().equals("n")) {

                while (aux.getNorthwest() != null && !aux.getNodeColor().equals("n") && !aux.getNorthwest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNorthwest();
                }
                if (pieceList.indexOf(aux) != position) {

                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorthEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNortheast() != null) {
            if (!aux.getNortheast().getNodeColor().equals("n")) {
                while (aux.getNortheast() != null && !aux.getNodeColor().equals("n") && !aux.getNortheast()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNortheast();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }
            }
        }
    }

    private void checkSouthWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSouthwest() != null) {
            if (!aux.getSouthwest().getNodeColor().equals("n")) {

                while (aux.getSouthwest() != null && !aux.getNodeColor().equals("n") && !aux.getSouthwest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getSouthwest();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkSouthEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSoutheast() != null) {
            if (!aux.getSoutheast().getNodeColor().equals("n")) {
                try {
                    while (aux.getSoutheast() != null && !aux.getNodeColor().equals("n") && !aux.getSoutheast()
                            .getNodeColor().equals(turn)) {
                        aux = aux.getSoutheast();
                    }

                    if (pieceList.indexOf(aux) != position) {
                        changeIcon(pieceList.indexOf(aux));
                        avalible.add(pieceList.indexOf(aux));
                    }
                } catch (NullPointerException e) {
                    System.out.println("Llego al este.");
                }
            }
        }

    }

    private void checkAvalibleMovements(int position) {
        checkNorth(position);
        checkSouth(position);
        checkEast(position);
        checkWest(position);

        checkNorthEast(position);
        checkNorthWest(position);

        checkSouthEast(position);
        checkSouthWest(position);
    }

    private void changeIcon(int position) {
        pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/legalMoveIcon.png")));
        pieceList.get(position).setEnabled(true);
    }

    private boolean checkUsed(int usedPosition) {

        for (Integer position : used) {
            if (pieceList.get(position) == pieceList.get(usedPosition)) {
                return false;
            }
        }
        return true;
    }

    private void flipPieces(int position) {
        used.add(position);
        for (Integer node : avalible) {
            if (pieceList.get(node) != pieceList.get(position)) {
                pieceList.get(node).setEnabled(false);
                pieceList.get(node).setIcon(null);
            }
        }

        avalible.clear();

        if (turn.equals("b")) {
            colorIcon = "/Images/dark.png";
            pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
        } else {
            colorIcon = "/Images/light.png";
            pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
        }

        changeColors(position);
        if (turn.equals("b")) {
            turn = "w";
            Jugador.setText("Blancos");
            checkLegalMoves();
        } else {
            turn = "b";
            Jugador.setText("Negras");
            checkLegalMoves();
        }
    }

    private void changeColors(int position) {

        PieceNodes aux = pieceList.get(position);
        int counter = 0;
        LinkedList<Integer> nodes = new LinkedList<>();
        String opositeTurn;

        if (turn.equals("w")) {
            opositeTurn = "b";
        } else {
            opositeTurn = "w";
        }

        aux = aux.getNorthwest();

        while (aux != null) {

            if (!aux.getNodeColor().equals(aux.getSoutheast().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando noroeste");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }
            aux = aux.getNorthwest();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;
        aux = pieceList.get(position);

        aux = aux.getNortheast();

        while (aux != null) {
            if (!aux.getNodeColor().equals(aux.getSouthwest().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando noreste");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }
            aux = aux.getNortheast();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;
        aux = pieceList.get(position);

        aux = aux.getSoutheast();

        while (aux != null) {
            if (!aux.getNodeColor().equals(aux.getNorthwest().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando sureste");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getSoutheast();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;

        aux = pieceList.get(position);
        aux = aux.getSouthwest();

        while (aux != null) {
            if (!aux.getNodeColor().equals(aux.getNortheast().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando suroeste");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getSouthwest();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;

        aux = pieceList.get(position);
        aux = aux.getSouth();

        while (aux != null) {

            if (!aux.getNodeColor().equals(aux.getNorth().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando sur");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getSouth();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;

        aux = pieceList.get(position);

        aux = aux.getEast();

        while (aux != null) {

            if (!aux.getNodeColor().equals(aux.getWest().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando este");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getEast();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;

        aux = pieceList.get(position);

        aux = aux.getWest();
        while (aux != null) {

            if (!aux.getNodeColor().equals(aux.getEast().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando oeste");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getWest();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;

        aux = pieceList.get(position);

        aux = aux.getNorth();

        while (aux != null) {

            if (!aux.getNodeColor().equals(aux.getSouth().getNodeColor()) && aux.getNodeColor().equals(opositeTurn)) {
                System.out.println("Revisando norte");
                counter++;
                nodes.add(pieceList.indexOf(aux));
                aux.setNodeColor(turn);
            }

            aux = aux.getNorth();
        }
        if (counter > 0) {
            for (Integer node : nodes) {
                pieceList.get(node).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));

//                pieceList.get(node).setNodeColor(turn);
            }
        }
        nodes.clear();
        counter = 0;
    }

    public final void blackPieces() {
        blackPieces = 0;

        for (int i = 0; i < pieceList.size(); i++) {
            if (pieceList.get(i).getNodeColor().equals("b")) {
                blackPieces = blackPieces + 1;

            }

        }
        this.lblBlackPieces.setText("" + blackPieces);
        System.out.println("Piezas negras: " + blackPieces);

    }

    public final void whitePieces() {
        whitePieces = 0;
        for (int i = 0; i < pieceList.size(); i++) {
            if (pieceList.get(i).getNodeColor().equals("w")) {
                whitePieces = whitePieces + 1;

            }
        }
        this.lblWhitePieces.setText("" + whitePieces);
        System.out.println("Piezas blancas: " + whitePieces);
    }

    public final void checkwinner() {
        for (int i = 0; i < avalible.size(); i++) {

        }

    }

}