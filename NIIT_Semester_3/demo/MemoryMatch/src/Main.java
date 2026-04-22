import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends JFrame{
    private final String[] symbols = {"❤️", "❤️", "❤️", "🍌", "🍌", "🍌", "🍇", "🍇", "🍇", "🍊", "🍊", "🍊", "🍍", "🍍", "🍍", "🍐", "🍐", "🍐", "🍉", "🍉", "🍉", "🐃", "🐃", "🐃"};

    private final JButton[] buttons = new JButton[24];
    private String[] board;
    private JButton firstCard = null;
    private JButton secondCard = null;
    private JButton thirdCard = null;
    private int matchesFound = 0;

    public Main() {
        setTitle("NIIT Modern 3- Way Memory Match");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 6, 10, 10));

        setupGame();
        setVisible(true);
    }

    private void setupGame() {
        //POJO Logic: Prepare the shuffled board
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, symbols);
        Collections.shuffle(list);
        board = list.toArray(new String[0]);

        // GUI Setup: Create buttons
        for (int i = 0; i < 24; i++){
            buttons[i] = new JButton("?");
            buttons[i].setFont(new Font("Segoe UI Emoji", Font.BOLD, 40));
            buttons[i].setFocusPainted(false);
            final int index = i;
            buttons[i].addActionListener(e -> handleCardClick(buttons[index],index));
            add(buttons[i]);
        }
    }

    private void handleCardClick(JButton clickedButton, int index){
        if (clickedButton.getText().equals("") || clickedButton == firstCard || clickedButton == secondCard || thirdCard !=null) return;

        clickedButton.setText(board[index]);
        if(firstCard == null){
            firstCard = clickedButton;
        } else if(secondCard == null) {
            secondCard = clickedButton;
        } else {
            thirdCard = clickedButton;
            Timer timer = new Timer(800, e -> checkMatch());
            timer.setRepeats(false);
            timer.start();
        }
    }

    private void checkMatch() {
        if (firstCard.getText().equals(secondCard.getText()) && secondCard.getText().equals(thirdCard.getText())) {
            firstCard.setEnabled(false);
            secondCard.setEnabled(false);
            thirdCard.setEnabled(false);
            matchesFound++;

            if (matchesFound == 8) JOptionPane.showMessageDialog(this, "Bishop, You Won!");
        } else{
            firstCard.setText("?");
            secondCard.setText("?");
            thirdCard.setText("?");
        }
        firstCard = null;
        secondCard = null;
        thirdCard = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}