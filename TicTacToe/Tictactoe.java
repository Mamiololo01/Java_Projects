import java.awt.*;
import java.awt.event.*;

class Gdemo extends Frame implements ActionListener{

    Button b[] = new Button[9];

    Button b1; // New game

    int k=0,x=8,y=28; //declares an integer variable and initializes it to 0.
    int a = 0; // O and X
    int z=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,z7=0,z8=0;
    int l = 70;

    // constructor
    Gdemo(){

        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.white);
        setForeground(Color.black);
         // nested loop
        for(int i=1;i<=3;i++){

            for(int j=1;j<=3;j++){

                b[k] = new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x,y);
                b[k].setFont(new Font("",Font.BOLD,40));

                add(b[k]);

                b[k].addActionListener(this);
                b[k].setBackground(new Color(255,141,28)); // ORANGE
                k++;
                x=x+100;
            }
            x=8;
            y=y+100;
        }

        b1 = new Button("New Game");
        b1.setSize(150,40);
        b1.setLocation(500,300);
        b1.setFont(new Font("",Font.BOLD,20));
        b1.setForeground(Color.black);

        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        // For new game
        if(e.getSource()==b1){

            for(int i=0;i<=8;i++){
                b[i].setLabel("");
            }
            z=0;z1=0;z2=0;z3=0;z4=0;z5=0;z6=0;z7=0;z8=0;
        }

        // For the 9 buttons

        if(e.getSource()==b[0] &&  z==0){

            if(a%2==0){
                b[0].setLabel("O"); z++; a++;
            }
            else{
                b[0].setLabel("X"); z++; a++;
            }

        }
        if(e.getSource()==b[1] &&  z1==0){

            if(a%2==0){
                b[1].setLabel("O"); z1++; a++;
            }
            else{
                b[1].setLabel("X"); z1++; a++;
            }

        }
        if(e.getSource()==b[2] &&  z2==0){

            if(a%2==0){
                b[2].setLabel("O"); z2++; a++;
            }
            else{
                b[2].setLabel("X"); z2++; a++;
            }

        }
        if(e.getSource()==b[3] &&  z3==0){

            if(a%2==0){
                b[3].setLabel("O"); z3++; a++;
            }
            else{
                b[3].setLabel("X"); z3++; a++;
            }

        }
        if(e.getSource()==b[4] &&  z4==0){

            if(a%2==0){
                b[4].setLabel("O"); z4++; a++;
            }
            else{
                b[4].setLabel("X"); z4++; a++;
            }

        }
        if(e.getSource()==b[5] &&  z5==0){

            if(a%2==0){
                b[5].setLabel("O"); z5++; a++;
            }
            else{
                b[5].setLabel("X"); z5++; a++;
            }

        }
        if(e.getSource()==b[6] &&  z6==0){

            if(a%2==0){
                b[6].setLabel("O"); z6++; a++;
            }
            else{
                b[6].setLabel("X"); z6++; a++;
            }

        }
        if(e.getSource()==b[7] &&  z7==0){

            if(a%2==0){
                b[7].setLabel("O"); z7++; a++;
            }
            else{
                b[7].setLabel("X"); z7++; a++;
            }

        }
        if(e.getSource()==b[8] &&  z8==0){

            if(a%2==0){
                b[8].setLabel("O"); z8++; a++;
            }
            else{
                b[8].setLabel("X"); z8++; a++;
            }

        }

        // Winning conditions

        Font f = new Font("",Font.BOLD,20);

        if(b[0].getLabel()==b[1].getLabel() && b[0].getLabel()==b[2].getLabel()){

            if(b[0].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[0].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[3].getLabel()==b[4].getLabel() && b[4].getLabel()==b[5].getLabel()){

            if(b[3].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[3].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()==b[8].getLabel()){

            if(b[6].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[6].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()==b[6].getLabel()){

            if(b[0].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[0].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()==b[7].getLabel()){

            if(b[1].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[1].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[2].getLabel()==b[5].getLabel() && b[5].getLabel()==b[8].getLabel()){

            if(b[2].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[2].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()==b[8].getLabel()){

            if(b[0].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[0].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(b[2].getLabel()==b[4].getLabel() && b[2].getLabel()==b[6].getLabel()){

            if(b[2].getLabel()=="O"){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(b[2].getLabel()=="X"){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
    }

}

class tictactoe{

    public static void main (String [] args){

        Gdemo f = new Gdemo();
    }
}
