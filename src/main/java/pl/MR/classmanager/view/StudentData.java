/*
 * Created by JFormDesigner on Sun Aug 16 15:36:12 CEST 2020
 */

package pl.MR.classmanager.view;

import pl.MR.classmanager.model.Gender;
import pl.MR.classmanager.model.Student;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentData extends JPanel {
    public StudentData() {
        initComponents();

        Gender[] genders = Gender.values(); // pobierz wartości z enuma
        for (Gender gender : genders
        ) {
            comboBoxGender.addItem(gender);
        }


        // Prepare spinner Year Born
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(),1)
);

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
        buttonSave = new JButton();
        buttonDelete = new JButton();

        //======== this ========
        setBackground(Color.lightGray);
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new GridLayout(7, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Data:");
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

        //---- buttonSave ----
        buttonSave.setText("SAVE");
        buttonSave.setBackground(new Color(0, 153, 0));
        buttonSave.setForeground(new Color(0, 153, 0));
        buttonSave.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(buttonSave);

        //---- buttonDelete ----
        buttonDelete.setText("DELETE");
        buttonDelete.setBackground(new Color(255, 51, 51));
        buttonDelete.setForeground(new Color(255, 102, 102));
        buttonDelete.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(buttonDelete);
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
    private JButton buttonSave;
    private JButton buttonDelete;

    public void setData(Student zaznaczonyStudent) {

        textFieldName.setText(zaznaczonyStudent.getName());
        textFieldLastName.setText(zaznaczonyStudent.getLastName());
        //TODO: GENDER
        //comboBoxGender;
        checkBoxQuarqantined.setSelected(zaznaczonyStudent.isQuarantined());
        spinnerYearBorn.setValue(zaznaczonyStudent.getYearBorn());

    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
