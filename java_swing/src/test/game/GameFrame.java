package test.game;

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
    private BufferedImage player2;
    private ImagePanel imagePanel;

    private int playerX = 200;
    private int playerY = 300;

    private int player2X = 300;
    private int player2Y = 400;

    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            backgroundImage = ImageIO.read(new File("images/background.png"));
            player1 = ImageIO.read(new File("images/player2.png"));
            player2 = ImageIO.read(new File("images/player.png"));

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
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_UP:
                playerY -= 10;
                break;
            case KeyEvent.VK_DOWN:
                playerY += 10;
                break;
            case KeyEvent.VK_RIGHT:
                playerX += 10;
                break;
            case KeyEvent.VK_LEFT:
                playerX -= 10;
                break;

        }

        repaint();
//        if(code == KeyEvent.VK_UP) {
//            playerY -= 10;
//        } else if(code == KeyEvent.VK_DOWN) {
//            playerY += 10;
//        } else if(code == KeyEvent.VK_LEFT) {
//            playerX -= 10;
//        } else if(code == KeyEvent.VK_RIGHT) {
//            playerX += 10;
//        }

        // 1. playerX == player2X && playerY == player2Y --> 동일 좌표에 있는 상태 판별
        if (playerX == player2X && playerY == player2Y) {
            System.out.println("X 좌표선상에서 같은 위치를 가리킨다");
            player1 = null;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    private class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, 100, 100, null);

        }
    }

}
