
package qgms;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AddQestionForm {
    public static void main(String []args){
        
//        JFrame
JFrame frame=new JFrame();
frame.setTitle("QGMS - Add Question Form");
frame.setSize(1100,900);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setLayout(null);
frame.getContentPane().setBackground(new Color(245,247,252));

//Color
Color purpleColor=new Color(70,58,196);
Color darkPurple=new Color(31,51,115);
Color lightBlue=new Color(240,244,255);

//Question List
ArrayList<Question> questions=new ArrayList<>();
int[] currentQuestionIndex={-1};

//Main Panel
JPanel sidebarPanel=new JPanel();
sidebarPanel.setBounds(20,15,165,635);
sidebarPanel.setLayout(null);
sidebarPanel.setBackground(purpleColor);

JPanel headerPanel=new JPanel();
headerPanel.setBounds(185,15,945,95);
headerPanel.setLayout(null);
headerPanel.setBackground(purpleColor);

JPanel formPanel=new JPanel();
formPanel.setBounds(195,120,925,525);
formPanel.setLayout(null);
formPanel.setBackground(Color.WHITE);
formPanel.setBorder(BorderFactory.createLineBorder(Color.black));

//Logo
JLabel logoLabel=new JLabel("QGMS");
logoLabel.setBounds(25,35,1110,40);
logoLabel.setFont(new Font("Arail",Font.BOLD,25));
logoLabel.setBackground(Color.white);
logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

JLabel logoDescription=new JLabel("Quiz Management");
logoDescription.setBounds(15,75,135,25);
logoDescription.setFont(new Font("Arail",Font.PLAIN,10));
logoDescription.setForeground(Color.white);

//Header Label
JLabel titleLabel=new JLabel("Add Question Form");
titleLabel.setBounds(90,25,300,35);
titleLabel.setFont(new Font("Arail",Font.BOLD,22));
titleLabel.setForeground(Color.white);

JLabel teacherIcon=new JLabel("");
teacherIcon.setBounds(730,20,40,40);
teacherIcon.setFont(new Font("Arial",Font.BOLD,30));
teacherIcon.setForeground(Color.black);

JLabel teacherNameLabel=new JLabel("Hamid Momand");
teacherNameLabel.setBounds(775,25,160,30);
teacherNameLabel.setFont(new Font("Arial",Font.BOLD,18));
teacherNameLabel.setForeground(Color.white);

JLabel teacherArrowLabel=new JLabel("⌄");
teacherArrowLabel.setBounds(930,20,20,30);
teacherArrowLabel.setFont(new Font("Arial",Font.BOLD,20));
teacherArrowLabel.setForeground(Color.black);

//Siderbar Button
JButton dashboardButton=new JButton("Dashboard");
dashboardButton.setBounds(4,145,150,40);
//dashboardButton.setIcon(new ImageIcon(AddQestionForm.class.getResource(
//        "/qgms/ui/icons/dashboard.png")));
//dashboardButton.setHorizontalAlignment(SwingConstants.LEFT);
//dashboardButton.setIconTextGap(10);
dashboardButton.setForeground(Color.white);
dashboardButton.setFont(new Font("Arail",Font.BOLD,12));
dashboardButton.setFocusPainted(false);
dashboardButton.setBorderPainted(false);
dashboardButton.setBackground(purpleColor);


JButton addQuestionSideButton=new JButton("Add Question");
addQuestionSideButton.setBounds(4,195,150,40);
//addQuestionSideButton.setIcon(new ImageIcon(AddQestionForm.class.getResource(
//        "/qgms/ui/icons/add Question.png")));
//addQuestionSideButton.setHorizontalAlignment(SwingConstants.LEFT);
//addQuestionSideButton.setIconTextGap(10);
addQuestionSideButton.setBackground(darkPurple);
addQuestionSideButton.setForeground(Color.white);
addQuestionSideButton.setFont(new Font("Arial",Font.BOLD,12));
addQuestionSideButton.setFocusPainted(false);
addQuestionSideButton.setBorderPainted(false);

JButton viewQuestionSideButton=new JButton("View Question");
viewQuestionSideButton.setBounds(4,245,155,40);
//viewQuestionSideButton.setIcon(new ImageIcon(AddQestionForm.class.getResource(
//        "/qgms/ui/icons/view Question.png")));
//viewQuestionSideButton.setIconTextGap(10);
viewQuestionSideButton.setBackground(purpleColor);
viewQuestionSideButton.setForeground(Color.white);
viewQuestionSideButton.setFont(new Font("Arial",Font.BOLD,12));
viewQuestionSideButton.setFocusPainted(false);
viewQuestionSideButton.setBorderPainted(false);

JButton gradeAnswersButton=new JButton("Grade Answers");
gradeAnswersButton.setBounds(4,295,160,40);
//gradeAnswersButton.setIcon(new ImageIcon(AddQestionForm.class.getResource(
//        "/qgms/ui/icons/grade Answer.png")));
//gradeAnswersButton.setIconTextGap(10);
gradeAnswersButton.setBackground(purpleColor);
gradeAnswersButton.setForeground(Color.white);
gradeAnswersButton.setFont(new Font("Arial",Font.BOLD,12));
gradeAnswersButton.setFocusPainted(false);
gradeAnswersButton.setBorderPainted(false);

JButton viewResultButton=new JButton("View Results");
viewResultButton.setBounds(4,345,150,40);
//viewResultButton.setIcon(new ImageIcon(AddQestionForm.class.getResource(
//        "/qgms/ui/icons/view Result.png")));
//viewResultButton.setIconTextGap(10);
viewResultButton.setBackground(purpleColor);
viewResultButton.setForeground(Color.white);
viewResultButton.setFont(new Font("Arial",Font.BOLD,12));
viewResultButton.setFocusPainted(false);
viewResultButton.setBorderPainted(false);

//Question Type Label and ComboBox

JLabel questionTypeLabel=new JLabel("Question Type:");
questionTypeLabel.setFont(new Font("Arial",Font.BOLD,13));
questionTypeLabel.setBounds(30,25,110,30);

JComboBox<String> questionTypeComboBox=new JComboBox<>(
new String []{"-- Select Question Type --",
    "MCQ ( Multi Choice",
    "Short Answer","Descriptive"}
        
);
questionTypeComboBox.setBounds(145,23,250,35);
questionTypeComboBox.setFont(new Font("Arial",Font.BOLD,12));

//Marks
JLabel marksLabel=new JLabel("Marks:");
marksLabel.setBounds(690,25,60,30);
marksLabel.setFont(new Font("Arial",Font.BOLD,13));

JTextField marksField=new JTextField();
marksField.setBounds(745,23,80,35);

//Qution Text
JLabel questionTextLabel=new JLabel("Question Text:");
questionTextLabel.setFont(new Font("Arial",Font.BOLD,13));
questionTextLabel.setBounds(30,75,120,30);

JTextArea questionTextArea=new JTextArea();
questionTextArea.setLineWrap(true);
questionTextArea.setWrapStyleWord(true);
questionTextArea.setFont(new Font("Arial",Font.PLAIN,13));

JScrollPane questionScrollPane = new JScrollPane(questionTextArea);
questionScrollPane.setBounds(30,108,795,85);

//Option A
JLabel optionALabel=new JLabel("Option A:");
optionALabel.setFont(new Font("Arial",Font.BOLD,13));
optionALabel.setBounds(30,210,80,30);

JTextField optionAField=new JTextField();
optionAField.setBounds(115,205,400,34);

//Option B
JLabel optionBLabel=new JLabel("Option B:");
optionBLabel.setFont(new Font("Arial",Font.BOLD,13));
optionBLabel.setBounds(30,252,80,30);

JTextField optionBField=new JTextField();
optionBField.setBounds(115,247,400,34);

//Option C
JLabel optionCLabel=new JLabel("Option C:");
optionCLabel.setFont(new Font("Arial",Font.BOLD,13));
optionCLabel.setBounds(30,294,80,30);

JTextField optionCField=new JTextField();
optionCField.setBounds(115,289,400,34);

//Option D
JLabel optionDLabel=new JLabel("Option D:");
optionDLabel.setFont(new Font("Arial",Font.BOLD,13));
optionDLabel.setBounds(30,336,80,30);

JTextField optionDField=new JTextField();
optionDField.setBounds(115,331,400,34);

//correct Answer Panel
JPanel correctAnswerPanel=new JPanel();
correctAnswerPanel.setBounds(550,205,275,160);
correctAnswerPanel.setLayout(null);
correctAnswerPanel.setBackground(lightBlue);

JLabel correctAnswerLabel=new JLabel("Correct Answer:");
correctAnswerLabel.setFont(new Font("Arial",Font.BOLD,13));
correctAnswerLabel.setBounds(20,10,150,25);
correctAnswerLabel.setForeground(new Color(25,50,110));

//Radio Button
JRadioButton radioA=new JRadioButton("A");
radioA.setBackground(lightBlue);
radioA.setBounds(15,40,100,25);

JRadioButton radioB=new JRadioButton("B");
radioB.setBackground(lightBlue);
radioB.setBounds(15,67,100,25);

JRadioButton radioC=new JRadioButton("C");
radioC.setBackground(lightBlue);
radioC.setBounds(135,40,100,25);

JRadioButton radioD=new JRadioButton("D");
radioD.setBackground(lightBlue);
radioD.setBounds(135,67,100,25);

//Button Group
ButtonGroup correctAnswerGroup=new ButtonGroup();

correctAnswerGroup.add(radioA);
correctAnswerGroup.add(radioB);
correctAnswerGroup.add(radioC);
correctAnswerGroup.add(radioD);

//Question Number
JLabel questionNumberLabel=new JLabel("New Question");
questionNumberLabel.setFont(new Font("Arial",Font.BOLD,13));
questionNumberLabel.setBounds(30,390,150,30);

//Navigation Button
JButton previousButton=new JButton("Previous");
previousButton.setBounds(190,390,90,30);

JButton newQuestionButton=new JButton("New Question");
newQuestionButton.setBounds(290,390,120,30);


JButton nextButton=new JButton("Next");
nextButton.setBounds(420,390,75,30);

JButton viewQuestionButton=new JButton("View Question");
viewQuestionButton.setBounds(505,390,130,30);

//Main Button
JButton saveButton=new JButton("Save Question");
saveButton.setBounds(300,460,150,35);
saveButton.setFont(new Font("Arial",Font.BOLD,13));


JButton clearButton=new JButton("Clear");
clearButton.setBounds(460,460,100,35);
clearButton.setFont(new Font("Arial",Font.BOLD,13));


JButton backButton=new JButton("Back");
backButton.setBounds(570,460,100,35);
backButton.setFont(new Font("Arial",Font.BOLD,13));

//Question Type event
    questionTypeComboBox.addActionListener(e->{
    String type=(String)questionTypeComboBox.getSelectedItem();
    boolean isMCQ="MCQ ( Multi Choice".equals(type);
    if(isMCQ){
//        Enable option Labels
        optionALabel.setEnabled(true);
        optionBLabel.setEnabled(true);
        optionCLabel.setEnabled(true);
        optionDLabel.setEnabled(true);
        
//        Enable option Fields
        optionAField.setEnabled(true);
        optionBField.setEnabled(true);
        optionCField.setEnabled(true);
        optionDField.setEnabled(true);
        
//        Enable correct Answer
        correctAnswerPanel.setEnabled(true);
        correctAnswerLabel.setEnabled(true);
        
        radioA.setEnabled(true);
        radioB.setEnabled(true);
        radioC.setEnabled(true);
        radioD.setEnabled(true);
       
    }else{
//        Disable option Labels
       optionALabel.setEnabled(false);
       optionBLabel.setEnabled(false);
       optionCLabel.setEnabled(false);
       optionDLabel.setEnabled(false); 
        
//       Disable option Fields
       optionAField.setEnabled(false);
       optionBField.setEnabled(false);
       optionCField.setEnabled(false);
       optionDField.setEnabled(false);
       
//       Disable correct Answer
       correctAnswerPanel.setEnabled(false);
       correctAnswerLabel.setEnabled(false);
        
       radioA.setEnabled(false);
       radioB.setEnabled(false);
       radioC.setEnabled(false);
       radioD.setEnabled(false);
       
//       Clear MCQ Fields
       optionAField.setText("");
       optionBField.setText("");
       optionCField.setText("");
       optionDField.setText("");
       
       correctAnswerGroup.clearSelection();
    }
    
    });
    
//    Save Question
saveButton.addActionListener(e->{
if(questionTypeComboBox.getSelectedIndex()== 0){
    JOptionPane.showMessageDialog(frame, "Question type is required!");
    questionTypeComboBox.requestFocus();
    return;
}
String type=questionTypeComboBox.getSelectedItem().toString();

// Question text
String questionText=questionTextArea.getText().trim();
if(questionText.isEmpty()){
    JOptionPane.showMessageDialog(frame, "Question text is required!");
    questionTextArea.requestFocus();
    return;
}
// Marks
String marksText=marksField.getText().trim();
if(marksText.isEmpty()){
    JOptionPane.showMessageDialog(frame, "Marks are required!");
    marksField.requestFocus();
    return;
}
int marks;
try{
    marks=Integer.parseInt(marksText);
}catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(frame, "Marks must be a number!");
    marksField.requestFocus();
    return;
}
//Marks Greater Than 0
if(marks<=0){
    JOptionPane.showMessageDialog(frame, "Marks must be greater than 0!");
    marksField.requestFocus();
    return;

}
//Variables for MCQ
String optionA="";
String optionB="";
String optionC="";
String optionD="";
String correctAnswer="";

//MCQ Validation
if("MCQ ( Multi Choice".equals(type)){
    optionA=optionAField.getText().trim();
    optionB=optionBField.getText().trim();
    optionC=optionCField.getText().trim();
    optionD=optionDField.getText().trim();
    
    if(optionA.isEmpty()){
        JOptionPane.showMessageDialog(frame, "option A is required!");
        optionAField.requestFocus();
        return;
    }
    if(optionB.isEmpty()){
        JOptionPane.showMessageDialog(frame, "option B is required!");
        optionBField.requestFocus();
        return;
    }
    if(optionC.isEmpty()){
        JOptionPane.showMessageDialog(frame, "option C is required!");
        optionCField.requestFocus();
        return;
    }
    if(optionD.isEmpty()){
        JOptionPane.showMessageDialog(frame, "option D is required!");
        optionDField.requestFocus();
        return;
    }
//    correct Answer
if(radioA.isSelected()){
    correctAnswer="A";
}else if(radioB.isSelected()){
    correctAnswer="B";
}else if(radioC.isSelected()){
    correctAnswer="C";
}else if(radioD.isSelected()){
    correctAnswer="D";
}else{
    JOptionPane.showMessageDialog(frame, "correct answer is required!");
    return;
}

}
//Create Question object
int questionNumber=questions.size()+1;
Question question=new Question(
        type,
        questionText,
        marks,
        optionA,
        optionB,
        optionC,
        optionD,
        correctAnswer
);
//add Question to arraylist
questions.add(question);

//update question number
currentQuestionIndex[0]=questions.size()-1;
questionNumberLabel.setText("Question"+questions.size()+
        "of"+questions.size()
        );
//success mesage
JOptionPane.showMessageDialog(frame, "Question"+questions.size()+"added successfully!");

//Clear Fields for New Question
questionTextArea.setText("");

marksField.setText("10");

optionAField.setText("");
optionBField.setText("");
optionCField.setText("");
optionDField.setText("");
correctAnswerGroup.clearSelection();

//New Question Mode
currentQuestionIndex[0]=-1;
questionNumberLabel.setText("New Question");

});

//Clear Button
clearButton.addActionListener(e->{
    
questionTextArea.setText("");

marksField.setText("10");

optionAField.setText("");
optionBField.setText("");
optionCField.setText("");
optionDField.setText("");

correctAnswerGroup.clearSelection();
questionTypeComboBox.setSelectedIndex(0);
currentQuestionIndex[0]=-1;
questionNumberLabel.setText("New Question");
});

//New Question Button
newQuestionButton.addActionListener(e->{
    
questionTextArea.setText("");

marksField.setText("10");

optionAField.setText("");
optionBField.setText("");
optionCField.setText("");
optionDField.setText("");
correctAnswerGroup.clearSelection();
questionTypeComboBox.setSelectedIndex(0);
currentQuestionIndex[0]=-1;
questionNumberLabel.setText("New Question");
});

//previous Button
previousButton.addActionListener(e->{
if(questions.isEmpty()){
    JOptionPane.showMessageDialog(frame, "No questions have been added yet.");
    return;
}
if(currentQuestionIndex[0]==-1){
    currentQuestionIndex[0]=questions.size()-1;
}else if(currentQuestionIndex[0]>0){
    currentQuestionIndex[0]--;
}else{
    JOptionPane.showMessageDialog(frame, "This is first question.");
    return;
}
//Load Question
Question question=questions.get(currentQuestionIndex[0]);

questionTypeComboBox.setSelectedItem(question.type);

marksField.setText(String.valueOf(question.marks));

questionTextArea.setText(question.text);

optionAField.setText(question.optionA);
optionBField.setText(question.optionB);
optionCField.setText(question.optionC);
optionDField.setText(question.optionD);

correctAnswerGroup.clearSelection();

if("A".equals(question.correctAnswer)){
    radioA.setSelected(true);
}else if("B".equals(question.correctAnswer)){
    radioB.setSelected(true);
}else if("C".equals(question.correctAnswer)){
    radioC.setSelected(true);
}else if("D".equals(question.correctAnswer)){
    radioD.setSelected(true);
}
       questionNumberLabel.setText("Question"+
               (currentQuestionIndex[0]+1)+"of"+questions.size()
               );

});
//Next Button
nextButton.addActionListener(e->{
if(questions.isEmpty()){
    JOptionPane.showMessageDialog(frame, "No questions have been added yet.");
    return;
}
if(currentQuestionIndex[0]<questions.size()-1){
    currentQuestionIndex[0]++;
}else{
    JOptionPane.showMessageDialog(frame, "This is the last question.");
    return;
}


//Load Question
Question question=questions.get(currentQuestionIndex[0]);
questionTypeComboBox.setSelectedItem(question.type);

marksField.setText(String.valueOf(question.marks));

questionTextArea.setText(question.text);

optionAField.setText(question.optionA);
optionBField.setText(question.optionB);
optionCField.setText(question.optionC);
optionDField.setText(question.optionD);

correctAnswerGroup.clearSelection();

if("A".equals(question.correctAnswer)){
    radioA.setSelected(true);
}else if("B".equals(question.correctAnswer)){
    radioB.setSelected(true);
}else if("C".equals(question.correctAnswer)){
    radioC.setSelected(true);
}else if("D".equals(question.correctAnswer)){
    radioD.setSelected(true);
}
       questionNumberLabel.setText("Question"+
               (currentQuestionIndex[0]+1)+"of"+questions.size()
               );
});
//View Questions Button
viewQuestionButton.addActionListener(e->{
if(questions.isEmpty()){
    JOptionPane.showMessageDialog(frame, "No questions have been added yet.");
    return;
}
//Tabel columns
String []columns={
    "ID",
    "Question Type",
    "Question Text",
    "Marks",
    "Correct Answer"};

DefaultTableModel model=new DefaultTableModel(columns,0);
//add Question to table
for(int i=0; i<questions.size(); i++){
    Question question=questions.get(i);
    
    model.addRow(new Object[]{
        i+1,
        question.type,
        question.text,
        question.marks,
        question.correctAnswer
        
    }
    );
}

JTable table=new JTable(model);
table.setRowHeight(30);

JScrollPane tableScrollPane=new JScrollPane(table);
tableScrollPane.setPreferredSize(new java.awt.Dimension(750,350));
JOptionPane.showMessageDialog(frame, tableScrollPane,"View Questions",JOptionPane.PLAIN_MESSAGE);

});
//Back Button
backButton.addActionListener(e->{
int result=JOptionPane.showConfirmDialog(frame, "Are you sure you want to go to back?","Back",
        JOptionPane.YES_NO_OPTION
        );
if(result==JOptionPane.YES_NO_OPTION){
    frame.dispose();
}

});
//ADD COMPONENTS TO SIDEBAR
sidebarPanel.add(logoLabel);
sidebarPanel.add(logoDescription);

sidebarPanel.add(dashboardButton);
sidebarPanel.add(addQuestionSideButton);
sidebarPanel.add(viewQuestionSideButton);
sidebarPanel.add(gradeAnswersButton);
sidebarPanel.add(viewResultButton);

//ADD COMPONENTS TO HEADER
headerPanel.add(titleLabel);
headerPanel.add(teacherIcon);
headerPanel.add(teacherNameLabel);
headerPanel.add(teacherArrowLabel);

//ADD COMPONENTS TO CORRECT ANSWER PANEL
correctAnswerPanel.add(correctAnswerLabel);

correctAnswerPanel.add(radioA);
correctAnswerPanel.add(radioB);
correctAnswerPanel.add(radioC);
correctAnswerPanel.add(radioD);

//ADD COMPONENTS TO FORAM
formPanel.add(questionTypeLabel);
formPanel.add(questionTypeComboBox);

//Question Type
formPanel.add(questionTypeLabel);
formPanel.add(questionTypeComboBox);

//Marks
formPanel.add(marksLabel);
formPanel.add(marksField);

//Question Text
formPanel.add(questionScrollPane);
formPanel.add(questionTextLabel);

//option A
formPanel.add(optionALabel);
formPanel.add(optionAField);

//optoin B
formPanel.add(optionBLabel);
formPanel.add(optionBField);

//optoin C
formPanel.add(optionCLabel);
formPanel.add(optionCField);

//optoin D
formPanel.add(optionDLabel);
formPanel.add(optionDField);

//correct Answer
formPanel.add(correctAnswerPanel);

//Question Navigation
formPanel.add(questionNumberLabel);

formPanel.add(previousButton);
formPanel.add(newQuestionButton);
formPanel.add(nextButton);
formPanel.add(viewQuestionButton);

//Main Button
formPanel.add(saveButton);
formPanel.add(clearButton);
formPanel.add(backButton);

//ADD MAIN PANELS TO FRAME
frame.add(sidebarPanel);
frame.add(headerPanel);
frame.add(formPanel);



//show JFrame
frame.setVisible(true);
  
    }
//    add question class
    static class Question{
        String type;
        String text;
        int marks;
        String optionA;
        String optionB;
        String optionC;
        String optionD;
        String correctAnswer;
        Question(
        String type,String text, int marks,
        String optionA, String optionB,
        String optionC, String optionD,
        String correctAnswer
        ){
            this.type=type;
            this.text=text;
            this.marks=marks;
            this.optionA=optionA;
            this.optionB=optionB;
            this.optionC=optionC;
            this.optionD=optionD;
            this.correctAnswer=correctAnswer;
        }
    }
    
}
