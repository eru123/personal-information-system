import javax.swing.*;
import java.awt.*;

public class Main {
  private static JFrame frame;
  private static JLabel l_title;
  private static JLabel l_title_pid;
  private static JLabel l_fname;
  private static JLabel l_lname;
  private static JLabel l_mname;
  private static JLabel l_suffix;
  private static JLabel l_address;
  private static JLabel l_ssn;
  private static JLabel l_sex;
  private static JLabel l_bdate;
  private static JLabel l_nationality;

  private static JPanel p_personal_info;
  private static JRadioButton male;
  private static JRadioButton female;
  private static ButtonGroup gender;
  private static JTextField t_fname;
  private static JTextField t_lname;
  private static JTextField t_mname;
  private static JTextField t_suffix;
  private static JTextField t_address;
  private static JTextField t_ssn;
  private static JTextField t_bdate;
  private static JTextField t_nationality;

  private static JButton b_search;
  private static JButton b_add;
  private static JButton b_update;
  private static JButton b_delete;
  private static JButton b_new;

  private static JScrollPane sp_table;
  private static JTable table;
  private static String[] tb_columns = { "SSN", "Name", "Sex", "Nationality", "Birthdate", "Address" };

  public static void main(String[] args) {
    // Initilize variables
    frame = new JFrame();
    p_personal_info = new JPanel();
    male = new JRadioButton();
    female = new JRadioButton();
    gender = new ButtonGroup();
    sp_table = new JScrollPane();
    table = new JTable();

    l_title = new JLabel();
    l_title_pid = new JLabel();
    l_fname = new JLabel();
    l_lname = new JLabel();
    l_mname = new JLabel();
    l_suffix = new JLabel();
    l_address = new JLabel();
    l_ssn = new JLabel();
    l_sex = new JLabel();
    l_bdate = new JLabel();
    l_nationality = new JLabel();

    t_fname = new JTextField();
    t_lname = new JTextField();
    t_mname = new JTextField();
    t_suffix = new JTextField();
    t_address = new JTextField();
    t_ssn = new JTextField();
    t_bdate = new JTextField();
    t_nationality = new JTextField();

    b_search = new JButton();
    b_add = new JButton();
    b_update = new JButton();
    b_delete = new JButton();
    b_new = new JButton();

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    // title
    l_title.setText("Personal Information System");
    frame.getContentPane().add(l_title);
    l_title.setBounds(10, 10, 302, 44);
    l_title.setFont(new Font("Tahoma", 1, 18));

    // title for Personal Information Data
    l_title_pid.setText("Personal Information Data");
    frame.getContentPane().add(l_title_pid);
    l_title_pid.setBounds(15, 330, 302, 44);
    l_title_pid.setFont(new Font("Tahoma", 1, 16));

    // Personal Information Panel
    p_personal_info.setBorder(BorderFactory.createTitledBorder("Personal Information"));
    p_personal_info.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    p_personal_info.setLayout(null);

    // firstname label
    l_fname.setText("First Name:");
    p_personal_info.add(l_fname);
    l_fname.setBounds(10, 30, 80, 20);

    // lastname label
    l_lname.setText("Last Name:");
    p_personal_info.add(l_lname);
    l_lname.setBounds(10, 60, 80, 20);

    // middlename label
    l_mname.setText("Middle Name:");
    p_personal_info.add(l_mname);
    l_mname.setBounds(10, 90, 80, 20);

    // suffix label
    l_suffix.setText("Suffix:");
    p_personal_info.add(l_suffix);
    l_suffix.setBounds(10, 120, 80, 20);

    // address label
    l_address.setText("Address:");
    p_personal_info.add(l_address);
    l_address.setBounds(10, 150, 80, 20);

    // Social Security Number label
    l_ssn.setText("Social Security Number:");
    p_personal_info.add(l_ssn);
    l_ssn.setBounds(10, 180, 150, 20);

    // Gender label
    l_sex.setText("Sex:");
    p_personal_info.add(l_sex);
    l_sex.setBounds(350, 30, 150, 20);

    // Birthday label
    l_bdate.setText("Birth Date:");
    p_personal_info.add(l_bdate);
    l_bdate.setBounds(350, 60, 150, 20);

    // Nationality label
    l_nationality.setText("Nationality:");
    p_personal_info.add(l_nationality);
    l_nationality.setBounds(350, 90, 150, 20);

    // firstname textfield
    t_fname.setText("");
    p_personal_info.add(t_fname);
    t_fname.setBounds(120, 32, 200, 20);

    // lastname textfield
    t_lname.setText("");
    p_personal_info.add(t_lname);
    t_lname.setBounds(120, 62, 200, 20);

    // middlename textfield
    t_mname.setText("");
    p_personal_info.add(t_mname);
    t_mname.setBounds(120, 92, 200, 20);

    // suffix textfield
    t_suffix.setText("");
    p_personal_info.add(t_suffix);
    t_suffix.setBounds(120, 122, 200, 20);

    // address textfield
    t_address.setText("");
    p_personal_info.add(t_address);
    t_address.setBounds(170, 152, 400, 20);

    // Social Security Number textfield
    t_ssn.setText("");
    p_personal_info.add(t_ssn);
    t_ssn.setBounds(170, 182, 280, 20);

    // male radio button
    male.setText("Male");
    p_personal_info.add(male);
    male.setBounds(420, 32, 75, 20);

    // female radio button
    female.setText("Female");
    p_personal_info.add(female);
    female.setBounds(495, 32, 75, 20);

    // gender button group
    gender.add(male);
    gender.add(female);

    // birthday textfield
    t_bdate.setText("");
    p_personal_info.add(t_bdate);
    t_bdate.setBounds(420, 62, 150, 20);

    // nationality text field
    t_nationality.setText("");
    p_personal_info.add(t_nationality);
    t_nationality.setBounds(420, 92, 150, 20);

    // search button
    b_search.setText("Search");
    p_personal_info.add(b_search);
    b_search.setBounds(470, 180, 100, 25);

    // add button
    b_add.setText("Add");
    frame.getContentPane().add(b_add);
    b_add.setBounds(15, 300, 100, 25);

    // update button
    b_update.setText("Update");
    frame.getContentPane().add(b_update);
    b_update.setBounds(130, 300, 100, 25);

    // delete button
    b_delete.setText("Delete");
    frame.getContentPane().add(b_delete);
    b_delete.setBounds(245, 300, 100, 25);

    // new button
    b_new.setText("New");
    frame.getContentPane().add(b_new);
    b_new.setBounds(360, 300, 100, 25);

    // Personal Information Panel to Frame
    frame.getContentPane().add(p_personal_info);
    p_personal_info.setBounds(10, 60, 580, 220);

    // table
    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
        }, tb_columns));

    // table scrollpane
    sp_table.setViewportView(table);
    frame.getContentPane().add(sp_table);
    sp_table.setBounds(10, 370, 580, 180);

    frame.pack();
    frame.setVisible(true);
    frame.setSize(615, 600);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Personal Information System");
  }
}