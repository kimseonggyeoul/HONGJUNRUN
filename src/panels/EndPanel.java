package panels;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EndPanel extends JPanel {


   JButton btn_restart;

   JLabel score;

   JLabel background;

   ImageIcon btn = new ImageIcon("img/end/button.png");

   private int resultScore;//결과 점수판

   public void setResultScore(int resultScore) {
      score.setText(resultScore+"");
   }

   public EndPanel(Object o) {

      score = new JLabel("0");
      score.setHorizontalAlignment(SwingConstants.CENTER);
      score.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 70));
      score.setBounds(-120, 340, 459, 87);
      add(score);

      btn_restart = new JButton(btn);
      btn_restart.setName("endAccept");
      btn_restart.addMouseListener((MouseListener) o);
      btn_restart.setBounds(550, 370, 199, 81);
      btn_restart.setBorderPainted(false);
      btn_restart.setFocusPainted(false);
      btn_restart.setContentAreaFilled(false);
      add(btn_restart);

      background = new JLabel(" ");
      background.setHorizontalAlignment(SwingConstants.RIGHT);
      background.setBackground(SystemColor.activeCaptionText);
      background.setIcon(new ImageIcon("img/end/cookierunbg.png"));
      background.setBounds(0, 0, 888, 500);
      add(background);


   }
}