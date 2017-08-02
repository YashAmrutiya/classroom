package texteditor;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.text.StyleConstants.FontSize;

public class Editor extends javax.swing.JFrame {
    String setFont="Arial";
    int size=20;
     String title="untitled - TextEditor 1.0.0";
    public Editor() {
        setTitle(title);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        fontColorButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        fontSize = new javax.swing.JComboBox();
        FontStyle = new javax.swing.JComboBox();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        cutButton.setText("Cut");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });

        pasteButton.setText("Paste");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        fontColorButton.setText("Font Color");
        fontColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontColorButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea);

        fontSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "42", "72" }));
        fontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontSizeActionPerformed(evt);
            }
        });

        FontStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Courier", "Abadi MT Condensed Extra Bold", "Abadi MT Condensed Light", "Academy Engraved LET", "Al Bayan", "American Typewriter", "Andale Mono", "Apple Casual", "Apple Chancery", "Apple LiGothic", "Apple LiSung", "Apple Symbols", "AppleGothic", "AppleMyungjo", "Arial", "Arial Black", "Arial Hebrew", "Arial Narrow", "Arial Rounded MT Bold", "Ayuthaya", "Baghdad", "Bank Gothic", "Baskerville", "Baskerville Old Face", "Batang", "Bauhaus 93", "Bell MT", "Bernard MT Condensed", "BiauKai", "Big Caslon", "Bitstream Vera Sans", "Bitstream Vera Sans Mono", "Bitstream Vera Serif", "Blackmoor LET", "BlairMdITC TT", "Bodoni Ornaments ITC TT", "Bodoni SvtyTwo ITC TT", "Bodoni SvtyTwo OS ITC TT", "Bodoni SvtyTwo SC ITC TT", "Book Antiqua", "Bookman Old Style", "Bordeaux Roman Bold LET", "Bradley Hand ITC TT", "Braggadocio", "Britannic Bold", "Brush Script MT", "Calisto MT", "Century", "Century Gothic", "Century Schoolbook", "Chalkboard", "Charcoal CY", "Cochin", "Colonna MT", "Comic Sans MS", "Cooper Black", "Copperplate", "Copperplate Gothic Bold", "Copperplate Gothic Light", "Corsiva Hebrew", "Courier New", "Cracked", "Curlz MT", "DecoType Naskh", "Desdemona", "Devanagari MT", "Dialog", "DialogInput", "Didot", "Edwardian Script ITC", "Engravers MT", "Euphemia UCAS", "Eurostile", "Footlight MT Light", "Futura", "Garamond", "GB18030 Bitmap", "Geeza Pro", "Geneva", "Geneva CY", "Georgia", "Gill Sans", "Gill Sans Ultra Bold", "Gloucester MT Extra Condensed", "Goudy Old Style", "Gujarati MT", "Gulim", "Gurmukhi MT", "Haettenschweiler", "Handwriting - Dakota", "Harrington", "Hei", "Helvetica", "Helvetica CY", "Helvetica Neue", "Herculanum", "Hiragino Kaku Gothic Pro", "Hiragino Kaku Gothic Std", "Hiragino Maru Gothic Pro", "Hiragino Mincho Pro", "Hoefler Text", "Impact", "Imprint MT Shadow", "InaiMathi", "Jazz LET", "Kai", "Kino MT", "Krungthep", "KufiStandardGK", "LiHei Pro", "LiSong Pro", "Lucida Blackletter", "Lucida Bright", "Lucida Calligraphy", "Lucida Fax", "Lucida Grande", "Lucida Handwriting", "Lucida Sans", "Lucida Sans Typewriter", "Marker Felt", "Matura MT Script Capitals", "Mistral", "Modern No. 20", "Mona Lisa Solid ITC TT", "Monaco", "Monospaced", "Monotype Corsiva", "Monotype Sorts", "MS Gothic", "MS Mincho", "MS PGothic", "MS PMincho", "Mshtakan", "MT Extra", "Nadeem", "New Peninim MT", "News Gothic MT", "Onyx", "OpenSymbol", "Optima", "Osaka", "Palatino", "Papyrus", "Party LET", "Perpetua Titling MT", "Plantagenet Cherokee", "Playbill", "PMingLiU", "PortagoITC TT", "Princetown LET", "Raanana", "Rockwell", "Rockwell Extra Bold", "SansSerif", "Santa Fe LET", "Sathu", "Savoye LET", "SchoolHouse Cursive B", "SchoolHouse Printed A", "Serif", "Silom", "SimSun", "Skia", "Snell Roundhand", "Stencil", "STFangsong", "STHeiti", "STKaiti", "Stone Sans ITC TT", "Stone Sans Sem ITC TT", "STSong", "Symbol", "Synchro LET", "Tahoma", "Thonburi", "Times", "Times New Roman", "Trebuchet MS", "Type Embellishments One LET", "Verdana", "Webdings", "Wide Latin", "Wingdings", "Wingdings 2", "Wingdings 3", "Zapf Dingbats", "Zapfino" }));
        FontStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontStyleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pasteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fontColorButton)
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(openButton)
                    .addComponent(savebutton)
                    .addComponent(cutButton)
                    .addComponent(pasteButton)
                    .addComponent(copyButton)
                    .addComponent(fontColorButton)
                    .addComponent(fontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        textArea.setText("");
        setTitle("untitled - TextEditor 1.0.0");
    }//GEN-LAST:event_newButtonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
       JFileChooser chooser=new JFileChooser();
       int chooserValue=chooser.showSaveDialog(this);
       if(chooserValue == JFileChooser.APPROVE_OPTION){
           try {
               PrintWriter fout=new PrintWriter(chooser.getSelectedFile());
               fout.print(textArea.getText());
               title=chooser.getSelectedFile().getName();
                setTitle(title);
               fout.close();
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
       JFileChooser chooser=new JFileChooser();
       int chooserValue=chooser.showOpenDialog(this);
       if(chooserValue==JFileChooser.APPROVE_OPTION){
           try {
               Scanner fin=new Scanner(chooser.getSelectedFile());
               String buffer="";
               while(fin.hasNext()){        
                   
                   buffer+=fin.nextLine()+"\n";
               }
               textArea.setText(buffer);
               title=chooser.getSelectedFile().getName();
               setTitle(title);
               fin.close();
           } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(this,"File Not Found!");
           }
       }
       
        
    }//GEN-LAST:event_openButtonActionPerformed

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        textArea.paste();
    }//GEN-LAST:event_pasteButtonActionPerformed

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
        textArea.cut();
    }//GEN-LAST:event_cutButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        textArea.copy();
    }//GEN-LAST:event_copyButtonActionPerformed

    private void fontColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontColorButtonActionPerformed
        JColorChooser jc=new JColorChooser();
        textArea.setForeground(jc.showDialog(this, "Color", Color.red));
    }//GEN-LAST:event_fontColorButtonActionPerformed

    private void fontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontSizeActionPerformed
        String setFontSize=fontSize.getSelectedItem().toString();
         size=Integer.parseInt(setFontSize);
        textArea.setFont(new Font(setFont,Font.PLAIN,size));
    }//GEN-LAST:event_fontSizeActionPerformed

    private void FontStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontStyleActionPerformed
       setFont=FontStyle.getSelectedItem().toString();
        textArea.setFont(new Font(setFont,Font.PLAIN,size));
    }//GEN-LAST:event_FontStyleActionPerformed

       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FontStyle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton cutButton;
    private javax.swing.JButton fontColorButton;
    private javax.swing.JComboBox fontSize;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton openButton;
    private javax.swing.JButton pasteButton;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
