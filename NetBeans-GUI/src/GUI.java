
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame
{
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gPlayerInfoText = new javax.swing.JTextField();
        gCardPanel5 = new CardPanel();
        gCardPanel4 = new CardPanel();
        gCardPanel3 = new CardPanel();
        gCardPanel2 = new CardPanel();
        gCardPanel1 = new CardPanel();
        gCardPanel0 = new CardPanel();
        gFinishTurn = new javax.swing.JButton();
        gCardPanelDealer0 = new CardPanel();
        gCardPanelDealer1 = new CardPanel();
        StandButton = new javax.swing.JButton();
        HitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blackjack");
        setResizable(false);

        gPlayerInfoText.setText("PLAYER_INFO_TEXT");

        gCardPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel5.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel5Layout = new javax.swing.GroupLayout(gCardPanel5);
        gCardPanel5.setLayout(gCardPanel5Layout);
        gCardPanel5Layout.setHorizontalGroup(
            gCardPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel5Layout.setVerticalGroup(
            gCardPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel4.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel4Layout = new javax.swing.GroupLayout(gCardPanel4);
        gCardPanel4.setLayout(gCardPanel4Layout);
        gCardPanel4Layout.setHorizontalGroup(
            gCardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel4Layout.setVerticalGroup(
            gCardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel3.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel3Layout = new javax.swing.GroupLayout(gCardPanel3);
        gCardPanel3.setLayout(gCardPanel3Layout);
        gCardPanel3Layout.setHorizontalGroup(
            gCardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel3Layout.setVerticalGroup(
            gCardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel2.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel2Layout = new javax.swing.GroupLayout(gCardPanel2);
        gCardPanel2.setLayout(gCardPanel2Layout);
        gCardPanel2Layout.setHorizontalGroup(
            gCardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel2Layout.setVerticalGroup(
            gCardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel1.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel1Layout = new javax.swing.GroupLayout(gCardPanel1);
        gCardPanel1.setLayout(gCardPanel1Layout);
        gCardPanel1Layout.setHorizontalGroup(
            gCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel1Layout.setVerticalGroup(
            gCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanel0.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanel0Layout = new javax.swing.GroupLayout(gCardPanel0);
        gCardPanel0.setLayout(gCardPanel0Layout);
        gCardPanel0Layout.setHorizontalGroup(
            gCardPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanel0Layout.setVerticalGroup(
            gCardPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gFinishTurn.setText("Finish Turn");
        gFinishTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gFinishTurnActionPerformed(evt);
            }
        });

        gCardPanelDealer0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanelDealer0.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanelDealer0Layout = new javax.swing.GroupLayout(gCardPanelDealer0);
        gCardPanelDealer0.setLayout(gCardPanelDealer0Layout);
        gCardPanelDealer0Layout.setHorizontalGroup(
            gCardPanelDealer0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanelDealer0Layout.setVerticalGroup(
            gCardPanelDealer0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        gCardPanelDealer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gCardPanelDealer1.setPreferredSize(new java.awt.Dimension(172, 264));

        javax.swing.GroupLayout gCardPanelDealer1Layout = new javax.swing.GroupLayout(gCardPanelDealer1);
        gCardPanelDealer1.setLayout(gCardPanelDealer1Layout);
        gCardPanelDealer1Layout.setHorizontalGroup(
            gCardPanelDealer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        gCardPanelDealer1Layout.setVerticalGroup(
            gCardPanelDealer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        StandButton.setText("Stand");
        StandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandButtonActionPerformed(evt);
            }
        });

        HitButton.setText("Hit");
        HitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gPlayerInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(gCardPanelDealer0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(gCardPanelDealer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(gCardPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gCardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gCardPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gCardPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gCardPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gCardPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gFinishTurn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StandButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gPlayerInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gCardPanelDealer0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanelDealer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gCardPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gCardPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gFinishTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gFinishTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gFinishTurnActionPerformed
        this.turn = 0;
    }//GEN-LAST:event_gFinishTurnActionPerformed

    private void StandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandButtonActionPerformed
        this.actionTurn = 0;
        this.userAction = Player.Action.STAND;
    }//GEN-LAST:event_StandButtonActionPerformed

    private void HitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitButtonActionPerformed
        this.actionTurn = 0;
        this.userAction = Player.Action.HIT;
    }//GEN-LAST:event_HitButtonActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HitButton;
    private javax.swing.JButton StandButton;
    private CardPanel gCardPanel0;
    private CardPanel gCardPanel1;
    private CardPanel gCardPanel2;
    private CardPanel gCardPanel3;
    private CardPanel gCardPanel4;
    private CardPanel gCardPanel5;
    private CardPanel gCardPanelDealer0;
    private CardPanel gCardPanelDealer1;
    private javax.swing.JButton gFinishTurn;
    private javax.swing.JTextField gPlayerInfoText;
    // End of variables declaration//GEN-END:variables

    private Scanner kb;
    private Deck deck;
    private Player[] playerArr;
    private Dealer dealer;
    private int actionTurn = 1;
    private Player.Action userAction;
    private volatile int turn = 1;
    
    
    public GUI() 
    {
        
    }
    
    private void updatePlayerName(Player a)
    {
        this.gPlayerInfoText.setText(a.getName());
    }
    
    public void start()
    {
        initComponents();
        this.setVisible(true);
        
        this.userAction = Player.Action.NOTHING;
        this.kb = new Scanner(System.in);
        this.deck = new Deck();
        this.playerArr = new Player[5];
        for (int i = 0; i < playerArr.length; i++)
        {
                this.playerArr[i] = new Player("Player_" + i);
        }
        this.dealer = new Dealer();


        for (int i = 0; i < playerArr.length; i++)
        {
                updatePlayerName(playerArr[i]);
                playerGetCard(playerArr[i]);
                
        }
       
        System.out.println("Finished with first two cards.");
        
        updatePlayerName(dealer);
        delaerGetCard(dealer);

        System.out.println("Finished with dealer getting first two cards.");
        
        for (int i = 0; i < playerArr.length; i++)
        {
                choice(playerArr[i]);
                System.out.println("\n\n");
        }

        // Now Dealer gets his card
        delaerCheckDraw(dealer);


        for (int i = 0; i < playerArr.length; i++)
        {
                checkWinner(playerArr[i], dealer);
        }
    }
    
    private void checkWinner(Player a, Dealer b)
    {
        System.out.println(a.getName() + " has " + a.getPoints() + " points");
        System.out.println(b.getName() + " has " + b.getPoints() + " points");
        if (!a.isAlive() && !b.isAlive()) // dealer wins
        {
                System.out.println(b.getName() + " wins.");
        }
        else if (a.isAlive() && b.isAlive() && (a.getPoints() > b.getPoints())) // player wins
        {
                System.out.println(a.getName() + " wins");
        }
        else if (a.isAlive() && b.isAlive() && (a.getPoints() < b.getPoints())) // dealer wins
        {
                System.out.println(b.getName() + " wins.");
        }
        System.out.println("\nEnd\n");
    }
    
    private void delaerCheckDraw(Dealer a) 
    {
        if (a.getPoints() < Dealer.DRAW_AGAIN)
        {
                a.getCard(deck);
        }
    }

    private void delaerGetCard(Dealer a)
    {
        a.getCard(deck);
        //System.out.println(a.getName() + " draws a card and it is " + a.getLastCard().getName());
        gCardPanelDealer0.setImage(a.getLastCard());
        a.getCard(deck);
        //System.out.println("Delaer secret is " + a.getLastCard().getName() + "\n\n");
        gCardPanelDealer1.setImage(a.getLastCard());
    }

    private void playerGetCard(Player a)
    {
        a.getCard(deck);
        //System.out.println(a.getName() + " draws a card and it is " + a.getLastCard().getName());
        checkAce(a);
        //System.out.println(a.getLastCard().getImageString());
        gCardPanel0.setImage(a.getLastCard());

        a.getCard(deck);
        //System.out.println(a.getName() + " also draws " + a.getLastCard().getName());
        checkAce(a);
        //System.out.println(a.getLastCard().getImageString());
        //System.out.println("VALUE BROKEN = " + a.getLastCard().getValue());
        gCardPanel1.setImage(a.getLastCard());
        
        //a.seeCard();
        
        // Stay here untill user clicks end turn button
        while(true)
        {
            // TODO add a timer to quit the loop if user goes afk
            if (this.turn == 0)
            {
                this.turn = 1; // Set to default 1
                break;
            }
        }
        //choice(a);
    }

    private void choice(Player a)
    {
        //System.out.println(a.getName() + " Would you like to pick another card ? \n1 = Yes\n0 = No");

        // While user does not hit or stand
        Player.Action choice = Player.Action.NOTHING;
        while (true)
        {
            if (this.actionTurn == 0)
            {
                choice = userAction;
                
                this.actionTurn = 1;
                break;
            }
        }

        //TODO render the new hand
        if (choice == Player.Action.HIT)
        {
            a.getCard(deck);
            a.seeCard();
            checkAce(a);
            choice(a);
        }
        else if (choice == Player.Action.STAND)
        {
            System.out.println(a.getName() + " did not pick a card and finished their turn.");
            a.seeCard();
        }
        else
        {
            System.out.println("Wrong option.");
            choice(a);
        }
    }

    private void checkAce(Player a)
    {
        if (a.hasAce() != -1)
        {
            if (a.getAceCount() != 0)
            {
                //System.out.println(a.getName() + " got an Ace, would you like to change the value from 11 to 1? \n1 = Yes\n0 = No");
                if (JOptionPane.showConfirmDialog(null, "You got an Ace, would you like to change the value from 11 to 1 ?", "ACE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                {
                    a.changeCardValue();
                }
                else
                {
                    a.decreaseAceCount();
                }
            }
        }
    }

}
