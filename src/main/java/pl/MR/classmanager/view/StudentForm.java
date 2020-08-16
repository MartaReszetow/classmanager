/*
 * Created by JFormDesigner on Sun Aug 16 14:07:50 CEST 2020
 */

package pl.MR.classmanager.view;

import pl.MR.classmanager.interfejces.INewStudentFormSubmittedListener;
import pl.MR.classmanager.model.Gender;
import pl.MR.classmanager.model.Student;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentForm extends JPanel {

    private INewStudentFormSubmittedListener newStudentListener;


    public StudentForm(INewStudentFormSubmittedListener listener) {
        this.newStudentListener = listener;
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


        buttonSubmit.addActionListener(actionEvent -> {
            Student student = new Student();
            student.setName(textFieldName.getText());
            student.setLastName(textFieldLastName.getText());
            student.setQuarantined(checkBoxQuarqantined.isSelected());
            student.setYearBorn((Integer) spinnerYearBorn.getValue());
            student.setGender((Gender) comboBoxGender.getSelectedItem());
            if (newStudentListener != null) {
                newStudentListener.studentCreated(student);
            }
            clearForm();
        });


    }

    // dodajemy metodę czyszczącą formularz po submitowaniu
    void clearForm() {
        textFieldName.setText("");
        textFieldLastName.setText("");
        checkBoxQuarqantined.setSelected(false);
        spinnerYearBorn.setValue(LocalDate.now().getYear());
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
        vSpacer10 = new JPanel(null);
        buttonSubmit = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
        javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
        . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
        .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans.
        PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
        equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new GridLayout(7, 2));

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
        add(vSpacer10);

        //---- buttonSubmit ----
        buttonSubmit.setText("Submit");
        add(buttonSubmit);
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
    private JPanel vSpacer10;
    private JButton buttonSubmit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
