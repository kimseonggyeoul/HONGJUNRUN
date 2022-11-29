package panels;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ingame.CookieImg;

public class SelectPanel extends JPanel{

	// 홍준런 이미지
	private ImageIcon hongjunrun = new ImageIcon("img/select/hongjunrun.png");

	// 선택된 홍준런 이미지
	private ImageIcon selectedHongjunrun = new ImageIcon("img/select/selectedHongjunrun.png");

	// 시작 버튼
	private ImageIcon start = new ImageIcon("img/select/GameStartBtn.png");

	// 이미지를 선택할 버튼
	private JButton btn;

	// 시작 버튼
	private JButton StartBtn;

	// 게임에서 사용할 쿠키 이미지들을 담을 오브젝트
	private CookieImg ci;

	// 쿠키 이미지를 메인에서 gamePanel로 보내기 위한 getter
	public CookieImg getCi() {
		return ci;
	}

	public SelectPanel(Object o) {

		// 시작 버튼
		StartBtn = new JButton(start);
		StartBtn.setName("StartBtn");
		StartBtn.addMouseListener((MouseListener) o);
		StartBtn.setBounds(254, 334, 291, 81);
		add(StartBtn);
		StartBtn.setBorderPainted(false);
		StartBtn.setContentAreaFilled(true);
		StartBtn.setFocusPainted(false);

		btn = new JButton(hongjunrun);
		btn.setName("ch1");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn.getIcon() != selectedHongjunrun) {
					btn.setIcon(selectedHongjunrun);
					ci = new CookieImg(new ImageIcon("img/cookieimg/player_origin.gif"),
							new ImageIcon("img/cookieimg/player_up.png"),
							new ImageIcon("img/cookieimg/player_doubleup.gif"),
							new ImageIcon("img/cookieimg/player_jumpend.png"),
							new ImageIcon("img/cookieimg/player_down.gif"),
							new ImageIcon("img/cookieimg/player_attack.png"));
				} else {
					btn.setIcon(hongjunrun);
					ci =null;
				}
			}
		});

		btn.setBounds(312, 102, 150, 200);
		add(btn);
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);

		// 배경
		JLabel selectBg = new JLabel("");
		selectBg.setForeground(Color.ORANGE);
		selectBg.setHorizontalAlignment(SwingConstants.CENTER);
		selectBg.setIcon(new ImageIcon("img/select/background.png"));
		selectBg.setBounds(0, 0, 784, 461);
		add(selectBg);

		// 캐릭터 선택 타이틀
		JLabel selectTxt = new JLabel("");
		selectTxt.setHorizontalAlignment(SwingConstants.CENTER);
		selectTxt.setIcon(new ImageIcon("img/select/selectTxt.png"));
		selectTxt.setBounds(174, 20, 397, 112);
		add(selectTxt);

	}


}
