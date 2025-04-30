package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private ImagePanel imagePanel;
    private BufferedImage player2;

    private int playerX = 200;
    private int playerY = 300;

    private int player2X = 300;
    private int player2Y = 400;

    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();
        // 메인 작업자가 서브 작업자를 생성한다.
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
    }

    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            backgroundImage = ImageIO.read(new File("images/background.png"));
            player1 = ImageIO.read(new File("images/player2.png"));
            player2 = ImageIO.read(new File("images/player.png"));
            // TODO player 이미지도 올려야 함.
        } catch (IOException e) {
            e.printStackTrace();
        }
        imagePanel = new ImagePanel();
    }

    private void setInitLayout() {
        add(imagePanel);
        setVisible(true);

    }

    private void addEventListener() {
        // JFrame 자체에 키 이벤트 리스너를 등록한다.
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(playerX == player2X || playerY == player2Y) {
            player1 = null;
        }
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            playerY -= 10;
        } else if (code == KeyEvent.VK_DOWN) {
            playerY += 10;
        } else if (code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        } else if (code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {



        // 그림을 다시 그려라

    }

    // 내부 클래스 생성
    private class ImagePanel extends JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, 120, 120, null);
            System.out.println(playerX);
            System.out.println(playerY);
            g.drawImage(player2, player2X, player2Y, 100, 100, null);
        }

        @Override
        public void run() {
            // direction -> true 라면 오른쪽 가고 있는 상태
            // direction -> false 라면 왼쪽으로 가고 있는 상태
            boolean direction = true;
            // 서브 작업자가 해야하는 일을 명시하도록 약속 되어 있다.
            while (flag) {
                if(direction) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if(player2X >= 800) {
                    direction = false;
                }

                if(player2X <= 100) {
                    direction = true;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                repaint();


            }

            // 그림을 다시 그려라


        }
    } // end of inner class

}
