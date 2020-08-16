/*
 * Created by JFormDesigner on Sat Aug 15 14:23:00 CEST 2020
 */

package pl.MR.classmanager.view;

import pl.MR.classmanager.model.Student;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();

        //sekcja inicjalizacji zmiennych
        studentForm = new StudentForm(student -> {
            studentListModel.add(0,student);
        });

        // sekcja konfiguracji widoku
        leftPanel.add(studentForm);

        studentListModel = new DefaultListModel<>();
        studentListPanel.setModel(studentListModel);



        // dodanie,żeby można było zaznaczać tylko jednego studenta
        studentListPanel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //dodawanie akcji po wybraniu Studenta z istniejącej listy po prawej stronie
        studentListPanel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                int index = listSelectionEvent.getFirstIndex();
                if (index != -1) {
                    if(studentData == null){
                        studentData = new StudentData();
                        leftPanel.add(studentData);
                        repaint();
                    }
                    Student zaznaczonyStudent = studentListModel.elementAt(index);
                    studentData.setData(zaznaczonyStudent);
                }
            }
        });

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        leftPanel = new JPanel();
        panel2 = new JPanel();
        labelList = new JLabel();
        scrollPane1 = new JScrollPane();
        studentListPanel = new JList();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== leftPanel ========
        {
            leftPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,leftPanel. getBorder( )) ); leftPanel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            leftPanel.setLayout(new GridLayout(2, 1, 1, 1));
        }
        contentPane.add(leftPanel);

        //======== panel2 ========
        {
            panel2.setLayout(new GridBagLayout());
            ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- labelList ----
            labelList.setText("Student List:");
            labelList.setFont(new Font("Calibri Light", Font.BOLD, 18));
            panel2.add(labelList, new GridBagConstraints(0, 0, 1, 1, 0.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(studentListPanel);
            }
            panel2.add(scrollPane1, new GridBagConstraints(0, 1, 1, 1, 0.0, 10.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel leftPanel;
    private JPanel panel2;
    private JLabel labelList;
    private JScrollPane scrollPane1;
    private JList studentListPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private final StudentForm studentForm;
    private StudentData studentData;
    private DefaultListModel<Student> studentListModel;


}
