/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour.cosc405;


import static connectFour.cosc405.User.board_Arr_Dupe;
import static connectFour.cosc405.User.displace;

/**
 *
 * @author Jesse
 */
public class GUI extends javax.swing.JFrame {
    
    User player = new User();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    public void printBoard(){
        
        if("X".equals(board_Arr_Dupe[0][0]))
            panel00.setText("X");
        else if("X".equals(board_Arr_Dupe[0][1]))
            panel01.setText("X");
        else if("X".equals(board_Arr_Dupe[0][2]))
            panel02.setText("X");
        else if("X".equals(board_Arr_Dupe[0][3]))
            panel03.setText("X");
        else if("X".equals(board_Arr_Dupe[0][4]))
            panel04.setText("X");
        else if("X".equals(board_Arr_Dupe[0][5]))
            panel05.setText("X");
        else if("X".equals(board_Arr_Dupe[0][6]))
            panel06.setText("X");
        else if("X".equals(board_Arr_Dupe[1][0]))
            panel10.setText("X");
        else if("X".equals(board_Arr_Dupe[1][1]))
            panel11.setText("X");
        else if("X".equals(board_Arr_Dupe[1][2]))
            panel12.setText("X");
        else if("X".equals(board_Arr_Dupe[1][3]))
            panel13.setText("X");
        else if("X".equals(board_Arr_Dupe[1][4]))
            panel14.setText("X");
        else if("X".equals(board_Arr_Dupe[1][5]))
            panel15.setText("X");
        else if("X".equals(board_Arr_Dupe[1][6]))
            panel16.setText("X");
        else if("X".equals(board_Arr_Dupe[2][0]))
            panel20.setText("X");
        else if("X".equals(board_Arr_Dupe[2][1]))
            panel21.setText("X");
        else if("X".equals(board_Arr_Dupe[2][2]))
            panel22.setText("X");
        else if("X".equals(board_Arr_Dupe[2][3]))
            panel23.setText("X");
        else if("X".equals(board_Arr_Dupe[2][4]))
            panel24.setText("X");
        else if("X".equals(board_Arr_Dupe[2][5]))
            panel25.setText("X");
        else if("X".equals(board_Arr_Dupe[2][6]))
            panel26.setText("X");
        else if("X".equals(board_Arr_Dupe[3][0]))
            panel30.setText("X");
        else if("X".equals(board_Arr_Dupe[3][1]))
            panel31.setText("X");
        else if("X".equals(board_Arr_Dupe[3][2]))
            panel32.setText("X");
        else if("X".equals(board_Arr_Dupe[3][3]))
            panel33.setText("X");
        else if("X".equals(board_Arr_Dupe[3][4]))
            panel34.setText("X");
        else if("X".equals(board_Arr_Dupe[3][5]))
            panel35.setText("X");
        else if("X".equals(board_Arr_Dupe[3][6]))
            panel36.setText("X");
        else if("X".equals(board_Arr_Dupe[4][0]))
            panel40.setText("X");
        else if("X".equals(board_Arr_Dupe[4][1]))
            panel41.setText("X");
        else if("X".equals(board_Arr_Dupe[4][2]))
            panel42.setText("X");
        else if("X".equals(board_Arr_Dupe[4][3]))
            panel43.setText("X");
        else if("X".equals(board_Arr_Dupe[4][4]))
            panel44.setText("X");
        else if("X".equals(board_Arr_Dupe[4][5]))
            panel45.setText("X");
        else if("X".equals(board_Arr_Dupe[4][6]))
            panel46.setText("X");
        else if("X".equals(board_Arr_Dupe[5][0]))
            panel50.setText("X");
        else if("X".equals(board_Arr_Dupe[5][1]))
            panel51.setText("X");
        else if("X".equals(board_Arr_Dupe[5][2]))
            panel52.setText("X");
        else if("X".equals(board_Arr_Dupe[5][3]))
            panel53.setText("X");
        else if("X".equals(board_Arr_Dupe[5][4]))
            panel54.setText("X");
        else if("X".equals(board_Arr_Dupe[5][5]))
            panel55.setText("X");
        else if("X".equals(board_Arr_Dupe[5][6]))
            panel56.setText("X");
        
        if("O".equals(board_Arr_Dupe[0][0]))
            panel00.setText("O");
        else if("O".equals(board_Arr_Dupe[0][1]))
            panel01.setText("O");
        else if("O".equals(board_Arr_Dupe[0][2]))
            panel02.setText("O");
        else if("O".equals(board_Arr_Dupe[0][3]))
            panel03.setText("O");
        else if("O".equals(board_Arr_Dupe[0][4]))
            panel04.setText("O");
        else if("O".equals(board_Arr_Dupe[0][5]))
            panel05.setText("O");
        else if("O".equals(board_Arr_Dupe[0][6]))
            panel06.setText("O");
        else if("O".equals(board_Arr_Dupe[1][0]))
            panel10.setText("O");
        else if("O".equals(board_Arr_Dupe[1][1]))
            panel11.setText("O");
        else if("O".equals(board_Arr_Dupe[1][2]))
            panel12.setText("O");
        else if("O".equals(board_Arr_Dupe[1][3]))
            panel13.setText("O");
        else if("O".equals(board_Arr_Dupe[1][4]))
            panel14.setText("O");
        else if("O".equals(board_Arr_Dupe[1][5]))
            panel15.setText("O");
        else if("O".equals(board_Arr_Dupe[1][6]))
            panel16.setText("O");
        else if("O".equals(board_Arr_Dupe[2][0]))
            panel20.setText("O");
        else if("O".equals(board_Arr_Dupe[2][1]))
            panel21.setText("O");
        else if("O".equals(board_Arr_Dupe[2][2]))
            panel22.setText("O");
        else if("O".equals(board_Arr_Dupe[2][3]))
            panel23.setText("O");
        else if("O".equals(board_Arr_Dupe[2][4]))
            panel24.setText("O");
        else if("O".equals(board_Arr_Dupe[2][5]))
            panel25.setText("O");
        else if("O".equals(board_Arr_Dupe[2][6]))
            panel26.setText("O");
        else if("O".equals(board_Arr_Dupe[3][0]))
            panel30.setText("O");
        else if("O".equals(board_Arr_Dupe[3][1]))
            panel31.setText("O");
        else if("O".equals(board_Arr_Dupe[3][2]))
            panel32.setText("O");
        else if("O".equals(board_Arr_Dupe[3][3]))
            panel33.setText("O");
        else if("O".equals(board_Arr_Dupe[3][4]))
            panel34.setText("O");
        else if("O".equals(board_Arr_Dupe[3][5]))
            panel35.setText("O");
        else if("O".equals(board_Arr_Dupe[3][6]))
            panel36.setText("O");
        else if("O".equals(board_Arr_Dupe[4][0]))
            panel40.setText("O");
        else if("O".equals(board_Arr_Dupe[4][1]))
            panel41.setText("O");
        else if("O".equals(board_Arr_Dupe[4][2]))
            panel42.setText("O");
        else if("O".equals(board_Arr_Dupe[4][3]))
            panel43.setText("O");
        else if("O".equals(board_Arr_Dupe[4][4]))
            panel44.setText("O");
        else if("O".equals(board_Arr_Dupe[4][5]))
            panel45.setText("O");
        else if("O".equals(board_Arr_Dupe[4][6]))
            panel46.setText("O");
        else if("O".equals(board_Arr_Dupe[5][0]))
            panel50.setText("O");
        else if("O".equals(board_Arr_Dupe[5][1]))
            panel51.setText("O");
        else if("O".equals(board_Arr_Dupe[5][2]))
            panel52.setText("O");
        else if("O".equals(board_Arr_Dupe[5][3]))
            panel53.setText("O");
        else if("O".equals(board_Arr_Dupe[5][4]))
            panel54.setText("O");
        else if("O".equals(board_Arr_Dupe[5][5]))
            panel55.setText("O");
        else if("O".equals(board_Arr_Dupe[5][6]))
            panel56.setText("O");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel02 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        panel03 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        panel04 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        panel05 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        panel06 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        panel10 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        panel11 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        panel12 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        panel13 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        panel14 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        panel15 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        panel16 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        panel20 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        panel21 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        panel22 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        panel23 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        panel24 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        panel25 = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        panel26 = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        panel30 = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        panel31 = new javax.swing.JTextPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        panel32 = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        panel33 = new javax.swing.JTextPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        panel34 = new javax.swing.JTextPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        panel35 = new javax.swing.JTextPane();
        jScrollPane28 = new javax.swing.JScrollPane();
        panel36 = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        panel40 = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        panel41 = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        panel42 = new javax.swing.JTextPane();
        jScrollPane33 = new javax.swing.JScrollPane();
        panel43 = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        panel44 = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        panel45 = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        panel46 = new javax.swing.JTextPane();
        jScrollPane37 = new javax.swing.JScrollPane();
        panel50 = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        panel51 = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        panel52 = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        panel53 = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        panel54 = new javax.swing.JTextPane();
        jScrollPane42 = new javax.swing.JScrollPane();
        panel55 = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        panel56 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel00 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel01 = new javax.swing.JTextPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        panel02.setEditable(false);
        jScrollPane3.setViewportView(panel02);

        panel03.setEditable(false);
        jScrollPane4.setViewportView(panel03);

        panel04.setEditable(false);
        jScrollPane5.setViewportView(panel04);

        panel05.setEditable(false);
        jScrollPane6.setViewportView(panel05);

        panel06.setEditable(false);
        jScrollPane7.setViewportView(panel06);

        panel10.setEditable(false);
        jScrollPane8.setViewportView(panel10);

        panel11.setEditable(false);
        jScrollPane9.setViewportView(panel11);

        panel12.setEditable(false);
        jScrollPane10.setViewportView(panel12);

        panel13.setEditable(false);
        jScrollPane11.setViewportView(panel13);

        panel14.setEditable(false);
        jScrollPane12.setViewportView(panel14);

        panel15.setEditable(false);
        jScrollPane13.setViewportView(panel15);

        panel16.setEditable(false);
        jScrollPane14.setViewportView(panel16);

        panel20.setEditable(false);
        jScrollPane15.setViewportView(panel20);

        panel21.setEditable(false);
        jScrollPane16.setViewportView(panel21);

        panel22.setEditable(false);
        jScrollPane17.setViewportView(panel22);

        panel23.setEditable(false);
        jScrollPane18.setViewportView(panel23);

        panel24.setEditable(false);
        jScrollPane19.setViewportView(panel24);

        panel25.setEditable(false);
        jScrollPane20.setViewportView(panel25);

        panel26.setEditable(false);
        jScrollPane21.setViewportView(panel26);

        panel30.setEditable(false);
        jScrollPane22.setViewportView(panel30);

        panel31.setEditable(false);
        jScrollPane23.setViewportView(panel31);

        panel32.setEditable(false);
        jScrollPane24.setViewportView(panel32);

        panel33.setEditable(false);
        jScrollPane25.setViewportView(panel33);

        panel34.setEditable(false);
        jScrollPane26.setViewportView(panel34);

        panel35.setEditable(false);
        jScrollPane27.setViewportView(panel35);

        panel36.setEditable(false);
        jScrollPane28.setViewportView(panel36);

        panel40.setEditable(false);
        jScrollPane30.setViewportView(panel40);

        panel41.setEditable(false);
        jScrollPane31.setViewportView(panel41);

        panel42.setEditable(false);
        jScrollPane32.setViewportView(panel42);

        panel43.setEditable(false);
        jScrollPane33.setViewportView(panel43);

        panel44.setEditable(false);
        jScrollPane34.setViewportView(panel44);

        panel45.setEditable(false);
        jScrollPane35.setViewportView(panel45);

        panel46.setEditable(false);
        jScrollPane36.setViewportView(panel46);

        panel50.setEditable(false);
        jScrollPane37.setViewportView(panel50);

        panel51.setEditable(false);
        jScrollPane38.setViewportView(panel51);

        panel52.setEditable(false);
        jScrollPane39.setViewportView(panel52);

        panel53.setEditable(false);
        jScrollPane40.setViewportView(panel53);

        panel54.setEditable(false);
        jScrollPane41.setViewportView(panel54);

        panel55.setEditable(false);
        jScrollPane42.setViewportView(panel55);

        panel56.setEditable(false);
        panel56.setBorder(null);
        panel56.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jScrollPane43.setViewportView(panel56);

        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setText("2");

        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setText("3");

        jButton4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton4.setText("4");

        jButton5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton5.setText("5");

        jButton6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton6.setText("6");

        jButton7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton7.setText("7");

        panel00.setEditable(false);
        jScrollPane1.setViewportView(panel00);

        panel01.setEditable(false);
        jScrollPane2.setViewportView(panel01);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int x = 1;
        player.setMove(x);
        printBoard();
        player.set_OpponentMove(x);
        printBoard();
        
    }//GEN-LAST:event_jButton1MouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane panel00;
    private javax.swing.JTextPane panel01;
    private javax.swing.JTextPane panel02;
    private javax.swing.JTextPane panel03;
    private javax.swing.JTextPane panel04;
    private javax.swing.JTextPane panel05;
    private javax.swing.JTextPane panel06;
    private javax.swing.JTextPane panel10;
    private javax.swing.JTextPane panel11;
    private javax.swing.JTextPane panel12;
    private javax.swing.JTextPane panel13;
    private javax.swing.JTextPane panel14;
    private javax.swing.JTextPane panel15;
    private javax.swing.JTextPane panel16;
    private javax.swing.JTextPane panel20;
    private javax.swing.JTextPane panel21;
    private javax.swing.JTextPane panel22;
    private javax.swing.JTextPane panel23;
    private javax.swing.JTextPane panel24;
    private javax.swing.JTextPane panel25;
    private javax.swing.JTextPane panel26;
    private javax.swing.JTextPane panel30;
    private javax.swing.JTextPane panel31;
    private javax.swing.JTextPane panel32;
    private javax.swing.JTextPane panel33;
    private javax.swing.JTextPane panel34;
    private javax.swing.JTextPane panel35;
    private javax.swing.JTextPane panel36;
    private javax.swing.JTextPane panel40;
    private javax.swing.JTextPane panel41;
    private javax.swing.JTextPane panel42;
    private javax.swing.JTextPane panel43;
    private javax.swing.JTextPane panel44;
    private javax.swing.JTextPane panel45;
    private javax.swing.JTextPane panel46;
    private javax.swing.JTextPane panel50;
    private javax.swing.JTextPane panel51;
    private javax.swing.JTextPane panel52;
    private javax.swing.JTextPane panel53;
    private javax.swing.JTextPane panel54;
    private javax.swing.JTextPane panel55;
    private javax.swing.JTextPane panel56;
    // End of variables declaration//GEN-END:variables
}
