package zalgo.script;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import zalgo.Script;

/**
 *
 * @author Tudor
 */
public class ZalgoScript implements Script {
    // Tables from http://eeemo.net/

    public static final char[] UP = {
        '\u030d', /*     ̍     */ '\u030e', /*     ̎     */ '\u0304', /*     ̄     */ '\u0305', /*     ̅     */
        '\u033f', /*     ̿     */ '\u0311', /*     ̑     */ '\u0306', /*     ̆     */ '\u0310', /*     ̐     */
        '\u0352', /*     ͒     */ '\u0357', /*     ͗     */ '\u0351', /*     ͑     */ '\u0307', /*     ̇     */
        '\u0308', /*     ̈     */ '\u030a', /*     ̊     */ '\u0342', /*     ͂     */ '\u0343', /*     ̓     */
        '\u0344', /*     ̈́     */ '\u034a', /*     ͊     */ '\u034b', /*     ͋     */ '\u034c', /*     ͌     */
        '\u0303', /*     ̃     */ '\u0302', /*     ̂     */ '\u030c', /*     ̌     */ '\u0350', /*     ͐     */
        '\u0300', /*     ̀     */ '\u0301', /*     ́     */ '\u030b', /*     ̋     */ '\u030f', /*     ̏     */
        '\u0312', /*     ̒     */ '\u0313', /*     ̓     */ '\u0314', /*     ̔     */ '\u033d', /*     ̽     */
        '\u0309', /*     ̉     */ '\u0363', /*     ͣ     */ '\u0364', /*     ͤ     */ '\u0365', /*     ͥ     */
        '\u0366', /*     ͦ     */ '\u0367', /*     ͧ     */ '\u0368', /*     ͨ     */ '\u0369', /*     ͩ     */
        '\u036a', /*     ͪ     */ '\u036b', /*     ͫ     */ '\u036c', /*     ͬ     */ '\u036d', /*     ͭ     */
        '\u036e', /*     ͮ     */ '\u036f', /*     ͯ     */ '\u033e', /*     ̾     */ '\u035b', /*     ͛     */
        '\u0346', /*     ͆     */ '\u031a' /*     ̚     */};
    public static final char[] DOWN = {
        '\u0316', /*     ̖     */ '\u0317', /*     ̗     */ '\u0318', /*     ̘     */ '\u0319', /*     ̙     */
        '\u031c', /*     ̜     */ '\u031d', /*     ̝     */ '\u031e', /*     ̞     */ '\u031f', /*     ̟     */
        '\u0320', /*     ̠     */ '\u0324', /*     ̤     */ '\u0325', /*     ̥     */ '\u0326', /*     ̦     */
        '\u0329', /*     ̩     */ '\u032a', /*     ̪     */ '\u032b', /*     ̫     */ '\u032c', /*     ̬     */
        '\u032d', /*     ̭     */ '\u032e', /*     ̮     */ '\u032f', /*     ̯     */ '\u0330', /*     ̰     */
        '\u0331', /*     ̱     */ '\u0332', /*     ̲     */ '\u0333', /*     ̳     */ '\u0339', /*     ̹     */
        '\u033a', /*     ̺     */ '\u033b', /*     ̻     */ '\u033c', /*     ̼     */ '\u0345', /*     ͅ     */
        '\u0347', /*     ͇     */ '\u0348', /*     ͈     */ '\u0349', /*     ͉     */ '\u034d', /*     ͍     */
        '\u034e', /*     ͎     */ '\u0353', /*     ͓     */ '\u0354', /*     ͔     */ '\u0355', /*     ͕     */
        '\u0356', /*     ͖     */ '\u0359', /*     ͙     */ '\u035a', /*     ͚     */ '\u0323' /*     ̣     */};
    public static final char[] MIDDLE = {
        '\u0315', /*     ̕     */ '\u031b', /*     ̛     */ '\u0340', /*     ̀     */ '\u0341', /*     ́     */
        '\u0358', /*     ͘     */ '\u0321', /*     ̡     */ '\u0322', /*     ̢     */ '\u0327', /*     ̧     */
        '\u0328', /*     ̨     */ '\u0334', /*     ̴     */ '\u0335', /*     ̵     */ '\u0336', /*     ̶     */
        '\u034f', /*     ͏     */ '\u035c', /*     ͜     */ '\u035d', /*     ͝     */ '\u035e', /*     ͞     */
        '\u035f', /*     ͟     */ '\u0360', /*     ͠     */ '\u0362', /*     ͢     */ '\u0338', /*     ̸     */
        '\u0337', /*     ̷     */ '\u0361', /*     ͡     */ '\u0489' /*     ҉_     */};
    private static final String STARTUP_TEXT = "To invoke the hive-mind representing chaos.\n"
            + "Invoking the feeling of chaos.\n"
            + "With out order.\n"
            + "The Nezperdian hive-mind of chaos. Zalgo.\n"
            + "He who Waits Behind The Wall.\n"
            + "ZALGO!";

    public ZalgoScript() {
        // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
        fuckupGroup = new JPanel();
        lowFuckup = new JRadioButton();
        normalFuckup = new JRadioButton();
        kaziFuckup = new JRadioButton();
        customFuckup = new JRadioButton();
        fuckupSpinner = new JSpinner();
        doFuckDown = new JCheckBox();
        doFuckMiddle = new JCheckBox();
        doFuckUp = new JCheckBox();
        optionSeparator = new JSeparator();

        fuckupGroup.setBorder(BorderFactory.createTitledBorder("Fuckup"));

        lowFuckup.setText("Low");

        normalFuckup.setSelected(true);
        normalFuckup.setText("Normal");

        kaziFuckup.setText("Maximum");

        customFuckup.setText("Custom:");

        fuckupSpinner.setEnabled(false);

        doFuckDown.setSelected(true);
        doFuckDown.setText("Fuck going down");

        doFuckMiddle.setSelected(true);
        doFuckMiddle.setText("Fuck up middle");
        doFuckMiddle.setToolTipText("");

        doFuckUp.setSelected(true);
        doFuckUp.setText("Fuck going up");

        optionSeparator.setOrientation(SwingConstants.VERTICAL);

        GroupLayout fuckupGroupLayout = new GroupLayout(fuckupGroup);
        fuckupGroup.setLayout(fuckupGroupLayout);
        fuckupGroupLayout.setHorizontalGroup(
                fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addComponent(customFuckup)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fuckupSpinner))
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, fuckupGroupLayout.createSequentialGroup()
                .addComponent(normalFuckup)
                .addGap(16, 16, 16))
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(kaziFuckup)
                .addComponent(lowFuckup))
                .addGap(6, 6, 6)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionSeparator, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(doFuckDown, GroupLayout.Alignment.TRAILING)
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addComponent(doFuckMiddle)
                .addGap(10, 10, 10))
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addComponent(doFuckUp)
                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap()));
        fuckupGroupLayout.setVerticalGroup(
                fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(fuckupGroupLayout.createSequentialGroup()
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(lowFuckup)
                .addComponent(doFuckUp, GroupLayout.Alignment.LEADING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(normalFuckup)
                .addComponent(doFuckMiddle))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(kaziFuckup)
                .addComponent(doFuckDown)))
                .addComponent(optionSeparator))
                .addGap(0, 0, 0)
                .addGroup(fuckupGroupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(customFuckup)
                .addComponent(fuckupSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))));
        ButtonGroup levels = new ButtonGroup();
        ActionListener hideCustom = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fuckupSpinner.setEnabled(false);
            }
        };
        lowFuckup.addActionListener(hideCustom);
        normalFuckup.addActionListener(hideCustom);
        kaziFuckup.addActionListener(hideCustom);
        levels.add(lowFuckup);
        levels.add(normalFuckup);
        levels.add(kaziFuckup);
        levels.add(customFuckup);

        customFuckup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fuckupSpinner.setEnabled(!fuckupSpinner.isEnabled());
            }
        });
        // </editor-fold>  
    }

    public String encode(String text) {
        StringBuilder zalgo = new StringBuilder();
        for (char c : text.toCharArray()) {
            zalgo.append(c);
            int level = 0;
            if (lowFuckup.isSelected()) {
                level = 2;
            } else if (normalFuckup.isSelected()) {
                level = 4;
            } else if (kaziFuckup.isSelected()) {
                level = 8;
            } else if (customFuckup.isSelected()) {
                level = (Integer) fuckupSpinner.getValue();
            }
            if (doFuckUp.isSelected()) {
                for (int u = 0; u != level; u++) {
                    zalgo.append(randomize(UP));
                }
            }
            if (doFuckDown.isSelected()) {
                for (int d = 0; d != level; d++) {
                    zalgo.append(randomize(DOWN));
                }
            }
            if (doFuckMiddle.isSelected()) {
                for (int m = 0; m != level; m++) {
                    zalgo.append(randomize(MIDDLE));
                }
            }
        }
        return zalgo.toString();
    }

    private static char randomize(char[] array) {
        return array[(int) Math.floor(Math.random() * array.length)];
    }

    public String unencode(String text) {
        StringBuilder plain = new StringBuilder();
        for (char c : text.toCharArray()) {
            for (int i = 0; i < UP.length; i++) {
                if (c == UP[i]) {
                    continue;
                }
            }
            for (int i = 0; i < DOWN.length; i++) {
                if (c == DOWN[i]) {
                    continue;
                }
            }
            for (int i = 0; i < MIDDLE.length; i++) {
                if (c == MIDDLE[i]) {
                    continue;
                }
            }
            plain.append(c);
        }

        return plain.toString();
    }

    public Component getOptionPane() {
        return fuckupGroup;
    }

    public String getExampleText() {
        return STARTUP_TEXT;
    }
    private JRadioButton customFuckup;
    private JCheckBox doFuckDown;
    private JCheckBox doFuckMiddle;
    private JCheckBox doFuckUp;
    private JPanel fuckupGroup;
    private JSpinner fuckupSpinner;
    private JRadioButton kaziFuckup;
    private JRadioButton lowFuckup;
    private JRadioButton normalFuckup;
    private JSeparator optionSeparator;
}
