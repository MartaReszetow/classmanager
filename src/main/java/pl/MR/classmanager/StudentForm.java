/*
 * Created by JFormDesigner on Sun Aug 16 14:07:50 CEST 2020
 */

package pl.MR.classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentForm extends JPanel  {
    public StudentForm() {
        initComponents();

        Gender[] genders = Gender.values(); // pobierz wartości z enuma
        for (Gender gender : genders
        ) {
            comboBoxGender.addItem(gender);
        }

        // Prepare spinner Year Born
        spinnerYearBorn.setModel(spinnerNumberModel);

// tu doszlifowujemy dane pobierane z formularza
        // Prepare Combobox with availavle options (ENUM Gender)







    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        labelHeadlineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        textFieldName = new JTextField();
        labelLastName = new JLabel();
        textFieldLastName = new JTextField();
        labelGender = new JLabel();
        comboBoxGender = new JComboBox();
        labelQuarantined = new JLabel();
        checkBoxQuarqantined = new JCheckBox();
        labelYearBorm = new JLabel();
        spinnerYearBorn = new JSpinner();
        vSpacer4 = new JPanel(null);
        vSpacer8 = new JPanel(null);
        buttonSubmit = new JButton();
        vSpacer10 = new JPanel(null);
        vSpacer12 = new JPanel(null);
        vSpacer2 = new JPanel(null);
        vSpacer6 = new JPanel(null);
        vSpacer1 = new JPanel(null);
        vSpacer7 = new JPanel(null);
        vSpacer9 = new JPanel(null);
        vSpacer13 = new JPanel(null);
        vSpacer11 = new JPanel(null);

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
        new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
        , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
        , java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new GridLayout(12, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Form:");
        labelHeadlineForm.setFont(new Font("Calibri Light", labelHeadlineForm.getFont().getStyle(), labelHeadlineForm.getFont().getSize() + 8));
        add(labelHeadlineForm);
        add(hSpacer1);

        //---- labelName ----
        labelName.setText("Name:");
        labelName.setFont(new Font("Calibri Light", Font.PLAIN, 14));
        add(labelName);
        add(textFieldName);

        //---- labelLastName ----
        labelLastName.setText("Last name:");
        labelLastName.setFont(new Font("Calibri Light", Font.PLAIN, 14));
        add(labelLastName);
        add(textFieldLastName);

        //---- labelGender ----
        labelGender.setText("Gender:");
        labelGender.setFont(new Font("Calibri Light", Font.PLAIN, 14));
        add(labelGender);
        add(comboBoxGender);

        //---- labelQuarantined ----
        labelQuarantined.setText("Quarantined:");
        labelQuarantined.setFont(new Font("Calibri Light", Font.PLAIN, 14));
        add(labelQuarantined);
        add(checkBoxQuarqantined);

        //---- labelYearBorm ----
        labelYearBorm.setText("Year born:");
        labelYearBorm.setFont(new Font("Calibri Light", Font.PLAIN, 14));
        add(labelYearBorm);
        add(spinnerYearBorn);
        add(vSpacer4);
        add(vSpacer8);

        //---- buttonSubmit ----
        buttonSubmit.setText("Submit");
        add(buttonSubmit);
        add(vSpacer10);
        add(vSpacer12);
        add(vSpacer2);
        add(vSpacer6);
        add(vSpacer1);
        add(vSpacer7);
        add(vSpacer9);
        add(vSpacer13);
        add(vSpacer11);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelGender;
    private JComboBox comboBoxGender;
    private JLabel labelQuarantined;
    private JCheckBox checkBoxQuarqantined;
    private JLabel labelYearBorm;
    private JSpinner spinnerYearBorn;
    private JPanel vSpacer4;
    private JPanel vSpacer8;
    private JButton buttonSubmit;
    private JPanel vSpacer10;
    private JPanel vSpacer12;
    private JPanel vSpacer2;
    private JPanel vSpacer6;
    private JPanel vSpacer1;
    private JPanel vSpacer7;
    private JPanel vSpacer9;
    private JPanel vSpacer13;
    private JPanel vSpacer11;
    private SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(),1);



            // JFormDesigner - End of variables declaration  //GEN-END:variables

}
