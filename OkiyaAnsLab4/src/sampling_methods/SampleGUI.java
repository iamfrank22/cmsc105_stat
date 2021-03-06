/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampling_methods;

import java.util.InputMismatchException;
import java.util.Scanner;
import minisp.Menu;

/**
 *
 * @author Franklin
 */
public class SampleGUI extends javax.swing.JFrame {

    /**
     * Creates new form SampleGUI
     */
    public SampleGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic Sampling Methods");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BASIC SAMPLING METHODS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 46, 480, 40);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton1.setText("Simple Random");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 180, 320, 50);

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton2.setText("Systematic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 280, 320, 50);

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton3.setText("Stratified");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(220, 380, 320, 50);

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton4.setText("Quit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(220, 490, 320, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        Scanner input = new Scanner(System.in);
        
        Sampling sample = new Sampling();
		
        int choice = -1;
        int pop_size = -1;
        int data_type = -1;
        int size_choice = -1;
        int sample_size = -1;
        int percent = -1;
        int repeat = 0;


        int[] numList;
        char[] charList;
		
                
			
			System.out.println();
				do {
					System.out.println();
					System.out.println("********************************");
					System.out.println("Enter the population size. > ");
					try {
						pop_size = Integer.parseInt(input.nextLine());
						break;
					} catch(NumberFormatException e) {
						pop_size = -1;
						System.out.println("Invalid input! Please try again.");
					}
				} while(pop_size < 1);
				
				System.out.println();
				do {
					System.out.println();
					System.out.println("********************************");
					System.out.println("Which of the following data type do you prefer?");
	        System.out.println("[1] NUMERICAL");
	        System.out.println("[2] CHARACTER");
	        try {
	        	data_type = input.nextInt();
	        } catch(InputMismatchException e) {
	        	data_type = -1;
	        	System.out.println("Invalid input! Please try again.");
	        }
	        input.nextLine();
				} while(data_type < 1 || data_type > 2);
				
				if(data_type == 1) {
	        sample = new Sampling(1);
	      } else
	        if(data_type == 2) {
	        sample = new Sampling(2);
	      }
	      
	      numList = new int[pop_size];
	      charList = new char[pop_size];
				
				if(data_type == 1) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
	        	System.out.println();
	          System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              numList[ctr] = input.nextInt();
	            }catch(InputMismatchException e) {
	            	numList[ctr] = -1;
	              System.out.println("Invalid input! Please try again.");
	            }
	            input.nextLine();
	          }while(numList[ctr] < 1);
	        }
	        
	        sample.Sampling(numList, pop_size);
	      } else 
	        if(data_type == 2) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
                    System.out.println();
                    System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              charList[ctr] = input.next().charAt(0);     
	              if(charList[ctr] >= '0' && charList[ctr] <= '9')
	                throw new Exception();
	            }catch(Exception e) {
	              System.out.println("Invalid input! Please try again.");
	            }
	            
	            input.nextLine();
	          }while(charList[ctr] >= '0' && charList[ctr] <= '9');
	        }
	        sample.Sampling(charList, pop_size);
	      }
	      sample.display();
				
	      System.out.println("\n\n");
				System.out.println("Press ENTER to continue...");
        input.nextLine();
        try{
          Thread.sleep(2000);
        } catch(InterruptedException e) {
          Thread.currentThread().interrupt();
        }
			
			
				do {
					System.out.println("\n\n");
					System.out.println("********************************");
					System.out.println("**** SIMPLE RANDOM SAMPLING ****");
					System.out.println("********************************");
					do {
						System.out.println();
						System.out.println("Do you want to input sample size?");
						System.out.println("[1] YES");
						System.out.println("[2] NO");
						try {
							size_choice = input.nextInt();
						} catch(InputMismatchException e) {
							size_choice = -1;
							System.out.println("Invalid input! Please try again.");
						}
						input.nextLine();
					} while(size_choice < 1 || size_choice > 2);
					
					if(size_choice == 1) {
						do {
							System.out.println();
							System.out.println("********************************");
							System.out.println("Enter the sample size");
							try {
								sample_size = Integer.parseInt(input.nextLine());
								break;
							} catch(NumberFormatException e) {
								sample_size = -1;
								System.out.println("Invalid input! Please try again.");
							}
							input.nextLine();
						} while(sample_size < pop_size && sample_size < 1);
					}
					else {
						sample_size = (int) Math.ceil(pop_size * 0.20);
					}
					
					sample.SimpleRandom(sample_size);
					
					int choice4 = -1;
          
             do {
          	System.out.println("\n\n");
          	System.out.println("********************************");
                System.out.println("Do you want to display the simualation again?");
                System.out.println("[1] YES");
                System.out.println("[2] NO");
	         try {
	              choice4 = input.nextInt();
	          } catch(InputMismatchException e) {
	              System.out.println("Invalid input! Please try again.");
	          }
	          input.nextLine();
            } while(choice4 < 1 || choice4 > 2);

             if(choice4 == 2) {
                repeat = 1;
                this.setVisible(false);
                new SampleGUI().setVisible(true);
                
            }
            else {
                repeat = 0;
            }			
            } while(repeat == 0);
                                
            System.out.println("\n\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        Scanner input = new Scanner(System.in);
	
        Sampling sample = new Sampling();
		
        int choice = -1;
        int pop_size = -1;
        int data_type = -1;
        int size_choice = -1;
        int sample_size = -1;
        int percent = -1;
        int repeat = 0;
		
		
        int[] numList;
        char[] charList;
		
			
                do {
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Enter the population size. > ");
                    try {
                            pop_size = Integer.parseInt(input.nextLine());
                            break;
                    } catch(NumberFormatException e) {
                            pop_size = -1;
                            System.out.println("Invalid input! Please try again.");
                    }
                } while(pop_size < 1);

                    System.out.println();
                do {
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Which of the following data type do you prefer?");
                    System.out.println("[1] NUMERICAL");
                    System.out.println("[2] CHARACTER");
                    try {
	        	data_type = input.nextInt();
                    } catch(InputMismatchException e) {
	        	data_type = -1;
	        	System.out.println("Invalid input! Please try again.");
                    }
                    input.nextLine();
                } while(data_type < 1 || data_type > 2);
				
				if(data_type == 1) {
	        sample = new Sampling(1);
	      } else
	        if(data_type == 2) {
	        sample = new Sampling(2);
	      }
	      
	      numList = new int[pop_size];
	      charList = new char[pop_size];
				
				if(data_type == 1) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
	        	System.out.println();
	          System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              numList[ctr] = input.nextInt();
	            }catch(InputMismatchException e) {
	            	numList[ctr] = -1;
	              System.out.println("Invalid input! Please try again.");
	            }
	            input.nextLine();
	          }while(numList[ctr] < 1);
	        }
	        
	        sample.Sampling(numList, pop_size);
	      } else 
	        if(data_type == 2) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
                    System.out.println();
                    System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              charList[ctr] = input.next().charAt(0);     
	              if(charList[ctr] >= '0' && charList[ctr] <= '9')
	                throw new Exception();
	            }catch(Exception e) {
	              System.out.println("Invalid input! Please try again.");
	            }
	            
	            input.nextLine();
	          }while(charList[ctr] >= '0' && charList[ctr] <= '9');
	        }
	        sample.Sampling(charList, pop_size);
	      }
	      sample.display();
				
	      System.out.println("\n\n");
				System.out.println("Press ENTER to continue...");
        input.nextLine();
        try{
          Thread.sleep(2000);
        } catch(InterruptedException e) {
          Thread.currentThread().interrupt();
        }
			
        do {
                System.out.println("\n\n");
                System.out.println("********************************");
                System.out.println("**** SYSTEMATIC SAMPLING ****");
                System.out.println("********************************");
                do {
                        System.out.println();
                        System.out.println("Do you want to input sample size?");
                        System.out.println("[1] YES");
                        System.out.println("[2] NO");
                        try {
                                size_choice = input.nextInt();
                        } catch(InputMismatchException e) {
                                size_choice = -1;
                                System.out.println("Invalid input! Please try again.");
                        }
                        input.nextLine();
                } while(size_choice < 1 || size_choice > 2);

                if(size_choice == 1) {
                        do {
                                System.out.println();
                                System.out.println("********************************");
                                System.out.println("Enter the sample size");
                                try {
                                        sample_size = Integer.parseInt(input.nextLine());
                                        break;
                                } catch(NumberFormatException e) {
                                        sample_size = -1;
                                        System.out.println("Invalid input! Please try again.");
                                }
                                input.nextLine();
                        } while(sample_size < pop_size && sample_size < 1);
                }
                else {
                        sample_size = (int) Math.ceil(pop_size * 0.20);
                }

                sample.Systematic(sample_size);

                int choice4 = -1;
          
          do {
          	System.out.println("\n\n");
          	System.out.println("********************************");
            System.out.println("Do you want to display the simualation again?");
            System.out.println("[1] YES");
            System.out.println("[2] NO");
	          try {
              choice4 = input.nextInt();
	          } catch(InputMismatchException e) {
	          	choice4 = -1;
              System.out.println("Invalid input! Please try again.");
	          }
	          input.nextLine();
          } while(choice4 < 1 || choice4 > 2);

          if(choice4 == 2) {
            repeat = 1;
            this.setVisible(false);
             new SampleGUI().setVisible(true);
          }
          else {
            repeat = 0;
          }			
	} while(repeat == 0);
        
        System.out.println("\n\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        Scanner input = new Scanner(System.in);
        Sampling sample = new Sampling();
		
        int choice = -1;
        int pop_size = -1;
        int data_type = -1;
        int size_choice = -1;
        int sample_size = -1;
        int percent = -1;
        int repeat = 0;
		
		
        int[] numList;
        char[] charList;
        
			
                System.out.println();
                do {
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Enter the population size. > ");
                    try {
                            pop_size = Integer.parseInt(input.nextLine());
                            break;
                    } catch(NumberFormatException e) {
                            pop_size = -1;
                            System.out.println("Invalid input! Please try again.");
                    }
                } while(pop_size < 1);

                System.out.println();
                do {
                System.out.println();
                System.out.println("********************************");
                System.out.println("Which of the following data type do you prefer?");
	        System.out.println("[1] NUMERICAL");
	        System.out.println("[2] CHARACTER");
	        try {
                    data_type = input.nextInt();
	        } catch(InputMismatchException e) {
                    data_type = -1;
                    System.out.println("Invalid input! Please try again.");
	        }
	        input.nextLine();
				} while(data_type < 1 || data_type > 2);
				
				if(data_type == 1) {
	        sample = new Sampling(1);
	      } else
	        if(data_type == 2) {
	        sample = new Sampling(2);
	      }
	      
	      numList = new int[pop_size];
	      charList = new char[pop_size];
				
				if(data_type == 1) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
	        	System.out.println();
	          System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              numList[ctr] = input.nextInt();
	            }catch(InputMismatchException e) {
	            	numList[ctr] = -1;
	              System.out.println("Invalid input! Please try again.");
	            }
	            input.nextLine();
	          }while(numList[ctr] < 1);
	        }
	        
	        sample.Sampling(numList, pop_size);
	      } else 
	        if(data_type == 2) {
	        for(int ctr = 0; ctr < pop_size; ctr++) {
                    System.out.println();
                    System.out.println("Sample " + (ctr + 1) + ": ");
	          
	          do{
	            try{
	              charList[ctr] = input.next().charAt(0);     
	              if(charList[ctr] >= '0' && charList[ctr] <= '9')
	                throw new Exception();
	            }catch(Exception e) {
	              System.out.println("Invalid input! Please try again.");
	            }
	            
	            input.nextLine();
	          }while(charList[ctr] >= '0' && charList[ctr] <= '9');
	        }
	        sample.Sampling(charList, pop_size);
	      }
	      sample.display();
				
	      System.out.println("\n\n");
				System.out.println("Press ENTER to continue...");
        input.nextLine();
        try{
          Thread.sleep(2000);
        } catch(InterruptedException e) {
          Thread.currentThread().interrupt();
        }
			
            do{
                System.out.println("\n\n");
                System.out.println("********************************");
                System.out.println("**** STRATIFIED SAMPLING ****");
                System.out.println("********************************");
                System.out.println();
                sample.segregate();
                System.out.println();
                do{
                        System.out.println("");
                        System.out.println("********************************");
                        System.out.println("Enter the sample percentage");
                        try{
                                percent = Integer.parseInt(input.nextLine());
                                break;
                        }catch(NumberFormatException e) {
                                percent = -1;
                                System.out.println("Invalid input! Please try again.");
                        }
                }while(percent < 1 || percent > 100);

                System.out.println("\n\n");
                sample.Stratified(percent);

                int choice4 = -1;
          
          do {
          	System.out.println("\n\n");
          	System.out.println("********************************");
                System.out.println("Do you want to display the simualation again?");
                System.out.println("[1] YES");
                System.out.println("[2] NO");
                try {
                    choice4 = input.nextInt();
                } catch(InputMismatchException e) {
                    choice4 = -1;
                    System.out.println("Invalid input! Please try again.");
                }
                    input.nextLine();
          } while(choice4 < 1 || choice4 > 2);

          if(choice4 == 2) {
            repeat = 1;
            this.setVisible(false);
            new SampleGUI().setVisible(true);
          }
          else {
            repeat = 0;
          }
	}while(repeat == 0);
				
	System.out.println("\n\n");	
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
