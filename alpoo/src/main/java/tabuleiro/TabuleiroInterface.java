package tabuleiro;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TabuleiroInterface extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton[][] sq = new JButton[3][3];
    int m,n;

    public TabuleiroInterface()
    {
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,3));

        ButaneListener pushed = new ButaneListener();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                JButton n = new JButton();
                sq[i][j] = n;
                sq[i][j].addActionListener(pushed);
                sq[i][j].setBackground(Color.pink);
                container.add(sq[i][j]);
            }
        }
    }

    public void scramble()
    {
        boolean[] used = new boolean[9];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                int val = (int)(9*Math.random());
                while(used[val])
                {
                    val = (int)(9*Math.random());
                }
                used[val] = true;
                if(val!=0)
                    sq[i][j].setText(""+val);
                else
                {
                    sq[i][j].setBackground(Color.gray);
                    m=i; n=j;
                }
            }
        }
    }


    class ButaneListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Object square = e.getSource();
            outer: for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    if(sq[i][j]== square)
                    {
                        moves(i,j);
                        break outer;
                    }
                }
            }
        }
    }

    public void moves(int i, int j)
    {
        if((i+1==m && j==n) || (i-1==m && j==n) || (i==m && j+1==n) || (i==m && j-1==n))
        {
            sq[m][n].setText(sq[i][j].getText());
            sq[m][n].setBackground(Color.pink);
            sq[i][j].setText("");
            sq[i][j].setBackground(Color.gray);
            m=i; n=j;
        }
    }
}

