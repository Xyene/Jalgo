package tk.ivybits.jalgo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import tk.ivybits.jalgo.script.ZalgoScript;

/**
 *
 * @author Tudor
 */
public class Zalgo extends JFrame {

    private Script currentScript;
    private JTextArea input = createTextArea(true);
    private JTextArea output = createTextArea(false);
    private static final Font UNICODE_FONT = new Font("Dialog", Font.PLAIN, 12);

    /**
     * Creates new form NewJFrame
     */
    public Zalgo() {
        initComponents();

        unencodeButton.setVisible(false);
        encodeButton.setVisible(false);

        JSplitPane split = new JSplitPane();
        split.setContinuousLayout(true);
        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (livePreview.isSelected()) {
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            output.setText(currentScript.encode(input.getText()));
                        }
                    });
                }
            }
        });
        final JScrollPane inputPane = wrapTextArea(input);
        final JScrollPane outputPane = wrapTextArea(output);
        inputPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                outputPane.getVerticalScrollBar().setValue(e.getValue());
            }
        });
        outputPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                inputPane.getVerticalScrollBar().setValue(e.getValue());
            }
        });

        split.setRightComponent(inputPane);
        split.setLeftComponent(outputPane);
        scene.add(split, BorderLayout.CENTER);
        setScript(new ZalgoScript());
    }

    public void setScript(Script scr) {
        currentScript = scr;
        scriptOptionsGroup.add(scr.getOptionPane(), BorderLayout.CENTER);
        input.setText(scr.getExampleText());
        output.setText(scr.encode(scr.getExampleText()));
    }

    private JTextArea createTextArea(boolean editable) {
        JTextArea simple = new JTextArea();
        simple.setEditable(editable);
        simple.setFont(UNICODE_FONT);
        return simple;
    }

    private JScrollPane wrapTextArea(JTextArea area) {
        JScrollPane scroller = new JScrollPane(area);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scroller;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unencodeButton = new javax.swing.JButton();
        encodeButton = new javax.swing.JButton();
        scriptOptionsGroup = new javax.swing.JPanel();
        optionsGroup = new javax.swing.JPanel();
        scriptBox = new javax.swing.JComboBox();
        scriptLabel = new javax.swing.JLabel();
        livePreview = new javax.swing.JCheckBox();
        scene = new javax.swing.JPanel();

        setTitle("Zalgo Unicode Text Polluter");

        unencodeButton.setText("Unencode");
        unencodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unencodeButtonActionPerformed(evt);
            }
        });

        encodeButton.setText("Encode");
        encodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeButtonActionPerformed(evt);
            }
        });

        scriptOptionsGroup.setLayout(new java.awt.BorderLayout());

        optionsGroup.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        scriptBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zalgo" }));

        scriptLabel.setText("Script:");

        livePreview.setSelected(true);
        livePreview.setText("Live preview");
        livePreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livePreviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsGroupLayout = new javax.swing.GroupLayout(optionsGroup);
        optionsGroup.setLayout(optionsGroupLayout);
        optionsGroupLayout.setHorizontalGroup(
            optionsGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsGroupLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(scriptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scriptBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(optionsGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(livePreview))
        );
        optionsGroupLayout.setVerticalGroup(
            optionsGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsGroupLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(optionsGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scriptBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scriptLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(livePreview)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        scene.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        scene.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(optionsGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scriptOptionsGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(398, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(encodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unencodeButton))
                        .addGap(6, 6, 6))))
            .addComponent(scene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scene, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(optionsGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scriptOptionsGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encodeButton)
                        .addGap(0, 0, 0)
                        .addComponent(unencodeButton)))
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void encodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeButtonActionPerformed
        output.setText(currentScript.encode(input.getText()));
    }//GEN-LAST:event_encodeButtonActionPerformed

    private void livePreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livePreviewActionPerformed
        unencodeButton.setVisible(!unencodeButton.isVisible());
        encodeButton.setVisible(!encodeButton.isVisible());
    }//GEN-LAST:event_livePreviewActionPerformed

    private void unencodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unencodeButtonActionPerformed
        output.setText(currentScript.unencode(input.getText()));
    }//GEN-LAST:event_unencodeButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new Zalgo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton encodeButton;
    private javax.swing.JCheckBox livePreview;
    private javax.swing.JPanel optionsGroup;
    private javax.swing.JPanel scene;
    private javax.swing.JComboBox scriptBox;
    private javax.swing.JLabel scriptLabel;
    private javax.swing.JPanel scriptOptionsGroup;
    private javax.swing.JButton unencodeButton;
    // End of variables declaration//GEN-END:variables
}
