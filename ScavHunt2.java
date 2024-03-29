/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ScavHunt2.java
 *
 * Created on Feb 16, 2014, 12:52:58 PM
 */
package scavhunt;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import java.io.*;

/**
 *
 * @author sanjose
 */
public class ScavHunt2 extends javax.swing.JFrame {
    
 
    String tsk = "task.txt";
    String qst[] = new String[5];
    int scores=0;
    boolean currentTask1 = false,currentTask2 = false,currentTask3 = false
                ,currentTask4 = false,currentTask5 = false,currentTask6 = false,
                currentTask7 = false,currentTask8 = false,currentTask9 = false,
            currentTask10=false;
    boolean a1=false,a2=false,
            a3=false,a4=false,a5=false,a6=false,a7=false,
            a8=false,a9=false,a10=false;
                      
    /** Creates new form ScavHunt2 */
    public ScavHunt2() {
        initComponents();
      

    }
    public void setName(String name){
        uname.setText("Welcome "+name+"!");
                
    }
  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelNo = new javax.swing.JLabel();
        taskLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskList = new javax.swing.JList();
        scorelabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(-1,true));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        uname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        uname.setText("Welcome ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Scavenger Hunt 2014");

        jPanel3.setBackground(new java.awt.Color(-1,true));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Task", 0, 0, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel3.setFocusable(false);
        jPanel3.setMaximumSize(null);
        jPanel3.setMinimumSize(null);
        jPanel3.setOpaque(false);

        labelNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        taskLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Answer:");

        answer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(-1,true));
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(taskLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNo)
                .addGap(18, 18, 18)
                .addComponent(taskLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        taskList.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        taskList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Task#1", "Task#2", "Task#3", "Task#4", "Task#5", "Task#6", "Task#7", "Task#8", "Task#9", "Task#10" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        taskList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        taskList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taskList);

        scorelabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        scorelabel.setText("Points: 0pts");

        jButton2.setBackground(new java.awt.Color(-65536,true));
        jButton2.setText("Show Results");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uname, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scorelabel)))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scorelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
   
    private void taskListMouseClicked(java.awt.event.MouseEvent evt) {                                      
         
      
       int index = taskList.locationToIndex(evt.getPoint());
        Object op = taskList.getModel().getElementAt(index);
        
                if(index==0){labelNo.setText("# "+Integer.toString(index+1));
                            taskLabel.setText("Who invented the Frisbee? ");
                 currentTask1 = true;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==1){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Which inventor was often called the Lady Edison?");
                 currentTask1 = false;currentTask2 = true;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==2){labelNo.setText("# "+Integer.toString(index+1));
                            taskLabel.setText("What invention did Vannevar Bush write about in a 1945 essay?");
                 currentTask1 = false;currentTask2 = false;currentTask3 = true;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==3){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Who was the inventor of the first television?");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = true;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==4){labelNo.setText("# "+Integer.toString(index+1));
                            taskLabel.setText("Cleopatra's son by Julius Caesar");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = true;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==5){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Location of the Temple of Hathor");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = true;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;}
                if(index==6){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("King who spent 67 years on the throne");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = true;currentTask8 = false;currentTask9 = false;}
                if(index==7){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Where in the world: King penguin");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = true;currentTask9 = false;}
                if(index==8){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Where in the world: Gila monster");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = true;}
                if(index==9){labelNo.setText("# "+Integer.toString(index+1));
                             taskLabel.setText("Where in the world: Muntjac");
                 currentTask1 = false;currentTask2 = false;currentTask3 = false;
               currentTask4 = false;currentTask5 = false;currentTask6 = false;
                currentTask7 = false;currentTask8 = false;currentTask9 = false;
                currentTask10=true;}
               
               
    }                                     

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
                if(currentTask1==true){ if("Walter Frederick Morrison".equalsIgnoreCase(answer.getText()) && a1!=true){
                    scorelabel.setText("Points: "+Integer.toString(scores+=10));a1=true;
                 JOptionPane.showMessageDialog(null,"You're Answer is Correct!");answer.setText("");}}
                if(currentTask2==true){ if("Beulah Louise Henry".equalsIgnoreCase(answer.getText())&& a2!=true){a2=true;scorelabel.setText("Points: "+Integer.toString(scores+=10));
                JOptionPane.showMessageDialog(null,"You're Answer is Correct!");answer.setText("");}
                     }
                if(currentTask3==true){ if("Memex".equalsIgnoreCase(answer.getText())&& a3!=true){scorelabel.setText("Points: "+Integer.toString(scores+=10));
                a3=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");answer.setText("");}}
                if(currentTask4==true){ if("Philo Farnsworth".equalsIgnoreCase(answer.getText()) && a4!=true){scorelabel.setText("Points: "+Integer.toString(scores+=10));
                a4=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");answer.setText("");}
                     }
                if(currentTask5==true){ if("Caesarion".equalsIgnoreCase(answer.getText())&& a5!=true){answer.setText("");a4=false;;
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a5=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}
                    }
                if(currentTask6==true){ if("Qena Egypt".equalsIgnoreCase(answer.getText())&& a6!=true){answer.setText("");
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a6=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}}
                if(currentTask7==true){ if("King Ramesses".equalsIgnoreCase(answer.getText())&& a7!=true){answer.setText("");
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a7=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}}
                if(currentTask8==true){ if("Antarctica".equalsIgnoreCase(answer.getText())&& a8!=true){answer.setText("");
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a8=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}}
                if(currentTask9==true){ if("Mexico".equalsIgnoreCase(answer.getText())&& a9!=true){answer.setText("");
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a9=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}}
                if(currentTask10==true){ if("Taiwan".equalsIgnoreCase(answer.getText())&& a10!=true){
                scorelabel.setText("Points: "+Integer.toString(scores+=10));a10=true;JOptionPane.showMessageDialog(null,"You're Answer is Correct!");}}
               
    }                                     

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
      if(a1==true &&a2==true &&a3==true &&a4==true &&a5==true &&a6==true &&a7==true &&a8==true &&a9==true &&a10==true){
                    JOptionPane.showMessageDialog(null,"Congratulations You Got a Perfect Score!");
                     JOptionPane.showMessageDialog(null,"Thank you for playing our Game :)");
               System.exit(0);}
       else{
            JOptionPane.showMessageDialog(null,"Your Total Score:"+scores);
            JOptionPane.showMessageDialog(null,"Thank you for playing our Game :)");
      System.exit(0);}
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ScavHunt2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField answer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNo;
    private javax.swing.JLabel scorelabel;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JList taskList;
    private javax.swing.JLabel uname;
    // End of variables declaration                   
}
